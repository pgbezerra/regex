package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {


		
		
		
		String textoNumeros = "1,2,3,4,5,6,a.b c!d?e[f";
		String regexPares = "[02468]";
		Pattern patternNumeros = Pattern.compile(regexPares);
		Matcher matcherNumeros = patternNumeros.matcher(textoNumeros);
		
		
		System.out.println("--------------------------NUMEROS PARES----------------------");
		
		while(matcherNumeros.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcherNumeros.group(), matcherNumeros.start(), matcherNumeros.end()));
		
		System.out.println("\n----------------------COM E SEM ACENTO-----------------");
		
		String textoLetras = "João não vai passear na moto.";
		String regexComESemAcento = "n[aã]";
		Pattern patternComESemAcento = Pattern.compile(regexComESemAcento);
		Matcher matcherComESemAcento = patternComESemAcento.matcher(textoLetras);
		
		while(matcherComESemAcento.find())
			System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcherComESemAcento.group(), matcherComESemAcento.start(), matcherComESemAcento.end()));
		
	}

}
