package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {


		String texto = "Bom\ndia";
		
		Pattern pattern = Pattern.compile("...");
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
		
		pattern = Pattern.compile("....");
		matcher = pattern.matcher(texto);
		
		while(matcher.find())  //o ponto n encontra o \n
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));

		pattern = Pattern.compile("....", Pattern.DOTALL);
		matcher = pattern.matcher(texto);
		
		while(matcher.find()) 
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
		

		
	}

}
