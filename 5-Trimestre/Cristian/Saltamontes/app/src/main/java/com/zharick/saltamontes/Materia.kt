package com.zharick.saltamontes

class Materia(nombre:String, nota:Double) {
    var nombreMateria:String=nombre
    var promedioMateria:Double=nota

    override fun toString(): String {
        return "Materia(nombreMateria='$nombreMateria', promedioMateria=$promedioMateria)"
    }

}