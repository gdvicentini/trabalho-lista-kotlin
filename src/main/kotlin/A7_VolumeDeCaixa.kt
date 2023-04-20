fun main(args: Array<String>) {
    println("Código que calcula volume de caixa:")

    val volume: Int

    println("Informe o comprimento da caixa em cm: ")
    val comprimento = readln().toInt()

    println("Informe a largura da caixa em cm: ")
    val largura = readln().toInt()

    println("Informe a altura da caixa em cm: ")
    val altura = readln().toInt()

    volume = comprimento * largura * altura

    println("O volume da caixa é de: $volume cm^3")
}