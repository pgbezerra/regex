package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String texto1 = "CPF dos aprovados:\n\t- 600.567.890-12\n\t- 765.998.345-23";

		// quantificadores são gulosos (greedy)

		Pattern pattern = null;
		Matcher matcher = null;

		System.out.println("----------------------DESAFIO CPF------------------");

		pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
