package model;

public class Lagarto {

public String nombre;
	
	
	
public static String batalla(String s) {
	switch (s) {
	case "Spock":
		return "Lagarto envenena a ";
	case "Papel":
		return "Lagarto come a ";
	case "Piedra":
		return "Piedra aplasta a ";
	case "Tijeras":
		return "Spock decapita a ";
	}
	return s;
	
}
}
