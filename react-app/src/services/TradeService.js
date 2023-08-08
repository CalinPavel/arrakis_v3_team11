import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getTradesFiveDayExecuted = (userdetail, date) => {
  const authHeader = {
    'Authorization': `Basic ${Buffer.from(`${userdetail.email}:${userdetail.token}:`).toString('base64')}`
  };
  
  const trades = axios.get(`${hostNameUrl}/trades/${date}`, { headers: authHeader });
  return trades;
}

