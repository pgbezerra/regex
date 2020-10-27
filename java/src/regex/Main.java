package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "João é calmo, mas no transito fica nervoso.";
    	String texto2 = "supermercado superação hiperMERCADO";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------GRUPOS ESPECIAIS--------------------");
    	pattern = Pattern.compile("[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	
    	System.out.println("\n--------------------POSITIVE LOOKAHEAD--------------------");
    	pattern = Pattern.compile("[\\wÀ-ú]+(?=,)", Pattern.CASE_INSENSITIVE); //procure na frente da palavra, no caso uma virgula
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	pattern = Pattern.compile("[\\wÀ-ú]+(?=\\.)", Pattern.CASE_INSENSITIVE); //procure na frente da palavra, no caso um ponto
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	pattern = Pattern.compile("[\\wÀ-ú]+(?=, mas)", Pattern.CASE_INSENSITIVE); //procure na frente da palavra, no caso uma virgula e a palavra mas
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------NEGATIVE LOOKAHEAD--------------------");
    	pattern = Pattern.compile("[\\wÀ-ú]+\\b(?!,)", Pattern.CASE_INSENSITIVE); //palavras que não são seguidas por tal coisa, no caso o "é" é considerado uma borda
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	pattern = Pattern.compile("[\\wÀ-ú]+[\s|\\.](?!,)", Pattern.CASE_INSENSITIVE); //palavras que não são seguidas por tal coisa
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------POSITIVE LOOKABEHIND--------------------");
    	pattern = Pattern.compile("(?<=super)[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE); //procure na atras da palavra, no caso a palavra super
    	matcher = pattern.matcher(texto2);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------NEGATIVE LOOKABEHIND--------------------");
    	pattern = Pattern.compile("(?<!super)mercado", Pattern.CASE_INSENSITIVE); //procure na atras da palavra, no caso a palavra super que e de match que não é precedido
    	matcher = pattern.matcher(texto2);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	
    	
    }
    
}
