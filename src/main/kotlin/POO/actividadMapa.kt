package POO

fun mapa(){
    var mapa1:Map<String,Int> = mapOf("Vaticano" to 825,"Andorra" to 77000,"Luxemburgo" to 632000,"España" to 47000000, "Brasil" to 212000000)
    println("La cantidad de elementos es: ${mapa1.size}")
    println("La cantidad de habitantes en españa y brasil es de : ${mapa1.get("España")} y ${mapa1.get("Brasil")}")


}



data class hola(var uwu:Int){
    


}