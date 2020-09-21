package br.com.nimbus21.sweetlyrics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nimbus21.sweetlyrics.domain.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
