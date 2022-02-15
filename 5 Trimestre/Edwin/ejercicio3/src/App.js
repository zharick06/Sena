
import './App.css';
import {Home} from './Componentes/Layout/Home';
import { BrowserRouter, Route,Routes} from "react-router-dom";
import {Contacto} from './Componentes/Layout/Contacto';
import {AboutUs} from './Componentes/Layout/AboutUs'

function App() {
  return (
    <BrowserRouter>
        <Routes>
        <Route path='/' element={<Home/>} />
        <Route path='/Contacto' element={<Contacto/>} />
        <Route path='/AboutUs'  element={<AboutUs/>}/>

        </Routes>
    </BrowserRouter>
  );
}

export default App;
