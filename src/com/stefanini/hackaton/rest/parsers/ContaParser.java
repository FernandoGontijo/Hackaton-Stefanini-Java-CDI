package com.stefanini.hackaton.rest.parsers;

import com.stefanini.hackaton.rest.dto.ContaDTO;
import com.stefanini.hackaton.rest.entidades.Conta;

public class ContaParser extends AbstractParse<Conta, ContaDTO> {

	
	@Override
	Conta toEntity(ContaDTO dto) {
		return null;
	}
	
	
	@Override
	ContaDTO toDTO(Conta conta) {
		return null;
	}

}
