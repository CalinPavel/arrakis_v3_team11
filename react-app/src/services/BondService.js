import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getAllBonds = (userdetail) => {
  const bonds = axios.get(`${hostNameUrl}/securities`);
  console.log(bonds);
  return bonds;
};

export const getBondsFiveDayMaturity = (date) => {
  // TODO: uncomment when API is working
  // const bonds = axios.get(`${hostNameUrl}/bonds/date/{date}`);
  // return bonds;
  return null;
}

export const getUserBonds = (userdetail) => {
  // TODO: uncomment when API is working
  // const bonds = axios.get(`${hostNameUrl}/bonds/user/{userdetail}`);
  // return bonds;
  return null;
}



// Example data
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
  bond_holder: 'AZ Holdings Inc',
  // trade_type: 'buy',
  // trade_currency: 'USD',
  // quantity: 50,
  // trade_settlement_date: '04/08/2021',
  // trade_status: 'open',
  // trade_date: '13/05/2021',
  // book_name: 'trading_book_1',
  // bond_holder: 'AZ Holdings Inc',
};


