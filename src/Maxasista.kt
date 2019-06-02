class Maxasista(var titulacion: String="default values", var anosExperiencia: Int = 0): Seleccion{


    constructor(id: Int, nome: String, apelido: String, edade: Int) : super(id, nome, apelido, edade) {}

    constructor(titulacion: String, anosExperiencia: Int, id: Int, nome: String, apelido: String, edade: Int) : super(id, nome, apelido, edade) {
    this.titulacion = titulacion
    this.anosExperiencia = anosExperiencia
}

    override fun toString(): String {
        return ("Maxasista: \n ID :\t" + super.id + "\n NOME: \t" + super.nome
                + "\n APELIDOS: \t" + super.apelido + "\n EDADE: \t" + super.edade
                + "\n TITULACION: \t" + titulacion + "\n ANOS DE EXPERIENCIA: \t" + anosExperiencia)
    }

    override fun viaxar() {
        println("\nViaxan os maxaxistas")
    }


    fun darMasaxes() {}
}