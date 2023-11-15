package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="resultados")
public class Resultado {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name="contricante1_id")
	private Contrincante contrincante1;
	@OneToOne
	@JoinColumn(name="contricante2_id")
	private Contrincante contrincante2;
	@OneToOne
	@JoinColumn(name="ganador_id")
	private Contrincante ganador;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Contrincante getContrincante1() {
		return contrincante1;
	}
	public void setContrincante1(Contrincante contrincante1) {
		this.contrincante1 = contrincante1;
	}
	public Contrincante getContrincante2() {
		return contrincante2;
	}
	public void setContrincante2(Contrincante contrincante2) {
		this.contrincante2 = contrincante2;
	}
	public Contrincante getGanador() {
		return ganador;
	}
	public void setGanador(Contrincante ganador) {
		this.ganador = ganador;
	}
	
}
