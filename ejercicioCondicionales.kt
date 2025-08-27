fun main(){
    validacionEdad(21)
    validacionEdad(14)
    validacionEdad(11)
    validacionEdad(60)
}


fun validacionEdad(edad:Int){
    println("La Edad es de $edad")
    if(edad>= 18){
        println("Es Mayor de Edad")
    }
    else{
        println("Es menor de Edad")
    }
}
