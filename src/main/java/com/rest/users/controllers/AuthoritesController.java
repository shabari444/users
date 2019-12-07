package com.rest.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.users.VO.Authorities;
import com.rest.users.repository.AuthorityRepository;

@RestController
public class AuthoritesController {
	
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	
	@RequestMapping(value = "/CreateAuthority",method= RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Authorities CreateAuthority(@RequestBody Authorities authorities ) {
		
		authorityRepository.save(authorities);
		return authorities;
	}

}
