
import './App.css';
import {Home} from './Componentes/Page/Home';
import { BrowserRouter, Route,Routes} from "react-router-dom";
import {Contacto} from './Componentes/Page/Contacto'
import {AboutUs} from './Componentes/Page/AboutUs'
import {Contador} from './Componentes/Page/Contador'

function App() {
  return (
    <BrowserRouter>
        <Routes>
        <Route path='/' element={<Home/>} />
        <Route path='/Contacto' element={<Contacto/>} />
        <Route path='/AboutUs'  element={<AboutUs/>}/>
        <Route path='/Contador'  element={<Contador/>}/>

        </Routes>
    </BrowserRouter>
  );
}

export default App;
