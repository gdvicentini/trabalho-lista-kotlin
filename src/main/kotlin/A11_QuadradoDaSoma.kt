fun main(args: Array<String>) {
    println("Código de realizar o quadrado das somas")

    println("Informe o primeiro número a ser armazenado:")
    val num1 = readlnOrNull()?.toInt() ?: 0

    println("Digite o segundo número a ser armazenado:")
    val num2 = readlnOrNull()?.toInt() ?: 0

    println("Digite o terceiro número a ser armazenado:")
    val num3 = readlnOrNull()?.toInt() ?: 0

    val soma = num1 + num2 + num3
    val quadradoDaSoma = soma * soma

    println("O quadrado da soma dos três números é: $quadradoDaSoma")
}