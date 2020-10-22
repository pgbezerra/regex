package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		String texto = "1,2,3,4,5,6,a.b c!d?e[f";
		String regexPares = "[a-z]";
		Pattern pattern = Pattern.compile(regexPares);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("--------------------------PEGANDO LETRS EM UM INTERVALO----------------------");

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n------------------INTERVALO MENOR DE LETRAS------------------");

		pattern = Pattern.compile("[b-d]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n------------------INTERVALO DE NUMEROS------------------");

		pattern = Pattern.compile("[2-4]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n------------------MISTURA DE LETRAS E NUMEROS------------------");

		pattern = Pattern.compile("[A-Z1-3]", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
