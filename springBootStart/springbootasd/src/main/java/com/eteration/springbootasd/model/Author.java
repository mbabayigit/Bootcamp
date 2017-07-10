package com.eteration.springbootasd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="authorID")
	private long id;
	
	@Column(name="authorName")
	private String name;
	
	@Column(name="authorSurname")
	private String surname;
	
	@OneToMany(mappedBy="author", cascade=CascadeType.ALL)
	private List<Answer> answers = new ArrayList<Answer>();
	
	@OneToMany(mappedBy="author", cascade=CascadeType.ALL)
	private List<Question> questions = new ArrayList<Question>();
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
