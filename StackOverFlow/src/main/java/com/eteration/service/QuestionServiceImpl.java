package com.eteration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eteration.DAO.QuestionDAO;
import com.eteration.entity.Question;
@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionDAO questionDAO;
	
	public List<Question> allQuestion() {
		return (List<Question>) questionDAO.findAll();
	}

}
