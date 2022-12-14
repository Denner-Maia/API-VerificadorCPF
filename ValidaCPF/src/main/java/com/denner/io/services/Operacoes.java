package com.denner.io.services;

import org.springframework.stereotype.Service;

@Service
public class Operacoes {

	public boolean validaCPF(String numCPF) {
		 char dig10, dig11;
	        int sm, i, r, num, peso;

	       
	            sm = 0;
	            peso = 10;
	            for (i=0; i<9; i++) {
	       
	            num = (int)(numCPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                dig10 = '0';
	            else dig10 = (char)(r + 48); 
	            
	            sm = 0;
	            peso = 11;
	            for(i=0; i<10; i++) {
	            num = (int)(numCPF.charAt(i) - 48);
	            sm = sm + (num * peso);
	            peso = peso - 1;
	            }

	            r = 11 - (sm % 11);
	            if ((r == 10) || (r == 11))
	                 dig11 = '0';
	            else dig11 = (char)(r + 48);

	     
	            if ((dig10 == numCPF.charAt(9)) && (dig11 == numCPF.charAt(10)))
	                 return true;
	            else return false;
	}
}
