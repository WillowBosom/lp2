package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ComentarioRepository extends CrudRepository<Comentario, Long>{
	
	List<Comentario> findByComentario(String comentario);
	
}

