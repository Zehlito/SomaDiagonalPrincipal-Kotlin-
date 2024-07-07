/*8 - Faça um algoritmo que leia uma matriz 5x5 do tipo inteiro e calcula a soma da sua diagonal principal
	1	0	0	0	0
	0	1	0	0	0
	0	0	1	0	0
	0	0	0	1	0
	0	0	0	0	1

 */
fun main() {
    val limits : Int = 5
    val myMatriz: Array<IntArray> = Array(limits) {IntArray(limits)}
    var soma : Int = 0

    // Leitura dos valores da matriz
    for (i in 0 ..<limits) {
        for (j in 0..<limits) {
            print("Informe o valor da linha ${i + 1}, coluna ${j + 1}: ")
            myMatriz[i][j] = readLine()!!.toInt()
        }
    }
    //Exibir a Matriz
    for (i in 0 ..<limits) {
        for (j in 0..<limits) {
            print(" [" + myMatriz[i][j] + "] ")
        }
        println(" ")
    }
    // Cálculo da soma dos elementos da matriz

    for (i in 0 ..<limits) {

            soma = soma + myMatriz[i][i]


    }
    // Impressão da soma
    println("A soma da diagonal principal da matriz é: $soma")
    
}