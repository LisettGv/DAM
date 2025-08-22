fun main(){
    println("inicio de programa")

    val sum = 5+3
    val res = 5-3
    val mul = 5*3
    val div = 5/3
    val mod = 5 % 3

    println ("sum: $sum")
    println ("res: $res")
    println ("mul: $mul")
    println ("div: $div")
    println ("mod: $mod")


    /*Creando Funciones*/

    fun suma(a:Int,b:Int):int{
        return a+b;
    }

    fun res(a:Int,b:Int):int{
        return a-b;
    }

    fun nul(a:Int,b:Int):int{
        return a*b;
    }

    fun div(a:Int,b:Int):int{
        return a/b;
    }

    fun mod(a:Float,b:Float):Float{
        return a%b;
    }
}

