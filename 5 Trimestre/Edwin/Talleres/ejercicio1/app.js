const text=document.getElementById('text');
const btn1= document.getElementById('btn1');
const btn2=document.getElementById('btn2');
const btn3=document.getElementById('btn3');
const btn4=document.getElementById('btn4')

btn1.addEventListener('click', () => {
    text.value = text.value.toUpperCase()
})

btn2.addEventListener('click', () => {
    text.value = text.value.toLowerCase()
})
btn3.addEventListener('click', () => {
    text.value = text.value[0].toUpperCase() + text.value.slice(1);
})

btn4.addEventListener('click', () => {
    text.value = ''
})



