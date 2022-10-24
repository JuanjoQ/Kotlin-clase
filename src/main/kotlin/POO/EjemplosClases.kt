package POO

class EjemplosClases (var modelo:String, var puertas:Int, var velocidad:Int, val asientos:Int) {


    init {
        modelo = modelo.toUpperCase()

        if (velocidad<0 || velocidad>=300) velocidad=0

        if (puertas<=0 || puertas>5) puertas=1


    }

    fun cambiarVelocidad(nuevaVelocidad:Int){
        velocidad=nuevaVelocidad
        println("La nueva velocidad es $velocidad")
    }

    fun detener(detencion:Int){
        velocidad=detencion

    }

}


data class Vehiculo (var modelo:String, var puertas: Int, var velocidad: Int, var asientos: Byte)
{var potenciaMax:Int=300}

fun crearVehiculo(){

    var listaCompra:MutableList<String>



    val coche= Vehiculo("Seat",0,260,5)

    println("Los datos del coche son: ${coche.toString()}")

}



class Persona (var nombre: String, var edad: Int){

    fun comprobar_edad(){
        if(edad<18 )
            println("La persona es menor")
        else if (edad in 18..29)
            println("La persona es joven")
        else
            println("La persoan es mayor")
    }
}

 class personaInterfaz (var nombre: String, var apellido:String, override val tipoPersona: String):MyInterfacePersona{
    inner class empleado(var nombre: String,var sueldo:Float){
        fun imprimirDatos(){
            println("$nombre, $apellido, $sueldo")

        }

    }

    override fun imprimirDatos(){
        println("$nombre, $apellido")
    }

}