import React from "react";
import { Bond } from "./components/bonds/Bond";
import { AllBonds } from "./components/bonds/AllBonds";

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
  // trade_type: 'buy',
  // trade_currency: 'USD',
  // quantity: 50,
  // trade_settlement_date: '04/08/2021',
  // trade_status: 'open',
  // trade_date: '13/05/2021',
  // book_name: 'trading_book_1',
  // bond_holder: 'AZ Holdings Inc',
};

const App = () => {
  // return <Bond bondData={bondDataExample}/>;
  return <AllBonds/>;
};

export default App;
