import React from 'react'

export const Trades = ({tradeData}) => {
    const DisplayData=tradeData.map(
        (info)=>{
            return(
                <tr>
                    <td>{info.tradeType}</td>
                    <td>{info.tradeCurrency}</td>
                    <td>{info.quantity}</td>
                    <td>{info.tradeSettlementDate}</td>
                    <td>{info.tradeStatus}</td>
                    <td>{info.date}</td>
                    <td>{info.securityId}</td>
                    <td>{info.bookId}</td>
                    <td>{info.counterPartyId}</td>
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