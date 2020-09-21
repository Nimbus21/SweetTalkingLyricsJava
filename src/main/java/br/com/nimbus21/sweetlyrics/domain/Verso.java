package br.com.nimbus21.sweetlyrics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "TB_VERSO")
@SequenceGenerator(name = "verso", sequenceName = "SQ_TB_VERSO", allocationSize = 1)
public class Verso {
	
	@Id
	@Column(name = "cd_verso")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "verso")
	private Long codigo;
	
	@Column(name = "nm_cantor", nullable = true)
	private String cantor;
	
	@Column(name = "tx_verso")
	private String texto;

	public Verso() {

	}

	public Verso(String cantor, String texto) {
		this.cantor = cantor;
		this.texto = texto;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
