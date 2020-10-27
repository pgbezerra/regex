package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "Pedrinho (filho do Pedro Silva) é doutor do ABC!";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------CUIDADO 1--------------------");
    	pattern = Pattern.compile("[(abc)]", Pattern.CASE_INSENSITIVE); 
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------DENTRO DE UM CONJUNTO UM GRUPO NÃO EXISTE--------------------");
    	
    	System.out.println("\n--------------------CONJUNTO DENTRO DE UM GRUPO--------------------");
    	pattern = Pattern.compile("([abc])", Pattern.CASE_INSENSITIVE);
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    }
    
}
