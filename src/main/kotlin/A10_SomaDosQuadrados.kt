fun main(args: Array<String>) {
    println("Código de realizar soma dos quadrados")

    println("Informe o primeiro número a ser armazenado:")
    val num1 = readlnOrNull()?.toInt() ?: 0

    println("Digite o segundo número a ser armazenado:")
    val num2 = readlnOrNull()?.toInt() ?: 0

    println("Digite o terceiro número a ser armazenado:")
    val num3 = readlnOrNull()?.toInt() ?: 0

    val somaDosQuadrados = num1 * num1 + num2 * num2 + num3 * num3

    println("A soma dos quadrados dos três números é: $somaDosQuadrados")
}