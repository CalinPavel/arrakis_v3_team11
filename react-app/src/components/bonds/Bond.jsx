import React from "react";
import Card from 'react-bootstrap/Card'
import './Bond.css'

export const Bond = ({bondData}) => {
    return (
        <Card className='container'>
            <Card.Body>
                <Card.Title className="title"> ISIN: {bondData.isin} </Card.Title>
                <Card.Text className="text"> CUSIP: {bondData.cusip} </Card.Text>
                <Card.Text className="text"> Currency: {bondData.bond_currency} </Card.Text>
                <Card.Text className="text"> Maturity: {bondData.bond_maturity_date} </Card.Text>
                <Card.Text className="text"> Coupon Percentage: {bondData.coupon_percent} </Card.Text>
                <Card.Text className="text"> Unit Price: {bondData.unit_price} </Card.Text>
                <Card.Text className="text"> Face value: {bondData.face_value} </Card.Text>
                <Card.Text className="text"> Issuer Name: {bondData.issuer_name} </Card.Text>
                <Card.Text className="text"> Type: {bondData.type} </Card.Text>
                <Card.Text className="text"> Status: {bondData.status} </Card.Text>
                <Card.Text className="text"> Bond Holder: {bondData.bond_holder} </Card.Text>
            </Card.Body>
        </Card>
    )
};
