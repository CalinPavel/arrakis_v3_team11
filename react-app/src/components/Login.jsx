import React from 'react';
import {signInWithEmailAndPassword, createUserWithEmailAndPassword} from 'firebase/auth';
import { Button } from 'react-bootstrap';
import { getAuth} from 'firebase/auth';
import { useState } from 'react';
import { Form, Row } from 'react-bootstrap';
import {auth} from '../config/firebase';
import './Login.css';

const Login = () => {
    //const auth = getAuth();
    const[email, setEmail] = useState("");
    const[password, setPassword] = useState("");

    const handleRegister = () => {
        createUserWithEmailAndPassword(auth, email, password)
        .then((userCredential) => {
            const user = userCredential.user;
            console.log('Registered with:', user.email)
        })
        .catch((error) => {
            const errorCode = error.code;
            const errorMessage = error.message;
        })
    };

    const handleLogin  =  () => {
    signInWithEmailAndPassword(auth, email, password)
        .then((userCredentials) => {
        const user = userCredentials.user;
        console.log('Logged in with:', user.email);
        })
        .catch(error => alert(error.message))
    };

  return (
    <>
    <Row className='LoginForm'>
        <Form >
            <Form.Group className="inputform" controlId="username">
                <Form.Label>Username: </Form.Label>
                <Form.Control placeholder="Username" onChange={(event)=>setEmail(event.target.value)}/>
            </Form.Group>
            <Form.Group className="inpurform" controlId="password">
                <Form.Label>Password: </Form.Label>
                <Form.Control type="password" placeholder="Password" 
                onChange={(event)=>setPassword(event.target.value)}/>
            </Form.Group>
            <Button className='RegisterButton' variant='Primary' onClick={handleRegister}> 
                Register
            </Button>
            <Button className='LoginButton' variant='Primary' onClick={handleLogin}> 
                Login
            </Button>
        </Form>      
    </Row>
    </>
  )
};

export default Login;