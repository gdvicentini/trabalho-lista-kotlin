fun main(args: Array<String>) {
    println("Código de Ajuste Salarial")
    print("Digite o valor do salário mensal do trabalhador: ")

    val salarioAtual = readlnOrNull()?.toDouble()

    print("Digite o percentual de reajuste (em %): ")
    val percentualReajuste = readlnOrNull()?.toDouble()


    val novoSalario = salarioAtual?.times(1 + percentualReajuste?.div(100)!!)


    println("Novo salário: R$%.2f".format(novoSalario))
}