const number1= document.getElementById('number1');
const number2= document.getElementById('number2');

const sum= document.querySelector('#btn-sum');
const substr= document.querySelector('#btn-substr');
const multiply= document.getElementById('btn-multiply');
const division= document.getElementById('btn-div');
const result= document.getElementById('result');

sum.addEventListener('click',sum_operation);
substr.addEventListener('click',substr_operation);
multiply.addEventListener('click',multiply_operation);
division.addEventListener('click',division_operation);

function sum_operation(){
    let num1 =Number(number1.value) ;
    let num2 =Number( number2.value);
    result.textContent=`Su resultado es : ${num1+num2}`;
 }

 function substr_operation(){
    let num1 =Number(number1.value) ;
    let num2 =Number( number2.value);
   result.textContent=`Su resultado es : ${num1-num2}`;
  }

  function multiply_operation(){
    let num1 =Number(number1.value) ;
    let num2 =Number( number2.value);
result.textContent=`Su resultado es : ${num1*num2}`;  }

function division_operation(){
        let num1 =Number(number1.value) ;
        let num2 =Number( number2.value);
        if (num1 <=0 ||  num2 <=0) {
            result.textContent=`No se puede dividir por 0`;   
        }
        else {
            result.textContent=`Su resultado es : ${num1/num2}`;
             
        }
    }
// const number1= document.getElementById('number1');
// const number2= document.getElementById('number2');
// const multiply= document.getElementById('btn-substr');
// const result= document.getElementById('result');
// substr.addEventListener('click',substr_operation);
 

// const number1= document.getElementById('number1');
// const number2= document.getElementById('number2');
// const substr= document.getElementById('btn-multiply');
// const result= document.getElementById('result');
// multiply.addEventListener('click',multiply_operation);

 

// const number1= document.getElementById('number1');
// const number2= document.getElementById('number2');
// const division= document.getElementById('btn-div');
// const result= document.getElementById('result');
// multiply.addEventListener('click',division_operation);
//  




// console.log(calculate(5,8,2));

// function calculate(n1,n2,operation) {
//     switch (operation) {
//         case 1:return sum(n1,n2);break            
//         case 2:return substract(n1,n2);break
//         case 3:return multiply(n1,n2);break
//         case 4:return division(n1,n2);break
//         default:
//             break;
//     }
    
// }

// function substract(n1,n2){
//     return n1-n2;
// }
// function multiply(n1,n2){
//     return n1*n2;
// }
// function division(n1,n2){
//     return n1/n2;
// }
// //