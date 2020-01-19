package com.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.cursomc.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		// metódo que retorna qual usuário está logado no sistema
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();			
		}
		catch (Exception e) {
			return null;
		}
	}
}
