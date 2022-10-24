import java.util.InputMismatchException

fun Ejercicio2(){
    var lado: Int
    println("Introduce el lado del cuadrado")
    lado = readLine()?.toIntOrNull()!!

    return println("El area del cuadrado es: ${lado*lado} y el perimetro es: ${lado*4}")

}



fun JuegoFizzBuzz(){

    do {
        var trash:Int?
        println("Introduce un numero")
        trash = readLine()?.toIntOrNull()
        var num: Int = trash ?:0



        var trashExit:Int?



        if (num%3==0 && num%5==0){
            println("Fizz-Buzz")
        }else if (num%5==0){
            println("Buzz")
        }else if (num%3==0){
            println("Fizz")
        }else{
            println("Numero no valido")
        }

        println("¿Quieres continuar?  Pulsa 1 para continuar o 0 para salir")
        trashExit = readLine()?.toIntOrNull()
        var exit:Int=trashExit ?:0



    }while (exit!=0)



}