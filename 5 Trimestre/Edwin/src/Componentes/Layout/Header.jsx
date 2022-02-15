 import { Botones } from "../UI/Botones";
 import {Index} from '../../index.css';
import { NavLink } from "react-router-dom";
import {Contacto} from '../Page/Contacto'


export function Header(){
    const url="https://google.com"
    return(
        <div className="header"> 
         <NavLink to="/">
         <Botones clase="btn1" name='Home' / ></NavLink>
         <NavLink to="/AboutUs">
         <Botones clase="btn1" name='AboutUs'/ ></NavLink>
         <NavLink to="/Contacto">
         <Botones clase="btn1" name='Contacto'/ ></NavLink>
         
         
             <hr />
        </div>
    )
}
