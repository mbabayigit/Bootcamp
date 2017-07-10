package com.eteration.springbootasd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.springbootasd.model.Author;
import com.eteration.springbootasd.repository.AuthorRepository;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	//@RequestMapping(path="all", method = RequestMethod.GET)  veya 
	@GetMapping("all")
	public List<Author> getAuthors(){
		return authorRepository.findAll();
	}
	
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public Author getAuthor(@PathVariable("name") String name) {
		return authorRepository.findByName(name);
		
	}
	
	@RequestMapping(value="{name}", method=RequestMethod.DELETE)
	public void deleteAuthor(@PathVariable("name") String name) {
		
		authorRepository.delete(authorRepository.findByName(name));
		
	}
	
//	@RequestMapping(value="{name}", method=RequestMethod.POST)
//	public Author postAuthor(@PathVariable("name") String name) {
//		return authorRepository.findByName(name);
//		
//	}
	
	

}
