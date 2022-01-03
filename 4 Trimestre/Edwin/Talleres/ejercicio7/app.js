const numero = document.getElementById('numero');
const texto = document.getElementById('texto');
const contenedor = document.querySelector('.contenedor');

document.addEventListener('keyup', presionar);



var number_ramdon = (Math.random() * 100).toFixed(0);

function presionar(event) {
    var codigo = event.which || event.keyCode;



    if (codigo === 13) {

        console.log(number_ramdon)

        if (numero.value != number_ramdon) {
            if (numero.value < number_ramdon) {
                texto.textContent = `El numero es mayor`;
                document.getElementById("numero").value = "";
                texto.style.color = 'red';


            } else if (numero.value > number_ramdon) {
                texto.textContent = `El numero es menor`;
                document.getElementById("numero").value = "";
                texto.style.color = 'red';
            }

        } else {

            texto.style.color = 'white';
            texto.style.fontSize = 50;
            
            contenedor.style.backgroundColor = 'green';
            texto.textContent = `HAS ADIVINADO EL NUMERO`;





        }

    }

}