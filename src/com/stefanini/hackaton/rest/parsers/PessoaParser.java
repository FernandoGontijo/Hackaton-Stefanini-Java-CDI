package com.stefanini.hackaton.rest.parsers;

import com.stefanini.hackaton.rest.dto.PessoaDTO;
import com.stefanini.hackaton.rest.entidades.Pessoa;

public class PessoaParser extends AbstractParse<Pessoa, PessoaDTO> {

	
	@Override
	Pessoa toEntity(PessoaDTO dto) {
		return null;
	}
	
	
	@Override
	PessoaDTO toDTO(Pessoa pessoa) {
		return null;
	}
	
	
}
