package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String texto1 = "<div>Conteudo 01</div><div>Conteudo 02</div>";

		// quantificadores são gulosos (greedy)

		Pattern pattern = null;
		Matcher matcher = null;

		System.out.println("----------------------QUANTIFICADORES GULOSOS------------------");

		pattern = Pattern.compile("<div>.+<\\/div>", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		System.out.println("\n----------------------ENCONTRANDO AS DIVS GULOSO COM +------------------");

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------ENCONTRANDO AS DIVS GULOSO COM *------------------");

		pattern = Pattern.compile("<div>.*<\\/div>", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------ENCONTRANDO AS DIVS GULOSO COM {}------------------");

		pattern = Pattern.compile("<div>.{0,100}<\\/div>", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));



		System.out.println("\n\n----------------------QUANTIFICADORES NÃO GULOSOS------------------");

		pattern = Pattern.compile("<div>.+?<\\/div>", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		System.out.println("\n----------------------ENCONTRANDO AS DIVS NÃO GULOSO COM +------------------");

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------ENCONTRANDO AS DIVS NÃO GULOSO COM *------------------");

		pattern = Pattern.compile("<div>.*?<\\/div>", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n----------------------ENCONTRANDO AS DIVS NÃO GULOSO COM {}------------------");

		pattern = Pattern.compile("<div>.{0,100}?<\\/div>", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
