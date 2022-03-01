import portada from '../Imagen/portada.jpg';
import '../../index.css';


export function Main(){
    return(
        <div className='Main'>
            <img src={portada} alt="" className='imagen' />

        </div>
    )
}
