package ejecutable;

import dao.DaoContrincante;
import dao.DaoResultado;
import model.Contrincante;
import model.Lagarto;
import model.Papel;
import model.Piedra;
import model.Resultado;
import model.Spock;
import model.Tijeras;

public class Batalla {

	private static String[] contrincantes = { "Tijeras", "Papel", "Piedra", "Lagarto", "Spock" };
	private static int gan = 0;
	
	public static void main(String[] args) {
		batalla();
	}

	public static void resultado() {
		int vic1 = 0;
		int vic2 = 0;
		int con1;
		int con2;

		while ((vic1 < 2) && (vic2 < 2)) {
			System.out.println("COMBATE");
			con1 = (int) (Math.random() * 5 + 0);
			System.out.println("Contrincante 1 saca -> " + contrincantes[con1]);
			con2 = (int) (Math.random() * 5 + 0);
			System.out.println("Contrincante 2 saca -> " + contrincantes[con2]);
			String ganador = "";
			if (contrincantes[con1] == contrincantes[con2]) {
				System.out.println("Empate");
			} else {
				switch (contrincantes[con1]) {
				case "Tijeras":
					ganador = Tijeras.batalla(contrincantes[con2]);
					if (ganador.contains("Tijeras")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					} else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Papel":
					ganador = Papel.batalla(contrincantes[con2]);
					if (ganador.contains("Papel")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					} else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Piedra":
					ganador = Piedra.batalla(contrincantes[con2]);
					if (ganador.contains("Piedra")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					} else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Lagarto":
					ganador = Lagarto.batalla(contrincantes[con2]);
					if (ganador.contains("Lagarto")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					} else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				case "Spock":
					ganador = Spock.batalla(contrincantes[con2]);
					if (ganador.contains("Spock")) {
						vic1++;
						System.out.println(ganador + contrincantes[con2]);
					} else {
						vic2++;
						System.out.println(ganador + contrincantes[con1]);
					}
					break;
				}
			}
		}
		if(vic1 == 1) {
			gan = 1;
		}else {
			gan = 2;
		}
	}
	
	public static void batalla() {
		Contrincante c1 = new Contrincante();
		c1.setNombre("Pedro");
		Contrincante c2 = new Contrincante();
		c2.setNombre("Hugo");
		resultado();
		Resultado r = new Resultado();
		r.setContrincante1(c1);
		r.setContrincante2(c2);
		if(gan == 1)
			r.setGanador(c1);
		else
			r.setGanador(c2);
		DaoResultado.create(r);
		//DaoContrincante.create(c1);
	}

}
