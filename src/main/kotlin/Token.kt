typealias TokenType = String


sealed class Token (val literal: String) {
    object ILLEGAL: Token("ILLEGAL")
    object EOF: Token("EOF")

    //Idnetifiers + literals
    object IDENT: Token("IDENT")
    object INT: Token("INT")

    //operators
    object ASSIGN : Token( "=")
    object PLUS : Token("+")

    //delimeters
    object COMMA: Token( ",")
    object SEMICOLON : Token(";")

    object LPAREN : Token("(")
    object RPAREN: Token( ")")
    object LBRACE : Token( "{")
    object RBRACE : Token( "}")

    // Keywords
    object FUNCTION : Token("FUNCTION")
    object LET : Token("LET")
}

