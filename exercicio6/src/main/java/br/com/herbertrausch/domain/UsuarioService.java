package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	
	private UsuarioRepository db;
	
	public UsuarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Usuario> getUsuario() {
		try {
			
			List<Usuario> usuario = (List<Usuario>) db.findAll();
					
			return usuario;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();

		}
	}
	
	public List<Usuario> getByNome(String a){
		return db.findByNome(a);
	}
	

	public Usuario getUsuario(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}