fun main(args: Array<String>) {
    println("Còdigo FizzBuzz")
    println("O código consiste em receber um intervalo de números, onde caso o número for" +
        "divisível por 3, por 5 ou por ambos, teremos impressões do FizzBuzz")

    println("Digite o valor inicial do intervalo desejado:")
    val valorInicial = readlnOrNull()?.toInt() ?: 0

    println("Digite o valor final do intervalo desejado:")
    val valorFinal = readlnOrNull()?.toInt() ?: 0

    if (valorFinal <= valorInicial) {
        println("O número final deve ser maior que o número inicial, por favor, inicie o programa novamente.")
        return
    } else {
        fizzBuzz(valorInicial, valorFinal)
    }

}

fun fizzBuzz(inicio: Int, fim: Int) {
    for (i in inicio..fim) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}