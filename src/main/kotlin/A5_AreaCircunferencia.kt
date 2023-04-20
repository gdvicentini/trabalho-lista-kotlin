fun main(args: Array<String>) {
    println("Código para cálculo da Area da Circunferência")

    val pi = 3.14159265

    println("Informe o valor do raio em metros: ")
    val raioCircunferencia = readlnOrNull()?.toDoubleOrNull()

    if (raioCircunferencia == null) {
        println("O valor do raio não pode ser nulo.")
        return
    } else {
        val areaCircunferencia = pi * raioCircunferencia * raioCircunferencia

        println("O cálculo da área da circunferência será: $areaCircunferencia")
    }
}