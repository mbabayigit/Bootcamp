package com.eteration.springbootasd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //javax.persitance seçtik
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="questionID")
	private long id;
	
	@Column(name="questionTitle")
	private String title;
	
	@Column(name="questionBody")
	private String question;
	
	//soruların bir tane author u var yani ilişki many to one olacak
	
	@ManyToOne
	@JoinColumn(name="authorID")
	private Author author;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.ALL)   //onetoMany anotasyonunun içerisine parametre yazmalıyız,,,cascade=biri silindiğinde diğeri bir question var bunun answerlarrı var soruda yapılan işlem cevaplarıda etkiler soru silinirse cevaplarda silinmeli cascade bunu sağlıyor
	private List<Answer> answers = new ArrayList<Answer>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	}


