import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getTradesFiveDayExecuted = (userdetail, date) => {
  const trades = axios.get(`${hostNameUrl}/trades/${date}`, {
    headers: {
      'Authorization': `Basic ${userdetail.token}:${userdetail.email}`
    }
  });
  return trades;
}

