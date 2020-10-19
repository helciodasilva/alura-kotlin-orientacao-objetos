fun main() {

    println("Bem vindo ao Bytebank")
    testaLacos()

    var contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.00

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar() {

    }


}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor}

fun testeCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaMaria.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaJoao.titular}")

    print(contaJoao)
    print(contaMaria)
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 5 downTo 1) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)
}


fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("cpmta é positiva")
    } else if (saldo == 0.0) {
        println("cpmta é neutra")
    } else {
        println("cpmta é negativa")
    }

    when {
        saldo > 0.0 -> println("cpmta é positiva")
        saldo == 0.0 -> println("cpmta é neutra")
        else -> println("cpmta é negativa")
    }
}