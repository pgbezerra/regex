package regex;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String... args) {

		// . ? * + - ^ $ | [] {} () \ :

		String texto = "1,2,3,4,5,6,a.b c!d?e";

		String regex = "\\.";

		System.out.println("\t\t\t\tUSANDO UM METACARACTERE EM FORMA LITERAL");

		String[] textoDividido = texto.split(regex);

		StringJoiner joiner = new StringJoiner(",", "[", "]");

		for (String s : textoDividido)
			joiner.add(s);

		System.out.println(joiner.toString());

		System.out.println();
		System.out.println("\t\t\t\tUSANDO VARIOS METACARACTERE EM FORMA LITERAL");

		textoDividido = texto.split(",|\\.|\\?|!| ");

		joiner = new StringJoiner(",", "[", "]");

		for (String s : textoDividido)
			joiner.add(s);

		System.out.println(joiner.toString());
		
	}

}
