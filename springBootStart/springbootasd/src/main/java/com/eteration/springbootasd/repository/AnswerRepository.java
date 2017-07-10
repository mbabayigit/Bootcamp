package com.eteration.springbootasd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eteration.springbootasd.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
	Answer findByAnswer(String answer);

}
