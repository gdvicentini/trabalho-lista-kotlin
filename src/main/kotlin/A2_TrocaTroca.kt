fun main(args: Array<String>) {
    println("Programa de TrocaTroca...")
    println("Informe dois valores para que seus valores troquem de posição:")

    print("Valor de A: ")
    var valorA = readln().toInt()

    print("Valor de B: ")
    var valorB = readln().toInt()

    println("Trocando os valores de posição...")
    println("Valores iniciais: ")
    println("A: $valorA \nB: $valorB")

    val temp = valorA
    valorA = valorB
    valorB = temp

    println("Valores trocados:")
    print("A: $valorA \nB: $valorB")
}