/*
* Clase padre Seleccion
* */

open class Seleccion (var id: Int,var nome: String , var apelido:String="" , var edade: Int ){
    override fun toString(): String {
        return "Plantilla: \n ID :\t$id\n NOME: \t$nome\n APELIDOS: \t$apelido\n EDADE: \t$edade"
    }

    fun concentrarse() {

        println("\n\t\tConcentrase a selección")
    }

    fun viaxar() {
        println("\n\t\tViaxa a selección")
    }

}
