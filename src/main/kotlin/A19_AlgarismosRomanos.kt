fun main(args: Array<String>) {
    println("Código de Algarismos Romanos")
    println("O código vai ler o valor em numeros romanos e converter para numeral natural")

    println("Informe o valor que deseja converter:")
    val romano = readln()

    val resultado = romanoParaNumeral(romano)
    println("O numeral romano $romano equivale ao número $resultado")
}

fun romanoParaNumeral(s: String): Int {
    var resultado = 0
    var i = 0
    while (i < s.length) {
        val current = getValue(s[i])
        val next = if (i + 1 < s.length) getValue(s[i + 1]) else 0
        if (current < next) {
            resultado += next - current
            i += 2
        } else {
            resultado += current
            i++
        }
    }
    return resultado
}

fun getValue(c: Char): Int {
    return when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}