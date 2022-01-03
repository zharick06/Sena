const URL='https://rickandmortyapi.com/api/character/?page=18';
const select=document.querySelector('#slect');
const main=document.querySelector('#main')
const temCard = document.querySelector('#temCard').content;
const fragment=document.createDocumentFragment();
select.addEventListener('click',FechtDesple())



function slecionar(rickmorty){
    rickmorty.result.forEach(element => {
        let option=document.createElement('option');
        option.value=element.id;
        option.innerHTML=element.name;
        select.appendChild(option);
  
    });
}

function cards(rickmorty){
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
 

function FechtDesple() {
    fetch(URL)
    .then(response => response.json())
    .then(selecionar=>{
        slecionar(selecionar)
    })
       
}