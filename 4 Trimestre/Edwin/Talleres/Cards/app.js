const main= document.querySelector('#main');
const contenedor = document.querySelector('#contenedor_card');
const footer=document.querySelector('.pie');
const templateCarrito=document.getElementById('template-carrito').content ;

const contenedor_table=document.querySelector('#contenedorTable');


const fragment = document.createDocumentFragment();


let productos=[
    { nombre: 'La Belle Ferronniere',     imagen: 'img/renacentismo/belle.jpg',          autor:'Leonardo da Vinci'     },
    { nombre: 'Cabeza de Leda',           imagen: 'img/renacentismo/cabezaleda.jpg',     autor:'Leonardo da Vinci'    },
    { nombre: 'Cabeza de Muchacha',       imagen: 'img/renacentismo/cabezamuchacha.jpg', autor:'Leonardo da Vinci'     },
    { nombre: 'La Dama del Armiño',       imagen: 'img/renacentismo/dama.jpg',           autor:'Leonardo da Vinci'     },
    { nombre: 'Estudio de Manos y Brazos',imagen: 'img/renacentismo/estudio.jpg',        autor:'Leonardo da Vinci'     },
    { nombre: 'La Scapigliata',           imagen: 'img/renacentismo/lascapigliata.jpg',  autor:'Leonardo da Vinci'     },
    { nombre: 'Leda y el Cisne',          imagen: 'img/renacentismo/ledacisne.jpg',      autor:'Leonardo da Vinci'     },
    { nombre: 'La Mona Lisa',             imagen: 'img/renacentismo/monalisa.jpg',       autor:'Leonardo da Vinci'     },
    { nombre: 'Virgen del Huso',          imagen: 'img/renacentismo/virgenhuso.jpg',     autor:'Leonardo da Vinci'     },
    {nombre:'Head of a Girl ',            imagen: 'img/renacentismo/headofagirl.jpg',    autor:'John William Godward'  },
    {nombre:'La virgen del jilguero',     imagen: 'img/renacentismo/virgen.jpg',         autor:'Rafael Sanzio'   },      
    { nombre: 'Virgen de las Rocas',      imagen: 'img/renacentismo/Virgenrocas.jpg',    autor:'Leonardo da Vinci'     }
]


main.addEventListener('click', e=>{
    addCarrito(e);
})

create_card();


function create_card(){
    productos.forEach(producto =>{
        const card=document.createElement('div');
        const card_icon=document.createElement('div');
        const card_info=document.createElement('div');
        const nombre=document.createElement('h2');
        const imagen=document.createElement('img');
        const autor=document.createElement('p');
        const btn_card=document.createElement('button');


        card.classList.add('card');
        card.setAttribute('id','card');
        card_icon.classList.add('icon');
        card_icon.setAttribute('id', 'icon');
        card_info.classList.add('info_card');
        card_info.setAttribute('id', 'info_card');
        nombre.setAttribute('id','nombre');
        nombre.textContent=producto.nombre;
        imagen.setAttribute('id', 'image');
        imagen.setAttribute('src', producto.imagen);
        autor.classList.add('autor');
        autor.setAttribute('id', 'parrafo')
        autor.textContent=producto.autor;
        btn_card.classList.add('btn-agregar');
        btn_card.setAttribute('id', 'btn');
        btn_card.textContent="Agregar";

 
        card.appendChild(card_icon);
        card_icon.appendChild(imagen);
        card.appendChild(card_info);
        card_info.appendChild(nombre);
        card_info.appendChild(autor);
        card_info.appendChild(btn_card);
        fragment.appendChild(card);
    })
        contenedor.appendChild(fragment);
        main.appendChild(contenedor);

}

const addCarrito = e=>{
  
    if(e.target.classList.contains('btn-agregar')){
        setCarrito(e);
    }
    e.stopPropagation() ;
}


function setCarrito(e){
    const button = e.target ;
    
    const item=button.closest('.card');


    const itemNombre = item.querySelector('h2').textContent;
    const itemAutor= item.querySelector('.autor').textContent;
    const itemImagen = item.querySelector('img').src;
    const itemId= item.querySelector('button').dataset.id;
    addItem(itemImagen, itemAutor, itemNombre, itemId); }

function addItem(itemImagen, itemAutor, itemNombre, itemId){
    

    const Nobra=footer.getElementsByClassName('nombre') 
    
    for (let i = 0; i <Nobra.length; i++) { 
        
        if(Nobra[i].innerText === itemNombre){
            let elementoCantidad=Nobra[i].parentElement.querySelector('.cantidad')

            elementoCantidad.value++;
           return
        }
        
    }

    const contenedor_table=document.createElement('div');
    contenedor_table.setAttribute('id', 'contenedorTable');
    templateCarrito.querySelector('img').src = itemImagen ;
    templateCarrito.querySelector('span').textContent=itemAutor;
    templateCarrito.querySelectorAll('td')[2].textContent=itemNombre;
    templateCarrito.querySelectorAll('td')[0].textContent=itemId;

    const clone = templateCarrito.cloneNode(true);

    fragment.appendChild(clone);
    contenedor_table.appendChild(fragment);
    footer.appendChild(contenedor_table);

    contenedor_table.querySelector('.button-delete').addEventListener('click',  eliminarItem) ;
 
    contenedor_table.querySelector('.cantidad').addEventListener('change', cambiarCantidad);
   
}


function eliminarItem(event){ 
    const button = event.target ;

    button.closest('#contenedorTable').remove();
    
}


function cambiarCantidad(event){
    const input=event.target; 
    
    if(input.value <=0){
        input.closest('#contenedorTable').remove();
            
       
    }
  
   
}


