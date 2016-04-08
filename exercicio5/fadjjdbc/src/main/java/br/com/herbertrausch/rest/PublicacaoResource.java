package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Publicacao;
import br.com.herbertrausch.domain.PublicacaoService;
import br.com.herbertrausch.domain.Response;

@Path("/publicacao")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PublicacaoResource {
	
	public PublicacaoService publicacaoService = new PublicacaoService();
	

	@GET
	public List<Publicacao> get() {
		List<Publicacao> publicacao = publicacaoService.getPublicacao();
		return publicacao;
	}

	@GET
	@Path("{id}")
	public Publicacao get(@PathParam("id") long id) {
		Publicacao c = publicacaoService.getPublicacao(id);
		return c;
	}

	@GET
	@Path("/pagina/{pagina}")
	public List<Publicacao> getByPagina(@PathParam("pagina") String pagina) {
		List<Publicacao> publicacao = publicacaoService.getByPagina(pagina);
		return publicacao;
	}
	
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		publicacaoService.delete(id);
		return Response.Ok("Publicacao deletado com sucesso");
	}

	@POST
	public Response post(Publicacao c) {
		publicacaoService.save(c);
		return Response.Ok("Publicacao salvo com sucesso");
	}

	@PUT
	public Response put(Publicacao c) {
		publicacaoService.save(c);
		return Response.Ok("Publicacao atualizado com sucesso");
	}

}
