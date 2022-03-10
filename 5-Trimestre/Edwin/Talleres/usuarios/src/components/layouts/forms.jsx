import React, {useState} from "react";
import { Button } from "../UI/Button";
import { Input } from "../UI/Input";
import axios from "axios";


export const Forms = () =>{
    const [datos, setDato]=useState({
        form:{
            "username":"",
            "password":""
        },
        error:false,
        errorMsg:""
    })
    const login = (e) =>{
        e.preventDefault()
        const usuario = document.getElementById("name").value
        const contrasena = document.getElementById("password").value
        setDato(
            datos.form.username=usuario,
            datos.form.password=contrasena
        )
        console.log(datos.form)
        post()
    }
    
    const post = () =>{
        axios.post('https://backend-edw.herokuapp.com/login',datos.form )
          .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
    }
    return(
        <div className="form">
            <form id="form" className="topBefore">

                <Input idI="name" types="text" place="Name"/>
                <Input idI="password" types="password" place="Password"/>
                <Button idI="submit"  text="GO!" event={login}/>
                <Button idI="submit"  text="Register"/>

            </form>
        </div>
    )
}