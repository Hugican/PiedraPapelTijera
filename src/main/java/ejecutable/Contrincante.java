package ejecutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contrincante")
public class Contrincante {

	
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column
		private String nombre;
		@Column
		private int victorias;
		@Column
		private int derrotas;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getVictorias() {
			return victorias;
		}
		public void setVictorias(int victorias) {
			this.victorias = victorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		
		
	}
