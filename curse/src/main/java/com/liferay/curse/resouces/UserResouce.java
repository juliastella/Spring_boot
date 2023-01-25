package com.liferay.curse.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liferay.curse.entities.User;

/*Controlador rest */

@RestController
@RequestMapping(value = "/users") /* navegação de paginas */
public class UserResouce {

	/* Metodo para acessar os usuario, que é uma ligação com @RequestMapping(value = "/users"), o andpoint */
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "joca", "joca@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
