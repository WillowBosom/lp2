package br.com.herbertrausch.domain;

import java.io.Serializable;
import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Publicacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	private String pagina;
	
	@ManyToOne
	private Usuario idUsuario;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	

	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public String toString() {
		return "Publicacao [id=" + id + ", texto=" + texto + ", pagina=" + pagina +  "]";
	}
}


