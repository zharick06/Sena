const name= document.getElementById('name');
const date= document.getElementById('date');
const result= document.getElementById('result');

const send= document.querySelector('#btn-send');

send.addEventListener('click',alert_oper);

function alert_oper() {
    let nameUser=String(name.value);
    let dateUser=date.value;
    let birth=dateUser.split('-');

    let yearacr= new Date();
    let year=yearacr.getFullYear();
    let month=yearacr.getMonth()+1;
    let day =yearacr.getDate();

    let yyyy = year - birth[0];
    let mm = month - birth[1];
    let dd = day - birth[2];
    
    if(yyyy>=18 || mm===0 || dd === 0){
        result.textContent = `${nameUser}, Si puede votar`
    }else{       
        result.textContent = `${nameUser}, No puede votar`
    }
}
