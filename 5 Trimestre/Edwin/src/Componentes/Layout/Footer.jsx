import { Botones } from "../UI/Botones";
import Index from '../../index.css';
import { Linking } from 'react-native';
import { Link } from "react-router-dom";


export function Footer(){
    const url="https://google.com"
    return(
    <footer>
        <hr />
        <Botones clase="btn2" name="Boton4"  />
        <Botones clase="btn2" name="Boton5"/>
        <Botones clase="btn2" name="Boton6"/>

    </footer>
        
        
    )
}
/* 




<Text onPress={() => Linking.openURL(url)}>
    {url}
</Text> */