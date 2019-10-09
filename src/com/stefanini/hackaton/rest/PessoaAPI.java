package com.stefanini.hackaton.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaAPI {

	
	@Inject
	Repositorio repositorio;
	
	@GET
	public Response consultar() { 

		return Response.ok(repositorio.getMapPessoa()).build();
	}
	
	@POST
	public Response inserir(Pessoa pessoa) {
		repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
		return Response.ok(repositorio.getMapPessoa()).build();
	}
	
	@DELETE
	@Path("/{cpf}")
	public Response excluir(@PathParam("cpf") String cpf) {
		repositorio.getMapPessoa().remove(cpf);	
		return Response.ok(repositorio.getMapPessoa()).build();
	}
	
	@DELETE
	public Response excluir2(@QueryParam("cpf") String cpf) {
		repositorio.getMapPessoa().remove(cpf);	
		return Response.ok(repositorio.getMapPessoa()).build();
	}
	
	@PUT
	@Path("/{cpf}")
	public Response alterar(Pessoa pessoa, @PathParam("cpf") String cpf){
		
		pessoa.setCpf(cpf);
		
		repositorio.getMapPessoa().put(cpf, pessoa);
		
		return Response.ok().build();
	}
	

	
}
