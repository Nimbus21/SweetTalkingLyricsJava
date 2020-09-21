package br.com.nimbus21.sweetlyrics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "TB_MUSICA")
@SequenceGenerator(name = "musica", sequenceName = "SQ_TB_MUSICA", allocationSize = 1)
public class Musica {
	
	@Id
	@Column(name = "cd_musica")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "musica")
	private Long codigo;
	
	@Column(name = "nm_musica")
	private String nome;
	
	@Column(name = "ds_idioma_musica")
	private String idioma;

	public Musica() {
	
	}

	public Musica(String nome, String idioma) {
		this.nome = nome;
		this.idioma = idioma;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	

}
