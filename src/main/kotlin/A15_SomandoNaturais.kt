fun main(args: Array<String>) {
    println("Código para realizar a soma de numeros naturais de um intervalo determinado")

    println("O intervalo precisa ter 100 numeros naturais!")
    println("Informe o número do início do intervalo:")
    val inicio = readln().toInt()

    println("Informe o número do início do intervalo:")
    val fim = readln().toInt()

    var soma = 0

    println("Intervalo: $inicio a $fim")

    for (i in inicio..fim) {
        soma += i
    }

    println("Soma: $soma")
}