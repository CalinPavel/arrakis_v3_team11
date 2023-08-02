import React from 'react';
import Dropdown from 'react-bootstrap/Dropdown'



const HomePage = () => {
    const handleDropdownSelect = (eventKey) => {
        // Handle the selected item based on eventKey
        console.log(`Selected option: ${eventKey}`);
    };

    return (
        <>
            <Dropdown>
                <Dropdown.Toggle variant="primary ">
                    Display bonds
                </Dropdown.Toggle>

                <Dropdown.Menu>
                    <Dropdown.Item eventKey="option1">All Bonds</Dropdown.Item>
                    <Dropdown.Item eventKey="option2">Bonds within 5 business day maturity</Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>
        </>
    );
};

export default HomePage;