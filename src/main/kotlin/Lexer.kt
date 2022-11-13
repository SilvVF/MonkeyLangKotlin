class Lexer(
    var input: String,
    var position: Int = 0,
    var readPosition: Int = 0,
    var ch: Byte = 0,
) {

    init {
        readChar()
    }

   fun readChar() {
       ch = if (readPosition >= input.length) {
           0
       } else {
           input[readPosition].code.toByte()
       }
       position = readPosition
       readPosition += 1
   }

    fun nextToken(): Token {
        return when(ch.toInt().toChar()) {
            '=' -> Token.ASSIGN
            ';' -> Token.SEMICOLON
            '(' -> Token.LPAREN
            ')' -> Token.RPAREN
            '{' -> Token.LBRACE
            '}' -> Token.RBRACE
            ',' -> Token.COMMA
            '+' -> Token.PLUS
            else -> Token.EOF
        }.also { readChar() }
    }
}