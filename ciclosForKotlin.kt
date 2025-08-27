
fun main(){

    for(i in 1 .. 10){
        println("Vamos en el valor $i")
    }
}



/*Ejercicio 1*/

fun main() {

    for (i in 1..20) {
        if (i==5|| i in 11..19){
            continue
        }
        println(i)
    }
}


/*Ejercicio 2*/

fun main() {

    for (i in 2..20) {
        if(i % 2 ==0){
            println(i)
        }
    }
}

