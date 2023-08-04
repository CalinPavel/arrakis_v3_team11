import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from 'react-router-dom';
import * as bs from 'bootstrap/dist/css/bootstrap.css'
import Login from './components/Login';
import HomePage from './components/HomePage';
import { Route, Routes } from 'react-router-dom';
// import * as bst from 'bootstrap/dist/css/bootstrap-theme.css'

const root = ReactDOM.render(
  
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

root.render(
  <React.StrictMode>
    <BrowserRouter>
        <App/>
    </BrowserRouter>  
  </React.StrictMode>
);
