package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.Token;



public class ExtratorLiteraisNumericosPalavrasApp {

  public static void main(String[] args)  {

    FileReader arquivoTeste;
    String path = new File("").getAbsolutePath()+
    	"\\src\\main\\resources\\programa\\"
		+ "ExtratorLiteraisNumericosPalavras.txt";
	
    try {
		arquivoTeste = new FileReader(path);
		
		
		IdentificadorMinic analisador = new IdentificadorMinic(arquivoTeste);
		Token token =   analisador.yylex();
		while(token != null) {
			  
		    System.out.println( token );
		    
		    token = analisador.yylex();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
  }

}
