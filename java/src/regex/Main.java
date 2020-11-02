package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "\nLeo é muito legal\nEmanuel foi jogar em Sergipe\nBianca é casada com Habib\n";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------FLAG MULTILINE--------------------");
    	
    	System.out.println("\n--------------------QUEBRA DE LINHA--------------------");
    	pattern = Pattern.compile("\\n"); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------QUEBRA DE LINHA SEM MULTILINE--------------------");
    	pattern = Pattern.compile("^(\\w).+\\1"); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------QUEBRA DE LINHA COM MULTILINE--------------------");
    	pattern = Pattern.compile("(\\w).+\\1$", Pattern.CASE_INSENSITIVE + Pattern.MULTILINE); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    }
    
}
