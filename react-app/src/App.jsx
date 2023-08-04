import React from "react";
import { Bond } from "./components/bonds/Bond";
import { AllBonds } from "./components/bonds/AllBonds";
import HomePage from "./components/HomePage";
import Navbar from "./components/NavBar";
import Login from "./components/Login";
import Trades from "./components/trades/Trades";

const App = () => {
  // return <Bond bondData={bondDataExample}/>;
  return (
    <div>
      <Navbar />
      <HomePage />
      <Login />

    </div>
  )
}

export default App;

