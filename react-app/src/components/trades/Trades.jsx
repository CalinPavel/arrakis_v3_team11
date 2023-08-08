import React from 'react'

export const Trades = ({tradeData}) => {

    // console.log(tradeData[0]);
    // console.log(tradeData[0].tradeType);


    const DisplayData=tradeData.map(
        (info)=>{
            console.log(info)
            console.log(info.tradeType);
            return(
                <tr>
                    <td>{info.tradeType}</td>
                    <td>{info.tradeCurrency}</td>
                    <td>{info.quantity}</td>
                    <td>{info.tradeSettlementDate}</td>
                    <td>{info.tradeStatus}</td>
                    <td>{info.tradeDate}</td>
                    <td>{info.security.isin}</td>
                    <td>{info.book.bookName}</td>
                    <td>{info.counterParty.bondHolder}</td>
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
                    <th>Trade Date</th>
                    <th>ISIN</th>
                    <th>Book Name</th>
                    <th>Bond Holder</th>
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