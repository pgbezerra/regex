package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String texto1 = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOOOO!";
		String texto2 = "Threre is a big fog in NYC";

		// ? -> zero ou um (opcional

		Pattern pattern = null;
		Matcher matcher = null;

		System.out.println("----------------------QUANTIFICADORES------------------");

		pattern = Pattern.compile("fogo?", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		System.out.println("\n----------------------TEXTO 1------------------");

		while (matcher.find())
			System.out.println(
					String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));

		matcher = pattern.matcher(texto2);

		System.out.println("\n----------------------TEXTO 2------------------");

		while (matcher.find())
			System.out.println(
					String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));

	}

}
