import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getAllBonds = (userdetail) => {
  const bonds = axios.get(`${hostNameUrl}/securities`, {
    headers: {
      'Authorization': `Basic ${userdetail.token}:${userdetail.email}`
    }
  });

  console.log(bonds);
  return bonds;
  // return null;
};

export const getBondsFiveDayMaturity = (userdetail, date) => {
  // TODO: uncomment when API is working
  // const bonds = axios.get(`${hostNameUrl}/bonds/date/{date}`);
  // return bonds;
  return null;
}

export const getUserBonds = (userdetail) => {
  // TODO: uncomment when API is working
  // const bonds = axios.get(`${hostNameUrl}/bonds/user`);
  // return bonds;
  return null;
}




