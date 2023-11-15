package model;

public class Piedra {

	public static String batalla(String s) {
		switch (s) {
		case "Lagarto":
			return "Piedra aplasta a ";
		case "Tijeras":
			return "Piedra aplasta a ";
		case "Papel":
			return "Papel cubre a ";
		case "Spock":
			return "Spock vaporiza a ";
		}
		return s;
		
	}

}
