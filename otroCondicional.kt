fun main(){
    dividir(4,2)
    dividir(9,3)
    dividir(10,5)
    dividir(10,0)
}


fun dividir(a: Int, b:Int){
    println("Voy a Dividir $a entre $b")
    if(b !=0){
        println(a/b)
    }
    else{
        println("No se Puede Dividir por 0")
    }
}
