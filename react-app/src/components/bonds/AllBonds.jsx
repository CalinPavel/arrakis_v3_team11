import { useState, useEffect } from "react";
import { Bond } from "./Bond";
import { getAllBonds } from "../../services/BondService";


export const AllBonds = () => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
        getAllBonds()
            .then(({ data }) => {
                setBonds(data);
            });
    }, []);

    return (
        <>
            {bonds.map(bond =>
                <Bond bondData={bond} />)
            }
        </>
    )
};