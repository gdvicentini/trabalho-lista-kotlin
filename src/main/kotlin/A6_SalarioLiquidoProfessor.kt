fun main(args: Array<String>) {
    println("Código de calculo de salário líquido do professor")

    val salarioBruto: Double
    val salarioLiquido: Double
    val desconto: Double

    print("Por favor digite o valor da hora-aula: ")
    val valorHoraAula: Double = readln().toDouble()

    print("Agora informe o número de horas trabalhadas no mês: ")
    val numeroHorasTrabalhadas: Double = readln().toDouble()

    print("Para finalziar informe o percentual de desconto do INSS (em %): ")
    val percentualDesconto: Double = readln().toDouble()

    salarioBruto = valorHoraAula * numeroHorasTrabalhadas
    desconto = salarioBruto * (percentualDesconto / 100)
    salarioLiquido = salarioBruto - desconto

    println("O salário bruto e líquido do professor é:")
    println("Salário bruto: R\$ $salarioBruto")
    println("Salário líquido: R\$ $salarioLiquido")
}