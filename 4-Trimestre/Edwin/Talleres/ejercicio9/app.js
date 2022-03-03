const main=document.getElementById('main');
const fragment=document.createDocumentFragment();


const renacentista = [
    { nombre: 'La Belle Ferronniere',     imagen: '../ejercicio9/img/renacentismo/belle.jpg',          autor:'Leonardo da Vinci'     },
    { nombre: 'Cabeza de Leda',           imagen: '../ejercicio9/img/renacentismo/cabezaleda.jpg',     autor:'Leonardo da Vinci'    },
    { nombre: 'Cabeza de Muchacha',       imagen: '../ejercicio9/img/renacentismo/cabezamuchacha.jpg', autor:'Leonardo da Vinci'     },
    { nombre: 'La Dama del Armiño',       imagen: '../ejercicio9/img/renacentismo/dama.jpg',           autor:'Leonardo da Vinci'     },
    { nombre: 'Estudio de Manos y Brazos',imagen: '../ejercicio9/img/renacentismo/estudio.jpg',        autor:'Leonardo da Vinci'     },
    { nombre: 'La Scapigliata',           imagen: '../ejercicio9/img/renacentismo/lascapigliata.jpg',  autor:'Leonardo da Vinci'     },
    { nombre: 'Leda y el Cisne',          imagen: '../ejercicio9/img/renacentismo/ledacisne.jpg',      autor:'Leonardo da Vinci'     },
    { nombre: 'La Mona Lisa',             imagen: '../ejercicio9/img/renacentismo/monalisa.jpg',       autor:'Leonardo da Vinci'     },
    { nombre: 'Virgen del Huso',          imagen: '../ejercicio9/img/renacentismo/virgenhuso.jpg',     autor:'Leonardo da Vinci'     },
    {nombre:'Head of a Girl ',            imagen: '../ejercicio9/img/renacentismo/headofagirl.jpg',    autor:'John William Godward'  },
    {nombre:'La virgen del jilguero',     imagen: '../ejercicio9/img/renacentismo/virgen.jpg',         autor:'Rafael Sanzio'   },      
    { nombre: 'Virgen de las Rocas',      imagen: '../ejercicio9/img/renacentismo/Virgenrocas.jpg',    autor:'Leonardo da Vinci'     }
]
const createRenaissance = () => {
    let cloneTemplate=
    renacentista.forEach((element) => {
        const card = document.createElement('div');
        const nombreObra = document.createElement('h4');
        const author=document.createElement('p');
        const imag = document.createElement('img');
        const buton = document.createElement('button')

        buton.setAttribute('id', 'btn')
        buton.innerHTML='agregar';
        imag.src= element.imagen;
        nombreObra.innerHTML =element.nombre;
        author.innerHTML=element.autor;
        nombreObra.style.fontSize = '1.5rem';


        card.classList.add('card');
        card.appendChild(imag);
        card.appendChild(nombreObra);
        card.appendChild(author);
        card.appendChild(buton);
        main.appendChild(card);
       

      
    });
    
}
main.addEventListener('click', e=>{
    addCarrito(e)
})
const addCarrito = e=>{
    console.log(e.target) 
    if(e.target.classList.contains('btn')){
        setCarrito(e)
    }
    e.stopPropagation()}

function setCarrito(e){

    let cloneTemplate=document.importNode(templatecar, true);
    cloneTemplate.querySelector('#image').setAttribute('src',);
   cloneTemplate.querySelector('#nombre').textContent=rickmorty.results[selecion].species;
    fragment.appendChild(cloneTemplate);
    main.appendChild(fragment);
}



createRenaissance();
