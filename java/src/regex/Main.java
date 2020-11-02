package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "Romário era um excelente jogador\n, mas hoje é um político questionador";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------PEGANDO LETRA--------------------");
    	pattern = Pattern.compile("r", Pattern.CASE_INSENSITIVE); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------PEGANDO NO INICIO DA LINHA--------------------");
    	pattern = Pattern.compile("^r", Pattern.CASE_INSENSITIVE);
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------PEGANDO NO FIM DA LINHA--------------------");
    	pattern = Pattern.compile("r$", Pattern.CASE_INSENSITIVE); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	
    	System.out.println("\n--------------------PEGANDO INICIO E FIM DE LINNHA--------------------");
    	pattern = Pattern.compile("^[rR].*[Rr]$", Pattern.DOTALL); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    }
    
}
