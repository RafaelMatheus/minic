
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


"void" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"int" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }

{LITERAL_INTEIRO} { return new Token( "LITERAL_INTEIRO", yyline, yycolumn, yytext() ); }

{FINAL_LINHA} {}
{ESPACO_EM_BRANCO} {}

. { return new Token( "ERRO", yyline, yycolumn, yytext() ); }