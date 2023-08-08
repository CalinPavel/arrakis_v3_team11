import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getAllBonds = (userdetail) => {
  const authHeader = {
    'Authorization': `Basic ${Buffer.from(`${userdetail.email}:${userdetail.token}:`).toString('base64')}`
  };

  const bonds = axios.get(`${hostNameUrl}/securities`, { headers: authHeader });

  return bonds;
};

export const getBondsFiveDayMaturity = (userdetail, date) => {
  const authHeader = {
    'Authorization': `Basic ${Buffer.from(`${userdetail.email}:${userdetail.token}:`).toString('base64')}`
  };

  const bonds = axios.get(`${hostNameUrl}/securities/get5daysbonds/${date}`, { headers: authHeader });

  // Returns empty array if no matching bonds
  return bonds;
}


const Buffer = require('buffer').Buffer;

export const getUserBonds = (userdetail) => {
  const authHeader = {
    'Authorization': `Basic ${Buffer.from(`${userdetail.email}:${userdetail.token}:`).toString('base64')}`
  };

  const bonds = axios.get(`${hostNameUrl}/books/mybooks`, { headers: authHeader });
    
  return bonds;
}




