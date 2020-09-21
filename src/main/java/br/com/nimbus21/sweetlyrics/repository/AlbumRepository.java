package br.com.nimbus21.sweetlyrics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nimbus21.sweetlyrics.domain.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}
