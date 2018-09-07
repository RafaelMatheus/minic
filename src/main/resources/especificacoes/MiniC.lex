
package br.com.minic.analisadorlexico;

import br.com.minic.token.Token;

%%

%class AnalisadorLexico
%unicode
%type Token
%line
%column

LETRA = [a-zA-Z]
DIGITO = [0-9]
FINAL_LINHA = (\r | \n | \r\n | \t)
ESPACO_EM_BRANCO = [ ]

LITERAL_INTEIRO = {DIGITO}+

%%

"main" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"{" { return new Token( "AP", yyline, yycolumn, yytext() ); }
"}" { return new Token( "FP", yyline, yycolumn, yytext() ); }
"(" { return new Token( "AP", yyline, yycolumn, yytext() ); }
")" { return new Token( "FP", yyline, yycolumn, yytext() ); }
"void" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"int" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"float" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"double" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"char" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"if" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"else" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"printf" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"printint" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"printstr" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"return" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"static" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"void" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"while" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"for" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"do" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"include" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }


{LITERAL_INTEIRO} { return new Token( "LITERAL_INTEIRO", yyline, yycolumn, yytext() ); }

{FINAL_LINHA} {}
{ESPACO_EM_BRANCO} {}

. { return new Token( "ERRO", yyline, yycolumn, yytext() ); }