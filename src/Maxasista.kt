/*
* Clase Maxasista hija de Seleccion
* */
//d

class Maxasista(var titulacion: String, var anosExperiencia: Int, id: Int, nome: String, apelido: String, edade: Int)
    : Seleccion(id, nome, apelido, edade){

override fun toString(): String {
        return ("Maxasista: \n ID :\t" + super.id + "\n NOME: \t" + super.nome
                + "\n APELIDOS: \t" + super.apelido + "\n EDADE: \t" + super.edade
                + "\n TITULACION: \t" + titulacion + "\n ANOS DE EXPERIENCIA: \t" + anosExperiencia)
    }

    override fun viaxar() {
        println("\nViaxan os maxaxistas")
    }


    fun darMasaxes() {
        println("\nMaxasista traballando")
    }
}