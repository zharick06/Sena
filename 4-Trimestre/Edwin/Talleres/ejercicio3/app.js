const nota1=document.getElementById('nota1');
const nota2=document.getElementById('nota2');
const nota4=document.getElementById('nota4');

const send= document.querySelector('#btn-send');
send.addEventListener('click',calcular);

function calcular(){
    if (nota1.value <0 || nota1.value >5 || nota2.value <0 || nota2.value >5 ) {
        nota4.textContent=`Nota no valida`;
        
    } else {
        let nota3=(nota1.value*0.25) + (nota2.value*0.35);             
    let nota6= 5.0 - nota3;
    let nota5=nota6*0.40;
    let nota7=nota5+nota6;
    let nota8=(nota1.value*0.25) + (nota2.value*0.35)+(nota7*0.40); 
    if (nota7<=5) {
        nota4.textContent=`usted necesita ${nota7} minimo para pasar el semestre, con una nota de ${nota8}`;
        
    } else {
        nota4.textContent=`Usted necesita mas de 5 para pasar, asi que no pasa el semestre, esto es lo que necesitas${nota7}`;
    }
        
    }


    

   
    



}
