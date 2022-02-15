import {Header} from '../Layout/Header';
import {Main} from '../Layout/Main';
import { Footer } from '../Layout/Footer';



export function Home(){
    return(
        <div className='home'>
            <Header/>     
            <Main/>
            <Footer/>
        </div>
    )
}

