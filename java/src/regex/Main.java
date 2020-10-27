package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    	String texto1 = "O José Simão é muito engraçado... hehehehehe";
    	String texto2 = "http://www.site.info www.escola.ninja.br google.com.br";
    	
    	Pattern pattern = null;
    	Matcher matcher = null;
    	
    	System.out.println("\n--------------------GRUPOS--------------------");
    	pattern = Pattern.compile("(he)+");
    	matcher = pattern.matcher(texto1);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    	System.out.println("\n--------------------URL--------------------");
    	pattern = Pattern.compile("(http:\\/\\/)?(www\\.)?\\w+.\\w{2,}(\\.\\w{2})?");
    	matcher = pattern.matcher(texto2);
    	
    	while(matcher.find())
    		System.out.println(String.format("Encontrado %s na posicao %s ate %s", matcher.group(), matcher.start(), matcher.end()));
    	
    }
    
}
