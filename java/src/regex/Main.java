package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		String texto = "1,2,3,4,5,6,a.b c!d?e	-\nf_g";

		System.out.println("--------------------------SHORTHAND \\w A-Z a-z e 0-9 ----------------------");

		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------------SHORTHAND \\W NAO CARACTERES----------------------");

		pattern = Pattern.compile("\\W");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n--------------------------SHORTHAND \\d APENAS NUMEROS----------------------");

		pattern = Pattern.compile("\\d");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------------SHORTHAND \\D TUDO OQ NÃO É NUMERICO----------------------");

		pattern = Pattern.compile("\\D");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------------SHORTHAND \\D TUDO OQ NÃO É NUMERICO----------------------");

		pattern = Pattern.compile("\\D");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------------SHORTHAND \\s ESPACOS EM BRANCO----------------------");

		pattern = Pattern.compile("\\s");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------------SHORTHAND \\S TUDO OQ NÃO É ESPACO EM BRANCO----------------------");

		pattern = Pattern.compile("\\S");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
