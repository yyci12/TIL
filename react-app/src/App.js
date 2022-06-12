import './App.css';
import { Component } from 'react';

class App extends Component{
  render(){
    return (
      <div className="App">
        <Subject></Subject>
        <Nav></Nav>
      </div>
    );
  }
}
class Subject extends Component{
  render(){
    return(
      <header>
        <h1>WEB</h1>
        <b>world wide web</b>
      </header>
    );
  }
}

class Nav extends Component{
  render(){
    return(
      <nav>
        <ul>
          <li><a href="1.html">HTML</a></li>
          <li><a href="2.html">CSS</a></li>
          <li><a href="3.html">html</a></li>
        </ul>
      </nav>
    );
  }
}

export default App;
