import {Header} from '../Page/Header';
import { Footer } from '../Page/Footer';
import { Formulario } from '../Page/Formulario';



export function Contacto(){
    return(
        <div className='home'>
            <Header/>
            <Formulario/> 
            <Footer/>
        </div>
    )
}