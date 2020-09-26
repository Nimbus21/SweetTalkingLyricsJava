package br.com.nimbus21.sweetlyrics.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "fl_foto_album", nullable = true)
	private String fotoLink;

	@ManyToOne
	@JoinColumn(name = "cd_artista", nullable = true)
	//É false, tá true apenas para teste
	private Artista artista;
	
	@ManyToMany(mappedBy = "albuns", cascade = CascadeType.ALL)
	private List<Musica> musicas;
	
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

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	
	public void addMusica(Musica musica) {
		musica.getAlbuns().add(this);
		musicas.add(musica);
	}
}
