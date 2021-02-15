import React, { Component } from "react";
import './Result.css';

export default class Result extends Component {
    render() {
        return (
            <div className="Result">
                <h1>Result:</h1>
                <p>Rounds played: {this.props.result.numberOfRounds}</p>
                <p>Rounds won: {this.props.result.numberOfWins} </p>
                <p>Win percentage: {this.props.result.percentageWon} %</p>
            </div>
        );
    }
}