import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getAllBonds = (userdetail) => {
  const bonds = axios.get(`${hostNameUrl}/securities`, {
    headers: {
      'Authorization': `Basic ${userdetail.token}:${userdetail.email}`
    }
  });
  return bonds;
};

export const getBondsFiveDayMaturity = (userdetail, date) => {
  const bonds = axios.get(`${hostNameUrl}/securities/get5daysbonds/${date}`, {
    headers: {
      'Authorization': `Basic ${userdetail.token}:${userdetail.email}`
    }
  });
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




