import { useState, useEffect } from "react";
import { Bond } from "./Bond";
import { getAllBonds } from "../../services/BondService";


export const AllBonds = () => {
    const [bonds, setBonds] = useState([]);

    // TODO: uncomment when service is available
    // useEffect(() => {
    //     getAllBonds()
    //         .then(({ data }) => {
    //             setBonds(data);
    //         });
    // }, []);

    // Temporary data
    const temp_data = [bondDataExample, bondDataExample];
    useEffect(() => {setBonds(temp_data);}, []);

    return (
        <>
            {bonds.map(bond =>
                <Bond bondData={bond} />)
            }
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
  };