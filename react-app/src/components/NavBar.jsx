
import './Navbar.css'
import React, { useState } from "react";

const Navbar = () => {
    return (
        <nav className="navbar">

            <a className="navbar-brand">
                Bonds & Trades                
            </a>
            <div className="ml-auto">
                <span className="navbar-text">Hello, John Doe</span>
            </div>
        </nav>);
};

export default Navbar;