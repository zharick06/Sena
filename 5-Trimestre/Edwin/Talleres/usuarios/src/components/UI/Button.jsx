import React from 'react'

export const Button = ({idI, text, event}) => {
  return (
    <button id={idI} onClick={event}>{text}</button>
  )
}
