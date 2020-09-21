package br.com.nimbus21.sweetlyrics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "TB_ALBUM")
@SequenceGenerator(name = "album", sequenceName = "SQ_TB_ALBUM", allocationSize = 1)
public class Album {
	
	@Id
	@Column(name = "cd_album")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "album")
	private Long codigo;
	
	@Column(name = "nm_album")
	private String nome;
	
	@Column(name = "fl_foto_album")
	private String fotoLink;

	public Album() {

	}

	public Album(String nome, String fotoLink) {
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
