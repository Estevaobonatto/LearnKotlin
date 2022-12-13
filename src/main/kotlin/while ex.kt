//MEDIA DE TEMPERATURAS

fun main(){
    var temperatura: Int = 0;
    var soma:Int = 0;
    var quantidade: Int = 0;

    while (temperatura != 999){ //SE FOR VERDADEIRO CONTINUA
        println("Digite uma temperatura ou '999' para sair")
        temperatura = readLine()!!.toInt() //TRANSFORMA PARA NUMERO DE FORMA INSEGURA

        if (temperatura != 999){
            soma = temperatura + soma
            quantidade++
        }

    }

    println("A media das temperaturas é = ${soma / quantidade} ºC")

}