import {Header} from '../Page/Header';
import {Main} from '../Page/Main';
import { Footer } from '../Page/Footer';



export function Home(){
    return(
        <div className='home'>
            <Header/>     
            <Main/>
            <Footer/>
        </div>
    )
}

/* 
import { Linking } from 'react-native';

const url="https://google.com"

<Text onPress={() => Linking.openURL(url)}>
    {url}
</Text> */