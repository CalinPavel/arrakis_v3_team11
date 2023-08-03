import React from 'react'
import {firebase} from 'firebase/compat/app'
import 'firebase/compat/auth'
import signInWithEmailAndPassword from 'firebase/compat/auth'
import { Button } from 'bootstrap'
import { getAuth } from 'firebase/auth'
import { useState } from 'react'

export default Login = () => {
    const auth = getAuth();
    const[email, setEmail] = useState("")
    const[password, setPassword] = useState("")
    const handleLogin  =  () => {
    signInWithEmailAndPassword(email, password)
        .then(userCredentials => {
        const user = userCredentials.user;
        console.log('Logged in with:', user.email);
        })
    }
        // .catch(error => alert(error.message))
        // }


  return (
    <>
    <form>
        <label>
            <p>Username:</p>
            <input type = "text" />
        </label>
        <div>
            <label>
                <p>Password::</p>
                <input type = "password" />
            </label>
        </div>
        <div>
            <button type = "submit">Login</button>
        </div>
    </form>
    </>
  )
};
