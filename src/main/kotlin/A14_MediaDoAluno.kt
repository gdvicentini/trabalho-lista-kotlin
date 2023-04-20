fun main(args: Array<String>) {
    println("Código que calcula a média do aluno (coitado kkk)")

    println("Digite as notas bimestrais do aluno (de 1 a 10):")
    print("Nota 1º bimestre: ")
    val nota1 = readln().toDouble()
    print("Nota 2º bimestre: ")
    val nota2 = readln().toDouble()
    print("Nota 3º bimestre: ")
    val nota3 = readln().toDouble()
    print("Nota 4º bimestre: ")
    val nota4 = readln().toDouble()

    val mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4

    println("Média final: $mediaAluno")

    if (mediaAluno >= 5) {
        println("Aprovado!!")
    } else {
        println("Reprovado!!")
    }
}