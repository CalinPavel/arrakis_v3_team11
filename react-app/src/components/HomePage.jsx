import React, {useState} from 'react';
import Dropdown from 'react-bootstrap/Dropdown'

const HomePage = () => {

    const [selectedItem, setSelectedItem] = useState('All bonds');

    const handleDropdownSelect = (param) => {
        setSelectedItem(param);
    };

    return (
        <>
            <Dropdown>
                <Dropdown.Toggle variant="primary ">
                    {selectedItem}
                </Dropdown.Toggle>

                <Dropdown.Menu>
                    <Dropdown.Item onClick={() => handleDropdownSelect('All bonds')} >All bonds</Dropdown.Item>
                    <Dropdown.Item onClick={() => handleDropdownSelect('Bonds +-5 business days maturity')}>Bonds +-5 business days maturity</Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>
        </>
    );
};

export default HomePage;