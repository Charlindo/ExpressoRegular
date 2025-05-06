fun main() {
    // Função para cadastrar nome
    fun cadastrar() {
        var nome: String
        do {
            print("Digite seu nome (apenas letras): ")
            nome = readLine() ?: ""
        } while (!nome.matches(Regex("^[a-zA-Z]+$")))
        println("Nome cadastrado: $nome")
    }

    fun editar() {
        var posicao: String
        var resposta: String

        do {
            print("Digite a posição (apenas números): ")
            posicao = readLine() ?: ""
        } while (!posicao.matches(Regex("^[0-9]+$")))
        val posicaoInt = posicao.toInt()

        do {
            print("Digite sua resposta (S/N): ")
            resposta = readLine()?.toUpperCase() ?: ""
        } while (resposta != "S" && resposta != "N")

        println("Posição: $posicaoInt, Resposta: $resposta")
    }

    fun excluir() {
        var posicao: String

        do {
            print("Digite a posição para excluir (apenas números): ")
            posicao = readLine() ?: ""
        } while (!posicao.matches(Regex("^[0-9]+$")))
        val posicaoInt = posicao.toInt()

        println("Posição $posicaoInt excluída com sucesso.")
    }

    fun busca() {
        var busca: String

        do {
            print("Digite a palavra para buscar (apenas letras): ")
            busca = readLine()?.toUpperCase() ?: ""
        } while (!busca.matches(Regex("^[a-zA-Z]+$")))

        println("Busca realizada por: $busca")
    }

    cadastrar()
    editar()
    excluir()
    busca()
}
