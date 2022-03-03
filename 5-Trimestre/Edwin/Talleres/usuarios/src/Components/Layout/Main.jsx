
import {Formulario} from'./Formulario'
import { useState } from 'react';

export const Main=()=>{
  getToken(){

    axios.get({
        url: 'https://developer.api.autodesk.com/authentication/v1/authenticate',
        data: {
            client_id: '1234',
            client_secret: '1234',
            grant_type : 'client_credentials',
            scope: 'data:read data:viewables'
        },
        beforeSend: function(xhr) {
             xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded")
        }, success: function(data){
            console.log(data)
        }
    })        
}
  
  
}