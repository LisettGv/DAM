package mascotas

open class mascotas(var nombre: String, var edad: Int){
    fun mostrarINfo():String{
        return "nombre: $nombre edad: $edad"
    }
}