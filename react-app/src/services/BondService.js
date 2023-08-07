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

export const getUserBonds = (userdetail) => {
  // TODO: uncomment when API is working
  // const bonds = axios.get(`${hostNameUrl}/bonds/user`);
  // return bonds;
  return null;
}




