/*fun main(){
    var lista=lostOf(1,2,5)
    println("lista:$lista")

    var conjunto=setOf(1,2,5)
    println("conjunto= $conjunto")

    var mapa=mapOf("nombre" to "juan", "edad" to 9, "dolares" to 1000)
    println("mapa: $mapa")
}
*/


/*fun main(){
    var lista=mutableListOf(1,2,5,8,1'0,33,67,100)
            lista.add(5)
            lista.add(5)
            lista.add(5)
            println("lista: $lista")

        var filtrado=lista.filter{ it % 2 ==0}
    println("filtrado: $filtrado")

    var doble=lista.map{ it +1}
    println("doble: $doble")

    var sumatoria=lista.sum()
    println("sumatoria: $sumatoria")

    var buscaElPar=lista.find{ it % 2! ==0}
    println("buscaElPar: $buscaElPar")

    var primerElemento=lista.first()
    println("primerElemento: $primerElemento")

    var ultimoElemento=lista.last()
    println("ultimoElemento: $ultimoElemento")

}
*/


/*fun main(){
    var lista=mutableListOf(1,2,5,8,1'0,33,67,100)
            println("lista: $lista")

        var filtrado=lista.filter{it % 2 ==0}
    println("filtrado: $filtrado")

    var doble=lista.map{it +1}
    println("doble: $doble")

    var sumatoria=lista.sum()
    println("sumatoria: $sumatoria")

    var buscaElPar=lista.find{it % 2! ==0}
    println("buscaElPar: $buscaElPar")

    var primerElemento=lista.first()
    println("primerElemento: $primerElemento")

    var ultimoElemento=lista.last()
    println("ultimoElemento: $ultimoElemento")

}
*/

//FOR
/*fun main(){
    var lista=mutableListOf(1,2,5,)
            println("lista: $lista")

        for (i in lista){
            println("El Elemento de la Lista es: $i")
        }

        var informacion = mapOf("Nombre" to "Fernanda","Edad" to 29)
        informacion.forEach {
            (llave,valor)-> println("La Llave es $llave y El Valor es $valor")
        }
}
*/

fun main(){
    val charmander = pokemon("Charmander", 40, 80)
    charmander.informacion()

}

class pokemon(
    //propiedades
    val nombre: String,
    val atk: Int,
    val hp: Int

){
    fun sePreparaParaLaBatalla(){
        println("El $nombre Se Prepara Para La Batalla")
    }
    fun informacion(){
        println("$nombre ATK:$atk HP:$hp")
    }

}



























