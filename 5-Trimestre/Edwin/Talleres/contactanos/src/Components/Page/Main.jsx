import React from 'react'
import emailjs from '@emailjs/browser'

export const Main = () => {
  const sendEmail=(event)=>{
    event.preventDevault();
    emailjs.sendForm('service_f5kr2nl','template_i0ig5xn',event.target,'yd4TenmBJjML3yvNt')
    .then(response=> console.log(response))
    .catch(error=>console.log(error))
  }


  return (
    <div className='div-form'>
      <h1 className='title-form'>Contact Us</h1>
      <form className='form-mail' onSubmit={sendEmail}>
        <label>Name</label>
        <input type="text" name='user_name'/>
        <hr/>

        <label>Email</label>
        <input type="email" name='user_email'/>
        <hr/>

        <label>Message</label>
        <textarea mane='user_message' id='' cols="30" rows="10"></textarea>
        <hr/>
        <button>Send</button>
      </form> 
    </div>
  )
}
