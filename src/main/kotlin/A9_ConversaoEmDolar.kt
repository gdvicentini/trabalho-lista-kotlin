fun main(args: Array<String>) {
    println("Calculo de conversão de real para dolar")

    println("Primeiro, informe o valor da cotação do dolar: ")
    val cotacaoDolar = readln().toDoubleOrNull()

    if(cotacaoDolar == null || cotacaoDolar <= 0) {
        println("Valor de cotação informada foi inválida. Inicie o programa novamente.")
        return
    } else {
        println("Informe a quantidade em reais que deseja converter: ")
        val valorReal = readln().toDoubleOrNull()

        if(valorReal == null || valorReal <=0) {
            println("Quantidade informada foi inválida. Inicie o programa novamente.")
            return
        } else {
            val valorDolar = valorReal / cotacaoDolar

            println("O valor convertido em dolares será de: US\$%.2f".format(valorDolar))
        }
    }
}