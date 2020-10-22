package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		String texto = ".$+*?-";

		
		System.out.println("--------------------------CONJUNTO COM META CARACTERES----------------------");
		
		Pattern pattern = Pattern.compile("[+.?*$]");
		Matcher matcher = pattern.matcher(texto);


		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		System.out.println("--------------------------NÃO É NECESSARIO O ESCAPE PARA DIZER QUE SAO LITERAIS----------------------");

		System.out.println("\n------------------INTERVALO COM META CARACTERES------------------");

		pattern = Pattern.compile("[$-?]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n------------------NEM SEMPRE FUNCIONAM COMO INTERVALO------------------");

		pattern = Pattern.compile("[$\\-?]");
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

		System.out.println("\n------------------OUTRO EXEMPLO DE NÃO SER UM INTERVALO------------------");

		pattern = Pattern.compile("[-?]", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n------------------OUTRO EXEMPLO DE NÃO SER UM INTERVALO------------------");

		pattern = Pattern.compile("[-$?]", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));
		
		System.out.println("\n------------------PODE PRECISAR DE ESCAPE [] - ^ ------------------");

		pattern = Pattern.compile("[\\[\\-\\^\\]]", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(texto);

		while (matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(),
					matcher.end()));

	}

}
