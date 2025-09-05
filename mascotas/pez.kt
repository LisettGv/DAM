package mascotas

class Pez (nombre: String, edad:Int, var sangreFria: Boolean): mascotas(nombre, edad) {

    override fun mostrarInfo():String{
        return "Soy $nombre, tengo $edad, y soy de Sangre Fria? $sangreFria"
    }

    fun nadar(){
        println("Glue Glue Glue")
    }
}

