package app;

import model.Token;

%%

%class AnalisadorLexico
%unicode
%type Token
%line
%column

NOVALINHA = \n | \r\n | \t\n
DIGITO = [0-9] 
LETRA = [A-Za-z]
PALAVRA = {LETRA}+

IDENTIFICADOR = ({LETRA}|_)({LETRA}|{DIGITO}|_)*
LITERALINTEIRO = {DIGITO}+
LITERALPONTOFLUTUANTE = ({DIGITO}+\.{DIGITO}+)

LITERALCARACTER = '([^'\\n]|\\.)'
LITERALSTRING = \"(([^\"]|\\\")*[^\\])?\"

OPERADORARITMETICO = ("+ "|" - "|" * "|" /" )
OPERADORCOMPARACAO = ("== "| "!= "|" <" |" >" | "<= "|" >=")
OPERADORLOGICOAND = (&(&))
OPERADORLOGICOOR = ("||")
OPERADORATRIBUICAO = [=]
OPERADORUNARIONEGACAO = [!]

SIMBOLODEPONTUACAO = [:;,(){}.#&]

INPUTCHARACTER = [^\r\n]
LINETERMINATOR = \r|\n|\r|\n
TRADITIONALCOMMENT = "/*" [^*] ~"*/" | "/*" "*"+ "/"
ENDOFLINECOMMENT = "//" {INPUTCHARACTER}* {LINETERMINATOR}?
DOCUMENTATIONCOMMENT = "/**" {COMMENTCONTENT} "*"+ "/"
COMMENTCONTENT = ( [^*] | \*+ [^/*])*
COMENTARIO = {TRADITIONALCOMMENT} | {ENDOFLINECOMMENT} | {DOCUMENTATIONCOMMENT}


%%
"main" { return new Token( "Palavra_Reservada", yyline, yycolumn, yytext() ); }
"{" { return new Token( "Abre_colchetes", yyline, yycolumn, yytext() ); }
"}" { return new Token( "Fecha_colchetes", yyline, yycolumn, yytext() ); }
"(" { return new Token( "Abre_parentese", yyline, yycolumn, yytext() ); }
")" { return new Token( "Fecha_parentese", yyline, yycolumn, yytext() ); }
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


{IDENTIFICADOR} { return new Token("IDENTIFICADOR", yyline, yycolumn, yytext() ); }
{LITERALINTEIRO} { return new Token("LITERALINTEIRO", yyline, yycolumn, yytext() ); }
{LITERALPONTOFLUTUANTE} { return new Token("LITERALPONTOFLUTUANTE",yyline, yycolumn, yytext()); }
{LITERALCARACTER} { return new Token("LITERALCARACTER",yyline, yycolumn, yytext() ); }
{LITERALSTRING} { return new Token("LITERALSTRING", yyline, yycolumn, yytext()); }
{OPERADORARITMETICO} {return new Token("OPERADORARITMETICO",yyline, yycolumn, yytext() ); }
{OPERADORCOMPARACAO} { return new Token("OPERADORCOMPARACAO", yyline, yycolumn, yytext() ); }
{OPERADORLOGICOAND} { return new Token("OPERADORLOGICOAND",yyline, yycolumn, yytext() ); }
{OPERADORLOGICOOR} { return new Token("OPERADORLOGICOOR",yyline, yycolumn, yytext() ); }
{OPERADORATRIBUICAO} { return new Token("OPERADORATRIBUICAO", yyline, yycolumn, yytext() ); }
{OPERADORUNARIONEGACAO} { return new Token("OPERADORUNARIONEGACAO",yyline, yycolumn, yytext() ); }
{SIMBOLODEPONTUACAO} {return new Token("SIMBOLODEPONTUACAO",yyline, yycolumn, yytext() ); }
{COMENTARIO} { }
{NOVALINHA} { /**/ }
. { }