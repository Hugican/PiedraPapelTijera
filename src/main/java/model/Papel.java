package model;

public class Papel {

public String nombre;
	
	
	
public static String batalla(String s) {
	switch (s) {
	case "Piedra":
		return "Papel cubre a ";
	case "Spock":
		return "Papel refuta a ";
	case "Tijeras":
		return "Tijeras corta a ";
	case "Lagarto":
		return "Lagarto come a ";
	}
	return s;
	
}
	
}
