import React, { useState } from 'react';
import Dropdown from 'react-bootstrap/Dropdown'
import { AllBonds } from './bonds/AllBonds';
import { BondsFiveDayMaturity } from './bonds/BondsFiveDayMaturity';
import { UserBonds } from './bonds/UserBonds';
import Badge from 'react-bootstrap/Badge'
import { TradesFiveDayExecuted } from './trades/TradesFiveDayExecuted';

const HomePage = ({userdetail}) => {

    const [selectedItem, setSelectedItem] = useState('All bonds');
    const handleDropdownSelect = (param) => {
        setSelectedItem(param);
    };

    const [showKey, setShowKey] = useState(false);
    const handleShowKeyClick = () => {
        setShowKey(true);
    }
    const handleCloseShowKey = () => {
        setShowKey(false);
    }


    return (
        <>
            <Dropdown>
                <Dropdown.Toggle variant="primary ">
                    {selectedItem}
                </Dropdown.Toggle>

                <Dropdown.Menu>
                    <Dropdown.Item onClick={() => handleDropdownSelect('All bonds')} >All bonds</Dropdown.Item>
                    <Dropdown.Item onClick={() => handleDropdownSelect('Bonds +-5 business days maturity')}>Bonds +-5 business days maturity</Dropdown.Item>
                    <Dropdown.Item onClick={() => handleDropdownSelect('My bonds')} >My bonds</Dropdown.Item>
                    <Dropdown.Item onClick={() => handleDropdownSelect('Trades')} >Trades</Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>

            <Badge onMouseEnter={handleShowKeyClick} onMouseLeave={handleCloseShowKey} className='text'> INFO </Badge>
            {showKey && <KeyInfo />}

            {selectedItem === 'All bonds' && <AllBonds userdetail={userdetail}/>}
            {selectedItem === 'Bonds +-5 business days maturity' && <BondsFiveDayMaturity userdetail={userdetail}/>}
            {selectedItem === 'My bonds' && <UserBonds userdetail={userdetail}/>}
            {selectedItem === 'Trades' && <TradesFiveDayExecuted userdetail={userdetail}/>}
        </>
    );
};

export default HomePage;


const KeyInfo = () => {
    return (
        <>
            <p> ISIN - Intrenational Securities Identification Number for Bonds, determined by an external organistion </p>
            <p> CUSIP - A nine digit numeric or nine character alphanumeric code that identifies a North American Financial Security </p>
        </>
    )
}
