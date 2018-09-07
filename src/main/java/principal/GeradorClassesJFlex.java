package principal;

import java.io.File;

public class GeradorClassesJFlex {

	public static void main(String[] args) {
		
		String file = new File("").getAbsolutePath()
				+ "\\src\\main\\resources\\especificacoes\\"
				+ "ExtratorLiteraisNumericosPalavras.lex";
		
		jflex.Main.generate(new File(file));

	}

}
