import React from 'react'
import JsonData from './data.json'

export const Trades = () => {
    const DisplayData=JsonData.map(
        (info)=>{
            return(
                <tr>
                    <td>{info.trade_type}</td>
                    <td>{info.trade_currency}</td>
                    <td>{info.quantity}</td>
                    <td>{info.trade_settlement_date}</td>
                    <td>{info.trade_status}</td>
                    <td>{info.date}</td>
                    <td>{info.security_id}</td>
                    <td>{info.book_id}</td>
                    <td>{info.counter_party_id}</td>
                </tr>
            )
        }
    )

    return(
        <div>
            <table class="table table-striped">
                <thead>
                    <tr>
                    <th>Trade Type</th>
                    <th>Trade Currency</th>
                    <th>Quantity</th>
                    <th>Trade Settlement Date</th>
                    <th>Trade Status</th>
                    <th>Date</th>
                    <th>Security ID</th>
                    <th>Book ID</th>
                    <th>Counter Party ID</th>
                    </tr>
                </thead>
                <tbody>
                    {DisplayData}
                </tbody>
            </table>
        </div>
    )
 };

export default Trades;