package model;

public class Spock {

	public static String batalla(String s) {
		switch (s) {
		case "Tijeras":
			return "Spock aplasta a ";
		case "Piedra":
			return "Spock vaporiza a ";
		case "Papel":
			return "Papel refuta a ";
		case "Lagarto":
			return "Lagarto envenena a ";
		}
		return s;
		
	}

}
