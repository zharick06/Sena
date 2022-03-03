import { Botones } from "../UI/Botones";
import '../../index.css';


export function Footer(){
    return(
    <footer>
        <hr />
        <a target='https://github.com/zharick06/Sena' href='https://github.com/zharick06/Sena'>
        <Botones clase="btn2" name="GitHub"  />
        </a>

        <a target='https://www.google.com/maps/@4.5467074,-75.6738498,15z' href='https://www.google.com/maps/@4.5467074,-75.6738498,15z'>
        <Botones clase="btn2" name="Maps"/>
        </a>
        
        <a target='https://sena.territorio.la/init.php' href="https://sena.territorio.la/init.php">
        <Botones clase="btn2" name="Territorium"/>
        </a>
        

    </footer>
        
        
    )
}


