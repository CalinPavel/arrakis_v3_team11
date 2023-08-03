import React, {useState} from 'react';
import Dropdown from 'react-bootstrap/Dropdown'
import { AllBonds } from './bonds/AllBonds';
import { BondsFiveDayMaturity } from './bonds/BondsFiveDayMaturity';

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

            {selectedItem === 'All bonds' && <AllBonds />}
            {selectedItem == 'Bonds +-5 business days maturity' && <BondsFiveDayMaturity />}
        </>
    );
};

export default HomePage;