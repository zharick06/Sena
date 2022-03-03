import {Header} from '../Layout/Header';
import { Footer } from '../Layout/Footer';
import { MainContador } from '../Layout/MainContador';
import '../../index.css';
import imgContador from '../Imagen/imgContador.jpg'


export const Contador =() =>{
    return(
        <div className="home">
            <Header/>
            <MainContador/>
            
            <Footer/>
        </div>
    )
}