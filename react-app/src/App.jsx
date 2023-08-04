import React from "react";
import { Bond } from "./components/bonds/Bond";
import { AllBonds } from "./components/bonds/AllBonds";
import HomePage from "./components/HomePage";
import Navbar from "./components/NavBar";
import Login from "./components/Login";
import Trades from "./components/trades/Trades";
import { Route, Routes } from "react-router-dom";

const App = () => {
  // return <Bond bondData={bondDataExample}/>;
  return (
    <>
    <div>
      {/* <Navbar />
      <HomePage /> */}
      {/* <Login /> */}
    </div>

    <Routes>
        <Route path="/" element={<Login />}/>
        <Route path='/HomePage' element={<HomePage />}/>
    </Routes>

    </>
  )
}

export default App;

