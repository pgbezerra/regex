package regex;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		// . é um coringa, ou seja pega qualquer caractere, valido para uma posicao

		String texto = "lista de arquivos mp3: jazz.mp3,rock.mp3,podcast.mp3,blues.mp3";

		Pattern pattern = Pattern.compile("\\.mp3");
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("QUANTAS REFERENCIAS DE .mp3 EXISTE NO TEXTO?");
		
		while(matcher.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));

		
	}

}
