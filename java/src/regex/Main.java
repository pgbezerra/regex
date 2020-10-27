package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "<b>Destaque</b><strong>Forte</strong><div>Conteudo</div>";
    	String texto2 = "Lentamente é mente muito lenta";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------GRUPOS & RETROVISORES--------------------");
    	pattern = Pattern.compile("<(\\w+)>.*</\\1>"); //valor armazenado a partir do grupo é referenciado com \1, \2... O valor do grupo nem sempre é armazeanado
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------MAIS EXEMPLOS--------------------");
    	pattern = Pattern.compile("(lenta)(mente).*\\2.*\\1", Pattern.CASE_INSENSITIVE);
    	matcher = pattern.matcher(texto2);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------MAIS EXEMPLOS SEM ARMAZENAMENTO--------------------");
    	
    	pattern = Pattern.compile("(?:lenta)(mente).*\\1", Pattern.CASE_INSENSITIVE); //o ?: faz com que o grupo não seja armazenado
    	matcher = pattern.matcher(texto2);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	
    	System.out.println("\n--------------------EXEMPLO COM GRUPO OPCIONAL--------------------");
    	pattern = Pattern.compile("(lenta)(mente)?", Pattern.CASE_INSENSITIVE); //valor armazenado a partir do grupo é referenciado com \1, \2... O valor do grupo nem sempre é armazeanado
    	matcher = pattern.matcher(texto2);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------EXEMPLO COM REPLACE--------------------\n\n");
    	System.out.println(texto2.toLowerCase().replaceAll("(lenta)(mente)", "$2"));
    	
    	
    }
    
}
