 open class Seleccion (var id: Int=0,var nome: String?="default value", var apelido:String="default value", var edade: Int=0){
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
