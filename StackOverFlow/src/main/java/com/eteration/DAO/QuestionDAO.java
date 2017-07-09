package com.eteration.DAO;

import org.springframework.data.repository.Repository;

import com.eteration.entity.Question;

public interface QuestionDAO extends Repository<Question, Long>{

	Iterable<Question> findAll();
	
}
