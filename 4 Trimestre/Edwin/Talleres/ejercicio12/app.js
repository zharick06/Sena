const URL = "https://rickandmortyapi.com/api/character/?page=18";
const select = document.querySelector('#selector');
const main = document.querySelector('#main');
const temCard = document.querySelector('#temCard').content;
const fragment=document.createDocumentFragment();

select.addEventListener('click', FechtApi(),FechtDesple());



function slecionar(rickmorty) {
    rickmorty.results.forEach(element => {
        const option=document.createElement('option');
        option.value=element.id;
        option.innerHTML=element.name;
        select.appendChild(option); 
         })
         const opcion=document.createElement('option');
         opcion.innerHTML='All items';
         select.appendChild(opcion);
         
        
}


function Card(rickmorty) { 
    select.onclick = (event) => {
        event.preventDefault()
        let selecion =select.selectedIndex;
            if (selecion===20) {
                main.innerHTML='';
                rickmorty.results.forEach(element => {
                    let cloneTemplate=document.importNode(temCard, true);
                    cloneTemplate.querySelector('#imagen').setAttribute('src',  element.image);
                    cloneTemplate.querySelector('#imagen').setAttribute('alt',element.name);
                    cloneTemplate.querySelector('#nombre').textContent=element.name;
                    cloneTemplate.querySelector('#estado').textContent=element.status;
                    cloneTemplate.querySelector('#genero').textContent=element.gender;
                    cloneTemplate.querySelector('#especie').textContent=element.species;
                    fragment.appendChild(cloneTemplate);
                    main.appendChild(fragment);
                    
                });
                
            }
            else {
                main.innerHTML='';
                let cloneTemplate=document.importNode(temCard, true);
                cloneTemplate.querySelector('#imagen').setAttribute('src',  rickmorty.results[selecion].image);
                cloneTemplate.querySelector('#imagen').setAttribute('alt',rickmorty.results[selecion].name);
                cloneTemplate.querySelector('#nombre').textContent=rickmorty.results[selecion].name;
                cloneTemplate.querySelector('#estado').textContent=rickmorty.results[selecion].status;
                cloneTemplate.querySelector('#genero').textContent=rickmorty.results[selecion].gender;
                cloneTemplate.querySelector('#especie').textContent=rickmorty.results[selecion].species;
                fragment.appendChild(cloneTemplate);
                main.appendChild(fragment);
           }
    }
   
        
    
}
function FechtDesple() {
    fetch(URL)
    .then(response => response.json())
    .then(selecionar=>{
        slecionar(selecionar)
    })
       
}
function FechtApi() {
    fetch(URL)
    .then(response => response.json())
    .then(nuevo=>{     
         Card(nuevo)
         
    })    
     
}



