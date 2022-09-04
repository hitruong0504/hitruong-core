import logo from './logo.svg';
import './App.css';
import React, { Component } from 'react';

// cach so 1 de dinh nghia component
function One() {
  return <div> Cach so 1</div>;
}

var Two = function () {
  return (
    <div>
      <h1>Cach so <bold>2</bold></h1>
    </div>
  );
}

class Four extends Component {
  render() {
    return (
      <div>
        <h4>Four</h4>
      </div>
    );
  }
}



function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div>
          Welcome to React Native
        </div>
        <One />
        <Two />
        <hr />
        <Four />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
