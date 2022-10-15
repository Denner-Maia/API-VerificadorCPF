package com.denner.io.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.denner.io.exceptions.UnsupportedMathOperationException;
import com.denner.io.services.Operacoes;

@RestController
public class ValidaCPF_Controller {
	
		@Autowired
		private Operacoes operacoes;
		
	@RequestMapping(value="/validaCPF/{numCPF}",
			method=RequestMethod.GET)
	public boolean validaCPF(
			@PathVariable(value = "numCPF") String numCPF
			)throws Exception{
		 if (numCPF.equals("00000000000") ||
				 numCPF.equals("11111111111") ||
				 numCPF.equals("22222222222") || numCPF.equals("33333333333") ||
				 numCPF.equals("44444444444") || numCPF.equals("55555555555") ||
				 numCPF.equals("66666666666") || numCPF.equals("77777777777") ||
				 numCPF.equals("88888888888") || numCPF.equals("99999999999") ||
		            (numCPF.length() != 11)) {
				throw new UnsupportedMathOperationException("Verifique o cpf e tente novamente");
			 }
		 
		 return operacoes.validaCPF(numCPF); 
		
	            
	        	            
	
	}
}
