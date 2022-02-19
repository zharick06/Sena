import imagen2 from '../Imagenes/imagen2.jpg'
import imgen1 from '../Imagenes/imgen1.jpg'
import '../../index.css';
import { useEffect, useState } from "react";

export const Main=()=>{
    const useImg=()=>{
        const [boton, setbotn]= useState(true);
    
        const activar=()=> setbotn(!boton);
    

        return{boton,
            activar
    
        }
        }
    
        const {boton,activar}=useImg()
          useEffect(() => {
            const imagen=document.getElementById('imagenEntregar');
            const imagen2=document.getElementById('imagenEntregar2');
            const btnEn=document.getElementById('btnEn')
           
            if (boton===true) {
                imagen.classList.remove('Active');
                imagen.classList.add('Inactive'); 
                imagen2.classList.remove('Active');
                imagen2.classList.add('Inactive'); 
                btnEn.textContent='Activar'
                
            }
            else{
                imagen.classList.remove('Inactive');
                imagen.classList.add('Active'); 
                imagen2.classList.remove('Inactive');
                imagen2.classList.add('Active'); 
                btnEn.textContent='Desactivar'  

            }         
    
        }, [boton])

   return( 
   <div>
       
      <p>  Card 1 <img src={imagen2} id='imagenEntregar' className='' /> </p>
      <p>  Card 2 <img src={imgen1} id='imagenEntregar2' className=''/> </p>
      <button id="btnEn" onClick={activar}></button>
     
   </div>
   )
    

}