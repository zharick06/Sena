
import './App.css';
import {Home} from './Componentes/Page/Home';
import { BrowserRouter, Route,Routes} from "react-router-dom";
import {Contacto} from './Componentes/Page/Contacto'
import {AboutUs} from './Componentes/Page/AboutUs'

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
