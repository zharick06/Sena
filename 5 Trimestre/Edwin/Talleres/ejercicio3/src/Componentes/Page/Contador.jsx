import { useState,useEffect } from "react";
import {Header} from '../Layout/Header';
import { Footer } from '../Layout/Footer';
import {Index} from '../../index.css';
import imgContador from '../Imagen/imgContador.jpg'


export const Contador =() =>{
    const [counter, setcounter]= useState(0);

    const sumarContador=()=> setcounter(counter+1);
   
    const restarContador=()=>setcounter(counter-1);
    
    const setearContador=()=>setcounter(0);

    
    useEffect(() => {
        const imagen=document.getElementById('imagcounter');
        if (counter>10) {
            imagen.classList.remove('Inactive');
            imagen.classList.add('Active')
            
        }
        else{
            imagen.classList.remove('Active');
            imagen.classList.add('Inactive')

        }
      
      
    }, [counter])
    

    return(
        <div className="home">
            <Header/>
            <h2>Contador</h2>
            <img src={imgContador} className="" id="imagcounter"/>
            <p>{counter}</p>
            <button className="btnContador" onClick={sumarContador}>+</button>
            <button className="btnContador" onClick={setearContador}>Reset</button>
            <button className="btnContador" onClick={restarContador}>-</button>
            <Footer/>
        </div>
    )
}