package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String texto1 = "Lista telefônica:\n\t- (11) 98756-1212\n\t-98765-4321\n\t-(24)5471-7896";

		// quantificadores são gulosos (greedy)

		Pattern pattern = null;
		Matcher matcher = null;

		System.out.println("----------------------DESAFIO EMAIL------------------");

		pattern = Pattern.compile("[\\w-.]{4,20}@[\\w.-]{2,50}\\.\\w+", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));


	}

}
