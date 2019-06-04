/*
* Clase Xogador hija de Seleccion
* */
//dd

class Xogador(var dorsal: Int , var demarcacion: String ,id: Int, nome: String, apelido: String, edade: Int)
    : Seleccion(id, nome, apelido, edade) {


    init {

    }

    override fun toString(): String {
        return ("Xogador: \n ID :\t" + super.id + "\n NOME: \t" + super.nome
                + "\n APELIDOS: \t" + super.apelido + "\n EDADE: \t" + super.edade
                + "\n DORSAL: \t" + dorsal + "\n DEMARCACION: \t" + demarcacion)
    }

    override fun viaxar() {
        println("\n Viaxan os xogadores")
    }


    fun xogarPartido() {
        println("\n Xoga o partido")
    }

    fun entrenar() {
        println(nome + " entrena hoxe\n")
    }

}