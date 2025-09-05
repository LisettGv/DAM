package mascotas

class Gato(nombre: String, edad:Int, val colorPelaje: String): Mascotas(nombre, edad) {

    fun correr(){
        println("Miau, estoy corriendo rapido!")
    }

    override fun mostrarInfo():String{
        "Nombre: $nombre, Edad: $edad, colorPelaje: $colorPelaje"
    }
}