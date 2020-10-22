package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

	public static void main(String... args) {

		String texto = "ABC [abc] a-c 1234";

		System.out.println("--------------------------INTERVALO VALIDO----------------------");

		Pattern pattern = Pattern.compile("[a-c]");
		Matcher matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n--------------------------NAO VAI DEFINIR UM RANGE----------------------");

		pattern = Pattern.compile("a-c");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println(
				"\n-----PEGA TODAS AS LETRAS MAISCULAS E MINUSCULAS E ALGUNS SIMBOLOS JUNTOS ENTRE ELES---------------");
		System.out.println(
				"------------------------------USAM A ORDEM DA TABELA UNICODE---------------------------------------");

		pattern = Pattern.compile("[A-z]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n-----TEM Q RESPEITAR A ORDER DA TABELA UNICODE---------------");

		try {
			pattern = Pattern.compile("[a-Z]");
			matcher = pattern.matcher(texto);

			while (matcher.find())
				System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
						matcher.end()));
		} catch (PatternSyntaxException e) {
			System.out.println("NÃO COMPILOU A EXPRESSAO, POR SER INVALIDA");
		}
		
		System.out.println("\n-----PEGA TODAS AS LETRAS MAISCULAS E MINUSCULAS---------------");

		pattern = Pattern.compile("[A-Za-z]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
