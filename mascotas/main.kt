package Mascotas

fun main (){
    var mascotas_1 = Gato ("Jack", 3, "ñiño")
    var mascotas_2 = Pez ("Nemo", 5, true)
    var mascota_base = Mascotas ("Luis", 6)
    println(mascotas_1.mostrarInfo())
    println(mascotas_2.mostrarInfo())
    println(mascota_base.mostrarInfo())
}
