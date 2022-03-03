import {Header} from '../Layout/Header';
import {AboutMain} from '../Layout/AboutMain';
import  '../../index.css';
import { Footer } from '../Layout/Footer';



export function AboutUs(){
    return(
        <div >
            <Header/>
            
            <AboutMain/>
                
            <Footer/>
        </div>
    )
}