//DOM: Document object Mode

//las variables se hacen con let, var o const 
let name = 'mariana';
let age = 90;
let eat = true;
//lista
let array = [1, 2, 3];
//diccionario pero aqui se llama objeto
let object = { color: 'blue', language: 'spanish' }
    //typeof = es el tipo de variable
console.log(typeof age);
//para ambia el tipo de variable
console.log(typeof parseInt(age));

//para llamar a la etiqueta completa del html
const title = document.querySelector('#h1-title');
const title1 = document.getElementById('h1-title');

//el console es imprimir en la consola
//imprimir lo que halla dentro de la etiqueta
console.log(title.textContent)
    //colocar color al texto
title.style.color = 'red';

//es el evento del html
sum.addEvenListener():

    //parametro es un valor desconocida






    //para saber el valor de una tecla

    function onKeyDownHandler(event) {

        var codigo = event.which || event.keyCode;

        console.log("Presionada: " + codigo);

        if (codigo === 13) {
            console.log("Tecla ENTER");
        }

        if (codigo >= 65 && codigo <= 90) {
            console.log(String.fromCharCode(codigo));
        }




    }