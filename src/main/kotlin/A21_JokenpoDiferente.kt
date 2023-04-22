import java.util.*

fun main(args: Array<String>) {
    println("Còdigo Pedra-Papel-Tesoura-Lagarto-Spock")

    println("Façam suas jogadas!")

    val jogadasPossiveis = listOf("pedra", "papel", "tesoura", "lagarto", "spock")

    val jogador1 = escolherJogada(jogadasPossiveis)
    val jogador2 = escolherJogada(jogadasPossiveis)

    println("Jogador 1 escolheu $jogador1")
    println("Jogador 2 escolheu $jogador2")

    val resultado = verificarResultado(jogador1, jogador2)
    println(resultado)
}

fun escolherJogada(jogadasPossiveis: List<String>): String? {
    print("Escolha sua jogada (${jogadasPossiveis.joinToString(", ")}): ")
    var jogada = readlnOrNull()?.lowercase(Locale.getDefault())
    while (jogada !in jogadasPossiveis) {
        print("Opção inválida. Escolha novamente (${jogadasPossiveis.joinToString(", ")}): ")
        jogada = readlnOrNull()?.lowercase(Locale.getDefault())
    }
    return jogada
}

fun verificarResultado(jogador1: String?, jogador2: String?): String {
    if (jogador1 == jogador2) {
        return "Empate!"
    }

    return when (jogador1) {
        "pedra" -> when (jogador2) {
            "lagarto", "tesoura" -> "Jogador 1 ganhou!"
            else -> "Jogador 2 ganhou!"
        }
        "papel" -> when (jogador2) {
            "pedra", "spock" -> "Jogador 1 ganhou!"
            else -> "Jogador 2 ganhou!"
        }
        "tesoura" -> when (jogador2) {
            "papel", "lagarto" -> "Jogador 1 ganhou!"
            else -> "Jogador 2 ganhou!"
        }
        "lagarto" -> when (jogador2) {
            "papel", "spock" -> "Jogador 1 ganhou!"
            else -> "Jogador 2 ganhou!"
        }
        "spock" -> when (jogador2) {
            "pedra", "tesoura" -> "Jogador 1 ganhou!"
            else -> "Jogador 2 ganhou!"
        }
        else -> "Opção inválida"
    }
}