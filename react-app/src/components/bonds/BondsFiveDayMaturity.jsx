import { useState, useEffect } from "react";
import { Bond } from "./Bond";
import { getBondsFiveDayMaturity } from "../../services/BondService";
import { Row } from "react-bootstrap";
import Form from 'react-bootstrap/Form'
import moment from 'moment'

export const BondsFiveDayMaturity = () => {
    const [bonds, setBonds] = useState([]);

    // TODO: uncomment when service is available
    // useEffect(() => {
    //     getBondsFiveDayMaturity(date)
    //         .then(({ data }) => {
    //             setBonds(data);
    //         });
    // }, []);

    // Temporary data
    const temp_data = [bondDataExample, bondDataExample];
    useEffect(() => { setBonds(temp_data); }, []);


    // Dealing with dates
    // Dates in format yyyy-mm-dd

    let today = new Date();
    today = moment(today).format('YYYY-MM-DD');

    const [date, setDate] = useState({today});

    const handleDate = (e) => {
        e.preventDefault();
        setDate(e.target.value);
        console.log(e.target.value);
    }

    return (
        <>
            <Form.Control type='date' className='date_picker' onChange={handleDate} defaultValue={today}/>
            <Row>
                {bonds.map(bond =>
                    <Bond bondData={bond} />)
                }
            </Row>
        </>
    )
};

const bondDataExample = {
    cusip: 'NULL',
    isin: "XS1988387210",
    bond_currency: 'USD',
    bond_maturity_date: '05/08/2023',
    coupon_percent: 4.37,
    unit_price: 90,
    face_value: 1000,
    issuer_name: 'BNPParibasIssu 4,37% Microsoft Corp (USD)',
    type: 'CORP',
    status: 'active',
};