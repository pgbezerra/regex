package regex;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		// . é um coringa, ou seja pega qualquer caractere, valido para uma posicao

		String texto = "1,2,3,4,5,6,7,8,9,0";

		Pattern pattern = Pattern.compile("1.2");
		Matcher matcher = pattern.matcher(texto);

		System.out.println("\t\t\t\tENCONTRANDO UM GRUPO USANDO UM PONTO");
		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println();
		System.out.println("\t\t\t\tNÃO ENCONTRANDO UM GRUPO USANDO DOIS PONTOS");

		pattern = Pattern.compile("1..2");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println();
		System.out.println("\t\t\t\tENCONTRANDO UM GRUPO USANDO DOIS PONTOS");
		pattern = Pattern.compile("1..,");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println();
		System.out
				.println("\t\t\t\tBUSCANDO COM PONTOS NO LUGAR, ONDE O META CARACTERE . TAMBEM VALE PARA O . LITERAL");

		String notas = "8.3,7.1,8.8,10.0";
		pattern = Pattern.compile("8..");
		matcher = pattern.matcher(notas);
		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out
				.println("\t\t\t\tBUSCANDO COM PONTOS NO LUGAR, ONDE O META CARACTERE . É USADO DE FORMA LITERAL");

		pattern = Pattern.compile(".\\..");
		matcher = pattern.matcher(notas);
		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
