package regex;

import java.util.regex.*;

public class Main {
	
	public static void main(String... args) {
		
		String texto = "Casa bonita é a casa amarela da esquina com a Rua ACASALAR.";
		
		//valores literais o regex busca os literias flag G busca todas as ocorrencias (n consegui aplicar agora no JAVA)
		String regex = "casa bonita";
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) 
			System.out.printf("Posicoes: %s, %s\t Valor: %s%n", matcher.start(), matcher.end(), matcher.group());
		
	}

}
