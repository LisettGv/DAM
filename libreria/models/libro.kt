package libreria.models

open class Libro(val isbn: String, val titulo: String, val descripcion: String, val categoria: categoria){
    open fun leer(){
        println("Estoy Leyendo $descripcion")
    }
    open fun guaradar(){
        println("Se ha guardado lobro $titulo")
    }
}