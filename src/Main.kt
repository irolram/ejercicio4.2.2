class persona(var nombre: String, var peso: Double, var altura:Double){


    val imc: Double
        get() { //hago un get para poder acceder a él, pero no le hago set para que no se pueda modificar
            return peso/(altura*altura)
        }
    init {
        require(peso>0) {"El peso debe ser mayor que 0"}
        require(altura in 0.0..2.5) {"La altura debe ser mayor que 0 y menor de 2,5"}
    }


    constructor(peso: Double, altura: Double) : this("", peso, altura) {


    }
    override fun toString():String{
        return "Nombre:$nombre peso: $peso, altura: $altura"


    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is persona) return false
        return nombre == other.nombre && peso == other.peso && altura == other.altura
    }
}




fun pedir_nombre(): String {
    print("Ingrese su nombre: ")
    val nombre = readLine()!!
    if (nombre.isEmpty()) return pedir_nombre()
    return nombre
}

fun main() {
    try {
        val nuevonombre = pedir_nombre()


        val persona1 = persona(nuevonombre, 80.5, 1.7)
        println(persona1)
    }catch (e:Exception){
        println(e.message)
    }


    val persona3 = persona( 50.5, 1.8)
    // persona3.altura=1.9
    println(persona3)
    println("IMC: ${persona3.imc}")


    val persona2 = persona(80.0,1.4)
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)
    println(persona2==persona3)
}
