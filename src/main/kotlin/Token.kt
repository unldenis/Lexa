package org.lexa


data class Token(
    val tokenType: TokenType,
    val line : Int,
    val column: Int,
    val value : Any? = null
)
{
}

enum class TokenType {

    ON,
    COMMAND,
    IMPL,
    GUI,

    IF,

    KEYWORD,

    VARIABLE,

    STRING,
    NUMBER,
    DECIMAL,

    COMMA,

    COLON,

    PLUS,
    MINUS,
    SLASH,
    STAR
}