
import kotlin.test.Test
import kotlin.test.asserter

class LexerTest {

    private lateinit var lexer: Lexer

    @Test
    fun `test token parsing`() {

        lexer = Lexer(
            input = "=+(){},;"
        )
        val expected = listOf(
            Token.ASSIGN,
            Token.PLUS,
            Token.LPAREN,
            Token.RPAREN,
            Token.LBRACE,
            Token.RBRACE,
            Token.COMMA,
            Token.SEMICOLON,
            Token.EOF
        )
        val actual = mutableListOf<Token>()
        for ((i, tt) in expected.withIndex()) {
            val token = lexer.nextToken()
            actual.add(token)
        }
        asserter.assertEquals("assert that tokens match", expected, actual)
    }
}
