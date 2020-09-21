package br.com.nimbus21.sweetlyrics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nimbus21.sweetlyrics.domain.Letra;

public interface LetraRepository extends JpaRepository<Letra, Long>{

}
