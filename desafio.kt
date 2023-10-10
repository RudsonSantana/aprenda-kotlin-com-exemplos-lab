enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String, var email: String) {
    override fun toString(): String {
        return "Nome: $nome \nEmail: $email\n"
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int) {
    override fun toString(): String {
        return "\n• $nome - $duracao min"
    }
}

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    override fun toString(): String {
        return "Formação: $nome - $nivel \nConteúdos: $conteudos"
    }
}

fun main() {
    	val usuario = Usuario("Rudson", "rudson@email.com")
        val usuario2 = Usuario("Venilton ", "venilton@email.com")
        
        var conteudoKotlin = ConteudoEducacional("Introdução à Kotlin", 120)
        var conteudoKotlin2 = ConteudoEducacional("Orientação à Objetos e Tipos de Classes em Kotlin", 120)
        
        val formacao = Formacao("Kotlin", mutableListOf(conteudoKotlin, conteudoKotlin2), Nivel.INTERMEDIARIO)
        
        println(usuario)
        println(usuario2)
        
        println(formacao)
}