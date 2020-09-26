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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "TB_LETRA")
@SequenceGenerator(name = "letra", sequenceName = "SQ_TB_LETRA", allocationSize = 1)
public class Letra {
	
	@Id
	@Column(name = "cd_letra")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letra")
	private Long codigo;
	
	@Column(name = "ds_idioma_letra")
	private String idioma;
	
	@Column(name = "ds_letra")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "cd_musica", nullable = true)
	//É false, tá true pra teste
	private Musica musica;
	
	@OneToMany(mappedBy = "letra", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Verso> versos = new ArrayList<Verso>();

	public Letra() {

	}

	public Letra(String idioma, String descricao) {
		this.idioma = idioma;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}

	public List<Verso> getVersos() {
		return versos;
	}

	public void setVersos(List<Verso> versos) {
		this.versos = versos;
	}
	
	public void addVerso(Verso verso) {
		verso.setLetra(this);
		versos.add(verso);
	}
	
}
