import {Input} from '../UI/Input'

export function Formulario(props){
   return(
       <div className='formulario'>
            <form className='contenidoF' >
               <br/>
               <label className="item-form">
                  Nombres:<br/>
                     <Input tipo='text'  clase='Nombre'/><br/>
               </label>

               <label className="item-form">
                  Apellidos:<br/>
                     <Input tipo='text'  clase='Nombre'/><br/>
               </label>

               <label className="item-form">
                  Email: <br/>
                     <Input tipo='email'  clase='email'/><br/>
               </label>

               <label className="item-form">
                  Telefono:<br/>
                     <Input tipo='text'  clase='telefono'/><br/>
               </label>  

               <label className="item-form">
                  Fecha De Nacimiento:<br/>
                     <Input tipo='date'  clase='email'/><br/>
               </label>  

               <label className="item-form">
                  Contraseña:<br/>
                     <Input tipo='password'  clase='email'/><br/>
               </label>  
                
                     
               <input type="submit" value="Enviar"  className="itemB-form"/>
               <input type="reset" value="Cancelar"  className="itemB-form"/>
                
            </form> 
       </div>
   )
}