
fun main(args: Array<String>) {

    println("Código Two-Fer")
    println("Informe um nome para aplicar o código Two-Fer:")

    val nome = readLine()

    if(nome == null || nome == "") {
        println("Um para você, um para mim.")
    } else {
        println("Um para ${nome}, um para mim.")
    }

}
