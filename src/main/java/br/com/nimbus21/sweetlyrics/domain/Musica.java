package br.com.nimbus21.sweetlyrics.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "musica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Letra> letras = new ArrayList<Letra>();
	
	@ManyToMany
	@JoinTable(name = "TB_MUSICA_ALBUM", joinColumns = @JoinColumn(name = "cd_album"), inverseJoinColumns = @JoinColumn(name = "cd_musica"))
	private List<Album> albuns;

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

	public List<Letra> getLetras() {
		return letras;
	}

	public void setLetras(List<Letra> letras) {
		this.letras = letras;
	}
	
	public void addLetra(Letra letra) {
		letra.setMusica(this);
		letras.add(letra);
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<Album> albuns) {
		this.albuns = albuns;
	}
	
	public void addAlbum(Album album) {
		album.getMusicas().add(this);
		albuns.add(album);
	}
}
