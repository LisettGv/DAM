package libreria.models

import libreria.controller.categoriacontroller
import libreria.models.controller.categoriaController

fun main(){
    var cc = categoriaController()
    cc.agregar_categoria("Terror")
    cc.agregar_categoria("Fantasia")
    cc.agregar_categoria("Ciencia Ficcion")
    cc.listar_categorias()
}


