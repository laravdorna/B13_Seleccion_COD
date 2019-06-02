class Entrenador(var idFederacion:Int=0, String = "default value") : Seleccion{


    constructor(id: Int, nome: String, apelido: String, edade: Int) : super(id, nome, apelido, edade) {}

    constructor(idFederacion: String, id: Int, nome: String, apelido: String, edade: Int) : super(id, nome, apelido, edade) {
        this.idFederacion = idFederacion
    }

    override fun toString(): String {
        return ("Entrenador \n ID :\t" + super.id + "\n NOME: \t" + super.nome
                + "\n APELIDOS: \t" + super.apelido + "\n EDADE: \t" + super.edade
                + "\n ID FEDERACIÓN: \t" + idFederacion)
    }

    override fun viaxar() {
        println("\nViaxa o entrenador")
    }

    fun dirixirPartido() {
        println("\nDirixe o partido")
    }

    fun dirixirAdestramento() {
        println("\n Dirixe o adestramento")
    }
}

