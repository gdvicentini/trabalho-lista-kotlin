fun main(args: Array<String>) {
    println("Calculo de conversão de dolar para real")

    println("Primeiro, informe o valor da cotação do dolar: ")
    val cotacaoDolar = readln().toDoubleOrNull()

    if(cotacaoDolar == null || cotacaoDolar <= 0) {
        println("Valor de cotação informada foi inválida. Inicie o programa novamente.")
        return
    } else {
        println("Informe a quantidade em dolar que deseja converter: ")
        val valorDolar = readln().toDoubleOrNull()

        if(valorDolar == null || valorDolar <=0) {
            println("Quantidade informada foi inválida. Inicie o programa novamente.")
            return
        } else {
            val valorReal = valorDolar * cotacaoDolar

            println("O valor convertido em reais será de: R\$%.2f".format(valorReal))
        }
    }
}