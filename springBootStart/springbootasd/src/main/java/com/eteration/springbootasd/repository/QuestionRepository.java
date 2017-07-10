package com.eteration.springbootasd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eteration.springbootasd.model.Author;
import com.eteration.springbootasd.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
	
	Question findByTitle(String title);
	
	//@Query("select question from Question question where question.author.name=:authorName")
	//List<Question> findByAuthorName(@Param("authorName") String name);
	

	
	
}
