package app;
import java.io.FileReader;
import java.io.IOException;

public class ExtratorLiteraisNumericosPalavrasApp {

  public static void main(String[] args) {

    FileReader arquivoTeste;
	
    try {
			
	  arquivoTeste = new FileReader( "programas/ExtratorLiteraisNumericosPalavras.txt" );

	  ExtratorLiteraisNumericosPalavras extratorLiteraisNumericosPalavras = new ExtratorLiteraisNumericosPalavras( arquivoTeste );
		
	  extratorLiteraisNumericosPalavras.yylex();
		
    }
	
    catch (IOException e) {
			
	  e.printStackTrace();
		
    }
	
  }

}
