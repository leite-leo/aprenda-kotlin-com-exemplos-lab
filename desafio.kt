// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

data class Usuario(val nome: String)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(
    val nome: String,
    var conteudos: List<ConteudoEducacional>,
    val dificuldade: Nivel
) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
        println("${usuarios.size} usuários matriculados na formação $nome")
    }
}

fun main() {
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")
    val usuario3 = Usuario("Carol")

    val conteudo1 = ConteudoEducacional("Kotlin Básico", 5)
    val conteudo2 = ConteudoEducacional("Kotlin Intermediário", 8)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2), Nivel.INTERMEDIARIO)

    formacaoKotlin.matricular(usuario1, usuario2, usuario3)
}
