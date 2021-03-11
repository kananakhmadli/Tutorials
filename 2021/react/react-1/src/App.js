import React, { Component } from 'react';
import './App.css';
import Navbar from './components/Navbar'
import User from './components/User';

class App extends Component {
  render() {
    return (
      <div className="container">
        <Navbar title="Key is called"></Navbar>
        <User name="Kanan" surname="Akhmadli"></User>

      </div>
    )

  }
}

export default App;
