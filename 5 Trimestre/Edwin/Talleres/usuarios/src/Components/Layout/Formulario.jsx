import { Input } from "../UI/Input";



export const Formulario = () => {
    
    


    return ( 
    <div className = 'formulario' >
        <form className = 'contenidoF' >
            <br/>
            <label>
                Nombres:
                <br/>
                <Input tipo = 'text' clase = 'Nombre'/> <br/>
            </label> 
            <label>
                Nombres: <br/>
                <Input tipo = 'text' clase = 'Nombre'/> <br/>
            </label>

            <label>
                Usuario: <br/>
                <Input tipo = 'text'clase = 'Nombre'/> < br/>
            </label> 

            <label className = "item-form" >
                Contraseña: < br/>
                <Input tipo = 'password' clase = 'email'/> < br/>
            </label>  


            <input type = "submit" value = "Enviar" className = "itemB-form"/>
            <input type = "reset"value = "Cancelar" className = "itemB-form"/>

        </form> 
         </div>
    )
}