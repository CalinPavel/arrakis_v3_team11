import React from 'react'

export const Trades = ({tradeData}) => {

    // console.log(tradeData[0]);
    // console.log(tradeData[0].tradeType);




    const DisplayData=tradeData.map(
        (info)=>{
            console.log(tradeData[0].tradeType);
            return(
                <tr>
                    <td>{info[0].tradeType}</td>
                    <td>{info[0].tradeCurrency}</td>
                    <td>{info[0].quantity}</td>
                    <td>{info[0].tradeSettlementDate}</td>
                    <td>{info[0].tradeStatus}</td>
                    <td>{info[0].tradeDate}</td>
                    <td>{info[0].security.isin}</td>
                    {/* <td>{info.bookId}</td>
                    <td>{info.counterPartyId}</td> */}
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
                    {/* <th>Book ID</th>
                    <th>Counter Party ID</th> */}
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