package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "supermercado hipermercado minimercado mercado";
    	String texto2 = "Lentamente é mente muito lenta";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------GRUPOS COM OU--------------------");
    	pattern = Pattern.compile("(super|hiper|mini)?mercado"); //valor armazenado a partir do grupo é referenciado com \1, \2... O valor do grupo nem sempre é armazeanado
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------GRUPOS ANINHADOS--------------------");
    	pattern = Pattern.compile("((hi|su)per|mini)?mercado", Pattern.CASE_INSENSITIVE);
    	matcher = pattern.matcher(texto1);
    	
    }
    
}
