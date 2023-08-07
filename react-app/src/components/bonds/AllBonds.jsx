import { useState, useEffect } from "react";
import { Bond } from "./Bond";
import { getAllBonds } from "../../services/BondService";
import { Row } from "react-bootstrap";


export const AllBonds = ({userdetail}) => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
        getAllBonds(userdetail)
            .then(({ data }) => {
                setBonds(data);
            });
    }, []);

    return (
        <>
            <Row>
                {bonds.map(bond =>
                    <Bond bondData={bond} />)
                }
            </Row>
        </>
    )
};
