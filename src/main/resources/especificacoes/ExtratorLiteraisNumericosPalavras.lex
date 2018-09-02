
package com.br.praticasjflex.extratorliteraisinteirospalavras;

%%  
 
%class IdentificadorLiteraisNumericosePalavras
%type Token
%line
%column 
 
DIGITO = [0-9] 
LITERALNUMERICO = {DIGITO}+
LETRA = [A-Za-z]
PALAVRA = {LETRA}+
NOVALINHA = \n | \r\n | \t\n

%% 
 
{LITERALNUMERICO}     { return new Token( "LI", yyline, yycolumn, yytext() ); }
 
{PALAVRA}     { return new Token( "Palavra", yyline, yycolumn, yytext() ); } 

{NOVALINHA} {}