package libreria.models.controller

import libreria.models.categoria

class categoriaController(id: Int, lista_categorias:ArrayList<categoria>){
    var id=0;
    var lista_categorias= mutableListOf<categoria>()
    fun agregar_categoria(descripcion: String){
        var categoria_nueva = categoria(id++,descripcion);
        lista_categorias.add(categoria_nueva)
    }
}

