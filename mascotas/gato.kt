package mascotas

class gato(nombre: String,edad:Int, var colorPelaje: String): mascotas(nombre, edad) {

    override fun mostrarInfo(){
        println(this.toString())
    }

    fun correr(){
        println("Miau, estoy corriendo rapido!")
    }

}