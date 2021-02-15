import React from 'react';
import monty from './monty.jpg';
import './App.css';
import BackendHealth from './BackendHealth/BackendHealth';
import GameForm from "./Form/GameForm";

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <BackendHealth/>
                <img src={monty} className="App-monty" alt="logo"/>
                <h1 className="App-title">Welcome to the Monty Hall Simulator</h1>
            </header>
            <GameForm/>
        </div>
    );
}

export default App;
