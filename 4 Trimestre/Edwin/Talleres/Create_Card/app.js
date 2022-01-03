const main = document.querySelector('#main');

// Función para crear Cantidad de Cards indicadas

function create_Cards() {
    // Cantidad de Cards a generar
    const count_cards = 8;
    for (let i = 0; i < count_cards; i++) {
        const card = document.createElement('div');
        const title = document.createElement('h2');
        title.style.color = 'blue';
        title.style.fontSize = '2.5rem';
        title.textContent = 'Hola grupo';
        title.style.textAlign = 'center';
        card.classList.add('card');
        card.appendChild(title);
        main.appendChild(card);
    }
}


// Crear las cards consumiendo un array de objetos(el que se encuentra en js llamado colors.js)
const createElements = () => {
    colors.forEach((element) => {
        const card = document.createElement('div');
        const title_card = document.createElement('h2');
        title_card.textContent = element.name;
        title_card.style.fontSize = '1.5rem';
        card.classList.add('card');
        card.style.backgroundColor = element.code;
        card.appendChild(title_card);
        main.appendChild(card);

       
    });
}
createElements();
