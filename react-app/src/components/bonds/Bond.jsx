import React from "react";
import Card from 'react-bootstrap/Card'
import './Bond.css'

export const Bond = ({bondData}) => {
    return (
        <Card className='container'>
            <Card.Body>
                <Card.Title className="title"> ISIN: {bondData.isin} </Card.Title>
                <Card.Text className="text"> CUSIP: {bondData.cusip} </Card.Text>
                <Card.Text className="text"> Currency: {bondData.bondCurrency} </Card.Text>
                <Card.Text className="text"> Maturity: {bondData.bondMaturityDate} </Card.Text>
                <Card.Text className="text"> Coupon Percentage: {bondData.couponPercent} </Card.Text>
                <Card.Text className="text"> Unit Price: {bondData.unitPrice} </Card.Text>
                <Card.Text className="text"> Face value: {bondData.faceValue} </Card.Text>
                <Card.Text className="text"> Issuer Name: {bondData.issuerName} </Card.Text>
                <Card.Text className="text"> Type: {bondData.type} </Card.Text>
                <Card.Text className="text"> Status: {bondData.status} </Card.Text>
                <Card.Text className="text"> Bond Holder: {bondData.bondHolder} </Card.Text>
                <Card.Text className="text"> Trading Book: {bondData.bookName} </Card.Text>
            </Card.Body>
        </Card>
    )
};
