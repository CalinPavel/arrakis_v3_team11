// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
import { getAuth } from "firebase/auth";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyCgIktTaoTSzootGhW2i99kp_32PZOM71I",
    authDomain: "bond-display.firebaseapp.com",
    projectId: "bond-display",
    storageBucket: "bond-display.appspot.com",
    messagingSenderId: "691040084212",
    appId: "1:691040084212:web:20a2f58d66cdf669703ea1",
    measurementId: "G-2MZYTP3LP0",
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);

export const auth = getAuth(app);
