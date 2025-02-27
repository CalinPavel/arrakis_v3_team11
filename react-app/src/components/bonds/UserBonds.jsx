import { useState, useEffect } from "react";
import { Bond } from "./Bond";
import { getUserBonds } from "../../services/BondService";
import { Row } from "react-bootstrap";


export const UserBonds = ({ userdetail }) => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
        getUserBonds(userdetail)
            .then(({ data }) => {
                setBonds(data);
            });
    }, []);

    // Temporary data
    // const temp_data = [bondDataExample];
    // useEffect(() => { setBonds(temp_data); }, []);


    return (
        <>
            <Row>
                {bonds.length === 0 ? <p>No bonds</p> : bonds.map(bond =>
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
    bond_maturity_date: '05/08/2021',
    coupon_percent: 4.37,
    unit_price: 90,
    face_value: 1000,
    issuer_name: 'BNPParibasIssu 4,37% Microsoft Corp (USD)',
    type: 'CORP',
    status: 'active',
    bond_holder: 'AZ Holdings Inc',
    tradingBook: 'Trading_book_1'
};