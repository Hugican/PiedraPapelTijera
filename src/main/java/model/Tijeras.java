package model;

public class Tijeras {

	public String nombre;
	
	
	
	public static String batalla(String s) {
		switch (s) {
		case "Papel":
			return "Tijera corta a ";
		case "Lagarto":
			return "Tijera decapita a ";
		case "Piedra":
			return "Piedra aplasta a ";
		case "Spock":
			return "Spock aplasta a ";
		}
		return s;
		
	}
	
	
}