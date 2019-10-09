package com.stefanini.hackaton.rest.exceptions;

public class NegocioException extends Exception{

	
	
	public NegocioException(String mensagem) {
		
		super(mensagem);
		
	}
	
	public NegocioException(final Throwable t) {
		
		super(t);
		
	}
	
	
	public NegocioException(final String mensagem, final Throwable t) {
		
		super(mensagem, t);
		
	}
	
	
	
	
}
