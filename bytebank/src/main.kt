fun main() {

    println("Bem vindo ao Bytebank")
    testaLacos()

    var contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(-200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran", )
    contaFran.numero = 1001
    contaFran.deposita(300.00)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaFran.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)

}

class Conta(
        var titular: String,
        val numero: Int,
        var teste: Int = 9
) {
    var saldo = 1.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        ₢₢
        if (saldo >= valor) {
            saldo -= valor
        }

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo += valor
            destino.deposita(valor)
            return true;
        } else {
            return false
        }
    }

}

fun testeCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

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