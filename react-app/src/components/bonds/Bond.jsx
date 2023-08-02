import React, { useState, useEffect } from "react";
import Card from 'react-bootstrap/Card'
import './Bond.css'

export const Bond = ({bondData}) => {
    return (
        <Card className='container'>
            <Card.Body>
                <Card.Title className="title"> ISIN: {bondData.isin} </Card.Title>
                <Card.Text> CUSIP: {bondData.cusip} </Card.Text>
                <Card.Text> Currency: {bondData.bond_currency} </Card.Text>
                <Card.Text> Maturity: {bondData.bond_maturity_date} </Card.Text>
                <Card.Text> Coupon Percentage: {bondData.coupon_percent} </Card.Text>
                <Card.Text> Unit Price: {bondData.unit_price} </Card.Text>
                <Card.Text> Face value: {bondData.face_value} </Card.Text>
                <Card.Text> Issuer Name: {bondData.issuer_name} </Card.Text>
                <Card.Text> Type: {bondData.type} </Card.Text>
                <Card.Text> Status: {bondData.status} </Card.Text>
            </Card.Body>
        </Card>
    )
};
