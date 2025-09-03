package libreria.models.controller

import libreria.models.categoria

class categoriaController{
    private var id=0;
    private var listarCategorias= mutableListOf<categoria>()
    fun agregar_categoria(descripcion: String){
        var categoria_nueva = categoria(id++,descripcion);
        listaRCategorias.add(categoria_nueva)
        println("Categoria Agregada $descripcion")
    }

    fun listar_categorias():{
        return println(listarCategorias.toString())
    }
}




