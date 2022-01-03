const ejecicio1 = document.getElementById('ejecicio1');
const temp1 = document.getElementById('temp1').content;
const ejecicio2 = document.getElementById('ejecicio2');
const temp2 = document.getElementById('temp2').content;
const ejecicio3= document.getElementById('ejecicio3');
const temp3 = document.getElementById('temp3').content;
const ejecicio4 = document.getElementById('ejecicio4');
const temp4 = document.getElementById('temp4').content;
const ejecicio5 = document.getElementById('ejecicio5');
const temp5 = document.getElementById('temp5').content;
const fragment = document.createDocumentFragment();

const animales = [
  {name:"Lobo", type:"Mamifero", age:5,color:"Gris"},
  {name:"Zorro", type:"Mamifero", age:2,color:"Amarillo"},
  {name:"Gato", type:"Mamifero", age:7,color:"Negro"},
  {name:"Caballo", type:"Mamifero", age:3,color:"Café"},
  {name:"León", type:"Mamifero", age:12,color:"Café"},
  {name:"Elefante", type:"Mamifero", age:13,color:"Gris"},
  {name:"Jirafa", type:"Mamifero", age:9,color:"Amarillo"},
  {name:"Tigre", type:"Mamifero", age:5,color:"Amarillo"},
  {name:"Ballena", type:"Mamifero", age:3,color:"Azul"},  
  {name:"Búho", type:"Ave", age:13,color:"Café"},
  {name:"Gallina", type:"Ave", age:9,color:"Blanco"},
  {name:"Águila", type:"Ave", age:4,color:"Rojo"},
  {name:"Perro", type:"Mamifero", age:5,color:"Blanco"},
  {name:"Toro", type:"Mamifero", age:12,color:"Negro"},
  {name:"Oveja", type:"Mamifero", age:13,color:"Blanco"},
  {name:"Hombre", type:"Mamifero", age:9,color:"Piel"},
];

const comienza = animales.filter((element) => element.name.startsWith('B'));
funcomienza(comienza);

const mayor = animales.filter((element) => element.age>5);
funmayor(mayor)

const pajaro = animales.filter((element) => element.age>10 && element.type=='Ave' );
funpajaro(pajaro);

const colorN = animales.filter((element) => element.color=="Negro" ).map(function(element) { return element.name });
funcolorN(colorN);

const noBlanco = animales.filter((element) => element.color!="Blanco")
funnoBlanco(noBlanco);

function funcomienza(arreglo) {
  arreglo.forEach(element => {
    let clone = document.importNode(temp1, true);

    clone.querySelector('#nombre').textContent = element.name;
    clone.querySelector('#tipo').textContent = element.type;
    clone.querySelector('#edad').textContent = element.age;
    clone.querySelector('#color').textContent = element.color;
    fragment.appendChild(clone) ;
  });
  ejecicio1.appendChild(fragment);
}

function funmayor(arreglo) {
  arreglo.forEach(element => {
    let clone = document.importNode(temp2, true);
    clone.querySelector('#nombre').textContent = element.name;
    clone.querySelector('#tipo').textContent = element.type;
    clone.querySelector('#edad').textContent = element.age;
    clone.querySelector('#color').textContent = element.color;
    fragment.appendChild(clone) ;
  });
  ejecicio2.appendChild(fragment);
}

function funpajaro(arreglo) {
  arreglo.forEach(element => {
    let clone = document.importNode(temp3, true);
    clone.querySelector('#nombre').textContent = element.name;
    clone.querySelector('#tipo').textContent = element.type;
    clone.querySelector('#edad').textContent = element.age;
    clone.querySelector('#color').textContent = element.color;
    fragment.appendChild(clone) ;
  });
  ejecicio3.appendChild(fragment);
}

function funcolorN(arreglo) {
  arreglo.forEach(element => {
    let clone = document.importNode(temp4, true);
    clone.querySelector('#nombre').textContent = element;
    fragment.appendChild(clone) ;
  });
  ejecicio4.appendChild(fragment);
}

function funnoBlanco(arreglo) {
  arreglo.forEach(element => {
    let clone = document.importNode(temp5, true);
    clone.querySelector('#nombre').textContent = element.name;
    clone.querySelector('#tipo').textContent = element.type;
    clone.querySelector('#edad').textContent = element.age;
    clone.querySelector('#color').textContent = element.color;
    fragment.appendChild(clone) ;
  });
  ejecicio5.appendChild(fragment);
}


// Crear grupos de máximo 3 integrantes y realizar los siguientes ejercicios.
// Entregar carpeta comprimida con cada uno de los ejercicios en js.


// 1. Mostrar todos los animales cuya inicial sea la letra B
// 2. Mostrar todos los animales que tengan más de 5 años.
// 3. Mostrar todos los animales que sean de tipo ave y tengan más de 10 años.
// 4. Muestre un Array con los nombres de todos los animales mamíferos de color negro.
// 5. Muestre un Array donde se excluyan los animales de color blanco.
