package br.com.nimbus21.sweetlyrics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "TB_ARTISTA")
@SequenceGenerator(name = "artista", sequenceName = "SQ_TB_ARTISTA", allocationSize = 1)
public class Artista {
	
	@Id
	@Column(name = "cd_artista")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artista")
	private Long codigo;
	
	@Column(name = "nm_artista")
	private String nome;
	
	@Column(name = "fl_foto_artista")
	private String fotoLink;

	public Artista() {
		
	}

	public Artista(String nome, String fotoLink) {
		this.nome = nome;
		this.fotoLink = fotoLink;
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

	public String getFotoLink() {
		return fotoLink;
	}

	public void setFotoLink(String fotoLink) {
		this.fotoLink = fotoLink;
	}
	
}
