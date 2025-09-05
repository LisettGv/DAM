package mascotas

class pez (nombre: String, edad:Int, var sangreFria: Boolean): mascotas(nombre, edad) {

    override fun mostrarInfo(){
        println(this.toString())
    }

    fun nadar(){
        println("Glue Glue Glue")
    }
}

