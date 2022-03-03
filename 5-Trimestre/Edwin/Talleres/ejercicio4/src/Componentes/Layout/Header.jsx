 import { Botones } from "../UI/Botones";
 import '../../index.css';
import { NavLink } from "react-router-dom";
import '../Page/Contacto'
import '../Page/Contador'


export function Header(){
    return(
        <div className="header"> 
         <NavLink to="/">
         <Botones clase="btn1" name='Home' / ></NavLink>
         <NavLink to="/AboutUs">
         <Botones clase="btn1" name='AboutUs'/ ></NavLink>
         <NavLink to="/Contacto">
         <Botones clase="btn1" name='Contacto'/ ></NavLink>
         <NavLink to="/Contador">
         <Botones clase="btn1" name='Contador'/ ></NavLink>
         
         
             <hr />
        </div>
    )
}
