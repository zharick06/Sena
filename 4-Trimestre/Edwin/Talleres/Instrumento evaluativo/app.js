const URL="https://dog.ceo/api/breeds/image/random";
const main=document.querySelector('#main');
const btn1=document.getElementById('btn1');
const pedir=document.querySelector('#pedir')
const templateC =document.querySelector('#templateC').content;
const fragment= document.createDocumentFragment();
btn1.addEventListener('click', FechtBOTONES);
document.addEventListener('keyup', entrada);
 


function entrada(event) {
    
    let codigo = event.which || event.keyCode;

    if (codigo === 13) {
        main.innerHTML='';
        let number= Number(pedir.value)
        for (let index = 0; index < number; index++) {
             FechtApi();  
    }
}
 
}

function Cards(perros) {      
        let clonetempl=document.importNode(templateC, true);
        clonetempl.querySelector('#imagen').setAttribute('src', perros.message);
        fragment.appendChild(clonetempl);
        main.appendChild(fragment);
  
}

function CardsBotones(perros) {  
    
    main.innerHTML='';    
    let clonetempl=document.importNode(templateC, true);
    clonetempl.querySelector('#imagen').setAttribute('src', perros.message);
    fragment.appendChild(clonetempl);
    main.appendChild(fragment);

}

function FechtApi() {
    fetch(URL)
    .then(Response => Response.json())
    .then(nuevaC =>{
        Cards(nuevaC)
    })
    
}
function FechtBOTONES() {
    fetch(URL)
    .then(Response => Response.json())
    .then(nuevaC =>{
        CardsBotones(nuevaC)
    })
    
}