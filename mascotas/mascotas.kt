package mascotas

open class Mascotas(val nombre: String, var edad: Int) {
    open fun mostrarINfo(): String {
        "nombre: $nombre edad: $edad"
    }

    class Gato(nombre: String, edad:Int, val colorPelaje: String): Mascotas(nombre, edad) {
        fun correr(){
            println("El Gatito esta corriendo")
        }

        override fun mostrarINfo(){
            println("nombre: $nombre| edad: $edad| pelaje: $colorPelaje")
        }
    }

    class Pez(nombre: String, edad:Int, val sangreFria: Boolean): Mascotas(nombre, edad) {
        fun nadar(){
            println("El Pescado esta Nadando")
        }

        override fun mostrarINfo(){
            var estadoSangre = ""
            if(sangreFria==true){
                estadoSangre = "Es de sangre Fria"
            }
            else{
                estadoSangre = "Tiene la sangre Caliente"
            }

            println("nombre: $nombre|edad: $edad|sangreFria: $estadoSangre")

            }
        }

    fun main(){
        var miPez = Pez("Pepito",4,true)
        miPez.mostrarINfo()
        miPez.nadar()
    }

}