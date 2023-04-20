fun main(args: Array<String>) {
    println("Código de leitura e avaliação de palindromo")

    println("Palindromo são palavras que se ler elas ao contrário, ela continua sendo a mesma coisa")
    println("Ex: ovo, osso, radar, Renner etc")
    println("Sendo assim, o código vai ser a palavra e informar se é um palindromo ou não")

    print("Para prosseguir, informe uma palavra, frase ou números: ")
    val palavra = readln()

    val palindromo = palavra == palavra.reversed()

    if(palindromo) {
        println("A palavra $palavra é um palíndromo!!")
    } else {
        println("A palavra $palavra não é um palíndromo!!")
    }


}