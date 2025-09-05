package mascotas

open class Mascotas(val nombre: String, var edad: Int){
    fun mostrarINfo(){
        println( "nombre: $nombre edad: $edad")
    }

    fun main(){
        var miMascota = Mascota("Pepito",4)
        miMascota.mostrarInfo()
    }

}