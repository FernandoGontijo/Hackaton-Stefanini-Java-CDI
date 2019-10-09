package com.stefanini.hackaton.rest.api;

import java.util.List;

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

import com.stefanini.hackaton.rest.entidades.Pessoa;
import com.stefanini.hackaton.rest.exceptions.NegocioException;
import com.stefanini.hackaton.rest.persistence.Repositorio;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaAPI {

	
	@Inject
	Repositorio repositorio;
	
	@GET
	public Response consultar() throws NegocioException  { 

		if (repositorio.getMapPessoa().isEmpty()) {
			
				throw new NegocioException("Nenhuma pessoa cadastrada!");
			
		}else {
		
		return Response.ok(repositorio.getMapPessoa()).build();
		}
	}
		
	@GET
	@Path("/{cpf}")
	public Response consultar(@PathParam("cpf") String cpf) throws NegocioException { 
		
		if (!repositorio.getMapPessoa().containsKey(cpf)) {
			
			throw new NegocioException("CPF nao encontrado!");
			
		}else {
			
			return Response.ok(repositorio.getMapPessoa().get(cpf)).build();
		}
		
	}

	@POST
	@Path("/inserir")
	public Response inserirLista(List<Pessoa> pessoaList) throws NegocioException {
		
		for (Pessoa pessoa : pessoaList) {
					
			if (repositorio.getMapPessoa().containsKey(pessoa.getCpf())) {
				
				throw new NegocioException("Este cpf " + pessoa.getCpf() + " já foi cadastrado!");
				
			} else {
				
			repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
			
			}
		
		}
		
		return Response.ok(repositorio.getMapPessoa()).build();
	}
		
	@POST
	public Response inserir(Pessoa pessoa) throws NegocioException {
		
		if (repositorio.getMapPessoa().containsKey(pessoa.getCpf())) {
			
			throw new NegocioException("Esta pessoa já foi cadastrada!");
			
		} else {
			
			repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
			
			return Response.ok(repositorio.getMapPessoa()).build();
			
		}
		
		
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
