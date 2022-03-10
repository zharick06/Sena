import React from 'react'

export const Input = ({idI,types, place}) => {
  return (
    <input id={idI} type={types} placeholder={place}></input>
  )
}
