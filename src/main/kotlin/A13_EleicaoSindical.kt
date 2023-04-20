fun main(args: Array<String>) {
    println("Código de Eleição Sindical")
    println("Precisamos primeiro analisar a leitura dos votos, para depois efetuar os devidos cálculos")

    print("Informe a quantidade de votos válidos para o candidato A: ")
    val votosValidosA = readln().toInt()

    print("Informe a quantidade de votos válidos para o candidato B: ")
    val votosValidosB = readln().toInt()

    print("Informe a quantidade de votos válidos para o candidato C: ")
    val votosValidosC = readln().toInt()

    print("Informe a quantidade de votos nulos: ")
    val votosNulos = readln().toInt()

    print("Informe a quantidade de votos em branco: ")
    val votosBranco = readln().toInt()


    val numTotalEleitores = votosValidosA + votosValidosB + votosValidosC + votosNulos + votosBranco

    // Cálculo do percentual correspondente
    val percentualVotosValidos = (100 * (votosValidosA + votosValidosB + votosValidosC)) / numTotalEleitores
    val percentualVotosA = (100 * votosValidosA) / numTotalEleitores
    val percentualVotosB = (100 * votosValidosB) / numTotalEleitores
    val percentualVotosC = (100 * votosValidosC) / numTotalEleitores
    val percentualVotosNulos = (100 * votosNulos) / numTotalEleitores
    val percentualVotosBranco = (100 * votosBranco) / numTotalEleitores


    println("\nRESULTADOS:")
    println("Número total de eleitores: $numTotalEleitores")
    println("Percentual de votos válidos em relação à quantidade de eleitores: $percentualVotosValidos%")
    println("Percentual de votos válidos do candidato A em relação à quantidade de eleitores: $percentualVotosA%")
    println("Percentual de votos válidos do candidato B em relação à quantidade de eleitores: $percentualVotosB%")
    println("Percentual de votos válidos do candidato C em relação à quantidade de eleitores: $percentualVotosC%")
    println("Percentual de votos nulos em relação à quantidade de eleitores: $percentualVotosNulos%")
    println("Percentual de votos em branco em relação à quantidade de eleitores: $percentualVotosBranco%")
}