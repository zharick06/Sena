import {Input} from '../UI/Input'

export function Formulario(props){
   return(
       <div className='formulario'>
            <form className='contenidoF' >
               <label>
                  Name:
                     <Input tipo='text' nombre='Nombre' clase='Nombre'/><br/>
               </label>
               <label>
                  Email:
                     <Input tipo='email' nombre='Nombre' clase='email'/><br/>
               </label>    
                     
               <label>
                     Color:

                  <Input tipo='color' nombre='Nombre' clase='color'/><br/>
               </label>  
                     
               <input type="submit" value="Submit" />
                
            </form> 
       </div>
   )
}