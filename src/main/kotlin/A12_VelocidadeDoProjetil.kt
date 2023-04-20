fun main(args: Array<String>) {
    println("Código do cálculo da velocidade de um projétil")

    println("Informe a distância percorrida em km:")
    val distancia = readlnOrNull()?.toDoubleOrNull()

    println("Informe o tempo percorrido em minutos:")
    val tempo = readlnOrNull()?.toDoubleOrNull()

    if (distancia == null || tempo == null) {
        println("Valor inválido para distância ou tempo.")
    } else {
        val velocidade = (distancia * 1000) / (tempo * 60)
        println("A velocidade do projétil é de $velocidade m/s.")
    }
}