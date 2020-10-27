package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String texto1 = "O João recebeu 120 milhões apostando 6 9 21 23 45 46";

		// Para definir um quantificador vc utiliza a {}

		Pattern pattern = null;
		Matcher matcher = null;

		System.out.println("----------------------QUANTIFICADORES {}------------------");

		pattern = Pattern.compile("\\d{1,2}", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		System.out.println("\n----------------------NUMEROS ENTRE 1 e 2 DIGITOS------------------");

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------NUMEROS APENAS COM 2 DIGITOS------------------");

		pattern = Pattern.compile("[0-9]{2}", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------NUMEROS COM 1 OU MAIS DIGITOS------------------");

		pattern = Pattern.compile("[0-9]{1,}", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------CARACTERES COM 7 DIGITOS------------------");

		pattern = Pattern.compile("\\w{7}", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------CARACTERES COM 7 DIGITOS OU MAIS USANDO UNICODE------------------");

		pattern = Pattern.compile("[\\wõ]{7,}", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
