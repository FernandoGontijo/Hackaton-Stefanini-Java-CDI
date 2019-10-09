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

@Path("/conta")
@Produces(MediaType.APPLICATION_JSON)
public class ContaAPI {

	@Inject
	Repositorio repositorio;
	

	@GET
	public Response consultar() { 

		return Response.ok(repositorio.getMapConta()).build();
	}
	
	@POST
	public Response inserir(Conta conta) {
		repositorio.getMapConta().put(conta.getIdConta(), conta);
		return Response.ok(repositorio.getMapConta()).build();
	}
	
	

	
	@DELETE
	@Path("/{conta}")
	public Response excluir(@PathParam("conta") String conta) {
		repositorio.getMapConta().remove(conta);	
		return Response.ok(repositorio.getMapConta()).build();
	}

	@DELETE
	public Response excluir2(@QueryParam("conta") String conta) {
		repositorio.getMapConta().remove(conta);	
		return Response.ok(repositorio.getMapConta()).build();
	}
	
	
	@PUT
	@Path("/{id}")
	public Response alterar(Conta conta, @PathParam("id") Integer id){
		
		conta.setIdConta(id);
		
		repositorio.getMapConta().put(id, conta);
		
		return Response.ok(repositorio.getMapConta()).build();
	}
	
	
	@PUT
	@Path("/associar/{cpf}/{id}")
	public Response associar(@PathParam("cpf")String cpf, @PathParam("id")Integer id) {
		Pessoa pessoa = repositorio.getMapPessoa().get(cpf);
		Conta conta = repositorio.getMapConta().get(id);
		pessoa.setConta(conta);
		
		return Response.ok().build();
		
		
	}
	
	
	
	
}
