package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String... args) {
		//flag g - global
		//flag i - ignora o case sensitive
		
		String text = "Eu joguei o jogo do jeito errado";
		
		
		Pattern pattern = Pattern.compile("e|er", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		if(matcher.find())
			System.out.println("Existe essa letra");
		
	}

}
