package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class PublicacaoService {

	
	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Publicacao> getPublicacao() {
		try {
			
			List<Publicacao> publicacao = (List<Publicacao>) db.findAll();
					
			return publicacao;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Publicacao>();

		}
	}
	
	public List<Publicacao> getByPagina(String a){
		return db.findByPagina(a);
	}
	

	public Publicacao getPublicacao(Long id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	// Deleta o carro pelo id
	public boolean delete(Long id) {
		try {
			db.delete(id);
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// Salva ou atualiza o carro
	public boolean save(Publicacao publicacao) {
		try {
			
				db.save(publicacao);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Publicacao> getByTexto(String texto) {
		// TODO Auto-generated method stub
		return db.findByTexto(texto);
	}



}
