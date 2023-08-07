import React, { useState } from "react";
import { Bond } from "./components/bonds/Bond";
import { AllBonds } from "./components/bonds/AllBonds";
import HomePage from "./components/HomePage";
import Navbar from "./components/NavBar";
import Login from "./components/Login";
import Trades from "./components/trades/Trades";
import { Route, Routes } from "react-router-dom";


const App = () => {
  const [userdetail, setUserdetail] = useState({});
  
  return (
    <>
    <Navbar userdetail={userdetail}/>

    <Routes>
        <Route path="/" element={<Login setUserdetail = {setUserdetail}/>}/>
        <Route path='/HomePage' element={<HomePage userdetail = {userdetail}/>}/>
    </Routes>

    </>
  )
}

export default App;

