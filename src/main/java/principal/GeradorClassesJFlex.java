package principal;

import java.io.File;

public class GeradorClassesJFlex {

	public static void main(String[] args) {
		
		String file = new File("").getAbsolutePath()
				+ "\\src\\main\\resources\\especificacoes\\"
				+ "MiniC.lex";
		
		jflex.Main.generate(new File(file));
	}

}
