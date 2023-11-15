package ejecutable;

import dao.DaoResultado;
import model.Resultado;
import model.Tijeras;

public class Main {

	
	public static void main(String[] args) {
		//añadirResultado();
		añadirResultado();
	}
	
	
	public static String[] contrincantes = {"Tijera", "Papel","Piedra", "Lagarto", "Spock"};
	static int gan=0;
	
	public static void resultado() {
		int vic1=0;
		int vic2=0;
			while((vic1 < 3) || (vic2 < 3)){
				int con1 =  (int) (Math.random() * 5 + 0);
				System.out.println("Contrincante 1 saca -> " + contrincantes[con1]);
				int con2 =  (int) (Math.random() * 5 + 0);
				System.out.println("Contrincante 2 saca -> " + contrincantes[con2]);
				String ganador = "";
				switch (contrincantes[con1]) {
				case "Tijeras":
					ganador = Tijeras.batalla(contrincantes[con2]);
					if(ganador.contains("Tijeras")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					}
					else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Papel":
					ganador = Tijeras.batalla(contrincantes[con2]);
					if(ganador.contains("Papel")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					}
					else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Piedra":
					ganador = Tijeras.batalla(contrincantes[con2]);
					if(ganador.contains("Piedra")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					}
					else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Lagarto":
					ganador = Tijeras.batalla(contrincantes[con2]);
					if(ganador.contains("Lagarto")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					}
					else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Spock":
					ganador = Tijeras.batalla(contrincantes[con2]);
					if(ganador.contains("Spock")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					}
					else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
				}
			}
			if(vic1==2) {
				gan=1;
			}else {
				gan=2;
			}
		}
	
	
	public static void añadirResultado() {
		Contrincante c1 = new Contrincante();
		c1.setNombre("Pedro");
		Contrincante c2 = new Contrincante();
		c1.setNombre("Hugo");
		resultado();
		Resultado r = new Resultado();
		r.setContrincante1(c1);
		r.setContrincante2(c2);
		if(gan == 1)
			r.setGanador(c1);
		else
			r.setGanador(c2);
		DaoResultado.create(r);
	}
}
		
	


