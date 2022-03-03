import React,{ useState} from 'react'
import '../../index.css'

export const Main=()=>{
    let api = `https://rickandmortyapi.com/api/character/?name=`;
    let [datos, actualizarDatos] = useState([]);
    const buscar=(nuevo)=>{
    actualizarDatos(nuevo)
  }
    const buscador= (event) => {
      if(event.keyCode===13){
        const nombre=document.getElementById('nombre').value
        let url = api+nombre
        fetch(url)
        .then(response=>response.json())
        .then(data=>buscar(data.results))
      }
  }
    
  
       return (
          <>
           <input type="text" id="nombre"  onKeyDown={buscador}   />  
               <div className="home">
                   
                     {datos.map((valor)=>{
                     return(
                             <div className='card'>
                         <p><img src={valor.image} alt=""/>
                         <h2>{valor.name}</h2>
                         <h4>Estado: {valor.status}</h4>
                         <h4>Especie: {valor.species}</h4>
                         <h4>Genero: {valor.gender}</h4>
                         </p>
                       </div>
                      
                       
                        )})}
         </div>
         </>
                
       )
     }
  