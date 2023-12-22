package br.com.sysgese.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sysgese.models.Perfil;



@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

}
