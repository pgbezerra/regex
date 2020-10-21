package regex;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		String texto = "1,2,3,4,5,6,a.b c!d?e";

		// valores literais o regex busca os literias flag G busca todas as ocorrencias
		// (n consegui aplicar agora no JAVA)
		String regex = ",";

		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		for (String s : texto.split(regex))
			joiner.add(s);

		System.out.println("\t\t\t\tLIPT");

		System.out.println(joiner.toString());

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("\t\t\t\tENCONTRA O PRIMEIRO");

		if (matcher.find())
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());

		System.out.println();

		System.out.println("\t\t\t\tENCONTRA TODAS VIRGULAS");

		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());

		System.out.println();

		System.out.println("\t\t\t\tTENTA BUSCAR A OCORRENCIAS DA LETRA\"A\" MAISCULA SEM O CASE INSENSISIVE");

		matcher = Pattern.compile("A").matcher(texto);

		while (matcher.find())
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());

		System.out.println();

		System.out.println("\t\t\t\tTENTA BUSCAR A OCORRENCIAS DA LETRA\"A\" MAISCULA COM O CASE INSENSISIVE");

		matcher = Pattern.compile("A", Pattern.CASE_INSENSITIVE).matcher(texto);

		System.out.println();

		while (matcher.find())
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());

		System.out.println();
		System.out.println("\t\t\t\tBUSCA AS OCORRENCIAS DE UM NUMERO");

		matcher = Pattern.compile("9").matcher(texto);

		while (matcher.find())
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());

		System.out.println();
		System.out.println("\t\t\t\tTEXTO LITERAL");

		matcher = Pattern.compile("b c!d").matcher(texto);

		while (matcher.find())
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());

	}

}
