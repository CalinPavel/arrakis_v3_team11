import React from "react";
import { Bond } from "./components/bonds/Bond";
import { AllBonds } from "./components/bonds/AllBonds";
import HomePage from "./components/HomePage";
import Navbar from "./components/NavBar";

const App = () => {
  // return <Bond bondData={bondDataExample}/>;
  return (
    <div>
      <Navbar/>
      <HomePage/>
    </div>
  )
};

export default App;


