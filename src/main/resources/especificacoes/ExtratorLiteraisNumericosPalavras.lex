package app;

%%  
%class IdentificadorMinic
%type Token
%line
%column 
 
DIGITO = [0-9] 
LITERALNUMERICO = {DIGITO}+
LETRA = [A-Za-z]
PALAVRA = {LETRA}+
NOVALINHA = \n | \r\n | \t\n
ID = ({LETRA}|_)({LETRA}|{DIGITO}|_)*

%% 
 
{LITERALNUMERICO}     { return new Token( "LI", yyline, yycolumn, yytext() ); }
 
{PALAVRA}     { return new Token( "Palavra", yyline, yycolumn, yytext() ); } 
{ID}         {return new Token("ID", yyline, yycolumnm, yytext() );}
{NOVALINHA} {}