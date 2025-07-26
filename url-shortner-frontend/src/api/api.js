import axios from "axios";

console.log("API base URL:", import.meta.env.VITE_BACKEND_URL);

export default axios.create({
  baseURL: import.meta.env.VITE_BACKEND_URL,
  headers: {
    "Content-Type": "application/json",
    Accept: "application/json",
  },
});
