import {Header} from '../Layout/Header';
import { Footer } from '../Layout/Footer';
import { Formulario } from '../Layout/Formulario';



export function Contacto(){
    return(
        <div className='home'>
            <Header/>
            <Formulario/> 
            <Footer/>
        </div>
    )
}