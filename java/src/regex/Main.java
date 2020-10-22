package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		String texto = "1,2,3,4,5,6,a.b c!d?e[f";

		System.out.println("--------------------------CONJUNTOS NEGADOS ^ NO INICIO DO CONJUNTO ----------------------");

		System.out.println("\n--------------------------NÃO SÃO LETRAS MINUSCULAS ----------------------");

		Pattern pattern = Pattern.compile("[^a-z]");
		Matcher matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n--------------------------NÃO SAO NUMEROS ----------------------");

		pattern = Pattern.compile("[^0-9]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n--------------------------NEGANDO NUMEROS OS NUMEROS USANDO UM SHORTHAND E SIMBOLOS  ----------------------");

		pattern = Pattern.compile("[^\\d!\\?\\[\s,\\.]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		String texto2 = "1: !\"#$%&'()*+,-./ 2: :;<=>?@";
		
		System.out.println("\n--------------------------NEGANDO SIMBOLOS USANDO DOIS INTERVALOS  ----------------------");

		pattern = Pattern.compile("[^!-/:-@\s]");
		matcher = pattern.matcher(texto2);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
