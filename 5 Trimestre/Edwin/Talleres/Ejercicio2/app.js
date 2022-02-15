const btnmas=document.getElementById('btnMas');
const btnmenos=document.getElementById('btnMenos');
const btnreset=document.getElementById('btnReset');
const imagen=document.getElementById('imagen');


let count=0;

btnmas.addEventListener('click', ()=>{
    count++;
    imagen.style.opacity=count + 'px'
    console.log(count)
    
})

btnmenos.addEventListener('click', ()=>{
    count--
    console.log(count)
})
btnreset.addEventListener('click', ()=>{
    count=0
    console.log(imagen)
    console.log(count)

})
if (count>0) {
    
}

