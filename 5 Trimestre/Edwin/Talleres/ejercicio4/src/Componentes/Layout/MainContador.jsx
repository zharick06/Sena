import { useState,useEffect } from "react";
import '../../index.css';
import imgContador from '../Imagen/imgContador.jpg'


export const MainContador =() =>{
    const useCount=()=>{
    const [counter, setcounter]= useState(0);

    const sumarContador=()=> setcounter(counter+1);

    const restarContador=()=>setcounter(counter-1);
    
    const setearContador=()=>setcounter(0);

    return{
        counter,
        sumarContador,
        restarContador,
        setearContador

    }
    }

    const {counter,sumarContador,restarContador,setearContador}=useCount()
      useEffect(() => {
        const imagen=document.getElementById('imagcounter');
       
        if (counter>10) {
            imagen.classList.remove('Inactive');
            imagen.classList.add('Active');   
        }

        else if (counter<0) {
            imagen.classList.remove('Active');
            imagen.classList.add('Inactive')
        }
        else if (counter===0 || counter<10) {
            imagen.classList.remove('Active');
            imagen.classList.remove('Inactive')
        }

    }, [counter])
    

    return(
        <div className="home">
            <h2>Contador</h2>
            <img src={imgContador} className="" id="imagcounter"/>
            <p>{counter}</p>
            <button className="btnContador" onClick={sumarContador}>+</button>
            <button className="btnContador" onClick={setearContador}>Reset</button>
            <button className="btnContador" onClick={restarContador}>-</button>
        </div>
    )
}