package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String texto1 = "dia diatonico diafragma media wikipedia bom_dia melodia radial";
		String texto2 = "dia diatônico diagragma, média wikipédia bom-dia melodia radial";

		Pattern pattern = null;
		Matcher matcher = null;

		System.out.println("\n--------------------BORDAS DE PALAVRAS Q INICIAM COM DIA--------------------");

		pattern = Pattern.compile("\\bdia\\w+", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n--------------------BORDAS DE PALAVRAS Q TERMINAM COM DIA--------------------");

		pattern = Pattern.compile("\\w+dia\\b", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------PALAVRAS COM DIA NO MEIO DA PALAVRA--------------------");

		pattern = Pattern.compile("\\w+dia\\w+", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------PALAVRAS ENTRE DUAS BORDAS--------------------");

		pattern = Pattern.compile("\\bdia\\b", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto1);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------PROBLEMAS COM ACENTUAÇÃO--------------------");
		//\b é não \w, que é [^A-zA-z0-9_]

		pattern = Pattern.compile("\\bdia\\b", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto2);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------OUTRA ESTRATÉGIA PARA PALAVRAS COM ACENTO PARA PALAVRAS COM \"DIA\"--------------------");
		//\b é não \w, que é [^A-zA-z0-9_]

		pattern = Pattern.compile("(\\S*)?dia(\\S*)?", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto2);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n--------------------OUTRA ESTRATÉGIA PARA PALAVRAS COM ACENTO PARA PALAVRAS COM \"DIA\"--------------------");
		//\b é não \w, que é [^A-zA-z0-9_]

		pattern = Pattern.compile("([\\wÀ-ú-]*)?dia([\\wÀ-ú-]*)?", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto2);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		

	}

}
