package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		String texto = "áéíóú àèìòù âêîôû ç ãõ ü";

		System.out.println("--------------------------SELECIONANDO INTERVALOS UNICODES ----------------------");

		Pattern pattern = Pattern.compile("[\\u00C0-\\u00FC]");
		Matcher matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println(texto.replaceAll("[\\u00C0-\\u00FC]", "$0,"));

	
	}

}
