import React, { useState, useEffect } from "react";
import { getTradesFiveDayExecuted } from "../../services/TradeService";
import Trades from "./Trades";
import Form from 'react-bootstrap/Form'
import moment from 'moment'

// Display trades which were executed within a 5 day window of a selected day

export const TradesFiveDayExecuted = ( {userdetail} ) => {
    const [trades, setTrades] = useState([]);

    // Dealing with dates
    // Dates in format yyyy-mm-dd
    let today = new Date();
    today = moment(today).format('YYYY-MM-DD');

    const [date, setDate] = useState(today);

    const handleDate = (e) => {
        e.preventDefault();
        setDate(e.target.value);
        console.log(e.target.value);
    }

    useEffect(() => {
        getTradesFiveDayExecuted(userdetail, date)
            .then(({ data }) => {
                setTrades(data);
            });
    }, [date]);

    // Temporary data
    // const temp_data = [tradeDataExample];
    // useEffect(() => { setTrades(temp_data); }, []);

    return (
        <>
            <p>Trades which were executed within a 5 day window of a selected day</p>
            <Form.Control type='date' className='date_picker' onChange={handleDate} defaultValue={today} />
            {trades.length === 0 ? <p>No trades</p> : <Trades tradeData={trades} />}
        </>
    )
};


const tradeDataExample = {
    "tradeType": "sample",
    "tradeCurrency": "USD",
    "quantity": "60",
    "tradeSettlementDate": "27/06/2014",
    "tradeStatus": "open",
    "date": "16/06/2014",
    "securityId": 1,
    "bookId": 1,
    "counterPartyId": 1
}
