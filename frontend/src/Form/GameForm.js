import React, {Component} from 'react';
import axios from "axios";
import './GameForm.css';
import Result from "../Result/Result";

class GameForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            swapDoor: false,
        };
    }

    handleChange = (event) => {
        this.setState({[event.target.name]: event.target.value});
    }

    toggleCheckbox = () => {
        this.setState({swapDoor: !this.state.swapDoor});
    }

    handleSubmit = (event) => {
        axios.post(`/play`, this.state)
            .then(res => {
                if (res.status === 200) {
                    this.setState({result: res.data});
                } else {
                    // Error handling of bad status codes goes here
                }
            })
            .catch(res => {
                // Error handling of bad responses goes here
            });

        event.preventDefault();
    }

    render() {
        return (
            <div>
                <form className="GameForm" onSubmit={this.handleSubmit}>
                    <h1>Enjoy the simulation...</h1>
                    <p>Number of rounds to simulate:
                        <input required={true} type="number" min="1" name="numberOfRounds"
                               onChange={this.handleChange}/>
                    </p>
                    <p> Swap doors before final decision?
                        <input type="checkbox" defaultChecked={false} name="swapDoor"
                               onChange={this.toggleCheckbox}/>
                    </p>
                    <input type="submit" value="Submit"/>
                </form>
                {this.state.result && <Result result={this.state.result}/>}
            </div>
        );
    }
}

export default GameForm;