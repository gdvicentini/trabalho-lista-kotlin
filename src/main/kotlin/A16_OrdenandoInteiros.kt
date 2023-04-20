fun main(args: Array<String>) {
    println("Código de ordenação de numeros inteiros")

    val array = IntArray(12)

    println("Digite 12 números inteiros para serem armazenados no array:")
    for (i in 0 until 12) {
        array[i] = readln().toInt()
    }

    array.sortDescending()

    println("Valores em ordem decrescente:")
    for (i in array.indices) {
        println(array[i])
    }
}