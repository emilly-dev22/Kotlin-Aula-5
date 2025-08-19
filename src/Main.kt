fun main(Args: Array<String>) { // Função principal
    println(soma(8,2)) // chama a função soma e é passado dois argumentos
    println(soma(3)) // chama a função soma e é passado um argumentos
}
fun soma(a: Int, b: Int = 1): Int { // Define a função soma, que recebe dois parametros do tipo inteiro, sendo "b"  o valor padrão
    return a + b // função que retorna a soma dos argumentos passados
}