
const name= document.getElementById('name');
const age= document.getElementById('age');
const result= document.getElementById('result');

const send= document.querySelector('#btn-send');

send.addEventListener('click',alert_oper);

function alert_oper() {
    if (age.value<18) {
        result.textContent=`${name.value} no puede votar, usted es menor de edad `;
    }
    else{
        result.textContent=`${name.value} si puede votar, usted es mayor de edad `; 

    }
    
}
