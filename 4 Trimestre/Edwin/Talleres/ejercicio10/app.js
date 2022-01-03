const btnColor = document.getElementById('btnColor');
const btnObtener = document.getElementById('btnObtener');
const superior = document.querySelector('#superior');
const btncard = document.getElementById('btncard');
const card = document.querySelector('#card');
const btndisminuir = document.getElementById('btndisminuir');
const btnaumentar = document.getElementById('btnaumentar');
const folder =document.querySelector('#folder');

let pixel = 3;


btnObtener.addEventListener('click', change_color);
btnaumentar.addEventListener('click',aumentar);
btndisminuir.addEventListener('click', disminuir);


function change_color(){

	superior.style.backgroundColor=btnColor.value ;
	btncard.style.backgroundColor=btnColor.value;
	folder.style.color=btnColor.value;
}


function aumentar(){
	pixel++;
    let sumar = pixel+'px';
	card.style.borderRadius=sumar;
	superior.style.borderTopLeftRadius=sumar;
	superior.style.borderTopRightRadius=sumar;
	console.log(sumar);
	
}
function disminuir(){
	pixel--;
    let restar = pixel+'px';
 
	card.style.borderRadius=restar;
	superior.style.borderTopLeftRadius=restar;
	superior.style.borderTopRightRadius=restar;
	console.log(restar);

	
}







