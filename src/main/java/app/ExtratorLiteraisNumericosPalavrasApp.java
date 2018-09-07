package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.Token;



public class ExtratorLiteraisNumericosPalavrasApp {

  public static void main(String[] args)  {

    FileReader programaTeste;
    String path = new File("").getAbsolutePath()+
    	"\\src\\main\\resources\\programa\\"
		+ "ProgramaTeste.txt";
	
    try {
		programaTeste = new FileReader(path);
		
		
		AnalisadorLexico analisador = new AnalisadorLexico(programaTeste);
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
