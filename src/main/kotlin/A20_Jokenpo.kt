import java.util.*

fun main(args: Array<String>) {
    println("Código de Jogo Jokenpo")

    println("Digite a jogada do jogador 1 (pedra, papel ou tesoura):")
    val jogada1 = readlnOrNull()?.lowercase(Locale.getDefault())
    println("Digite a jogada do jogador 2 (pedra, papel ou tesoura):")
    val jogada2 = readlnOrNull()?.lowercase(Locale.getDefault())

    if (jogada1 == null || jogada2 == null) {
        println("Jogada inválida, tente novamente!")
    } else if (jogada1 == jogada2) {
        println("Empate!")
    } else if (jogada1 == "pedra" && jogada2 == "tesoura" ||
        jogada1 == "tesoura" && jogada2 == "papel" ||
        jogada1 == "papel" && jogada2 == "pedra") {
        println("Jogador 1 venceu!")
    } else if (jogada2 == "pedra" && jogada1 == "tesoura" ||
        jogada2 == "tesoura" && jogada1 == "papel" ||
        jogada2 == "papel" && jogada1 == "pedra") {
        println("Jogador 2 venceu!")
    } else {
        println("Jogada inválida, tente novamente!")
    }
}