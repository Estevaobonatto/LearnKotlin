class pessoas (

    var nome:String,
    var idade:Int,
    var email:String

)

fun main(){

    // nome      tipo       class   (parametros)
    val pessoa: pessoas = pessoas("ESTEVÃO", 19, "estevaobonatto")
    val pessoa2: pessoas = pessoas("HENRIQUE", 19, "henriquebonatto")
    val pessoa3: pessoas = pessoas("ADILSON", 57, "adilsonbonatto")

    println("Pessoa 1: ${pessoa.nome}")
    println("Pessoa 1: ${pessoa.idade}")
    println("Pessoa 1: ${pessoa.email}")

    println(" ")

    println("Pessoa 2: ${pessoa2.nome}")
    println("Pessoa 2: ${pessoa2.idade}")
    println("Pessoa 2: ${pessoa2.email}")

    println(" ")

    println("Pessoa 3: ${pessoa3.nome}")
    println("Pessoa 3: ${pessoa3.idade}")
    println("Pessoa 3: ${pessoa3.email}")

}