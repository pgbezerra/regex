package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {


		String texto = "aȲcʢd";
		
		Pattern pattern = Pattern.compile("\\u0232|\\u02A2");
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
		
	
		

		
	}

}
