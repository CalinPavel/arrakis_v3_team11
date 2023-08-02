import { hostNameUrl } from "../config/api";
import axios from "axios";

export const getAllBonds = () => {
  const bonds = axios.get(`${hostNameUrl}/bonds`);
  return bonds;
};