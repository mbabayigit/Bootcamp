package com.eteration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eteration.entity.Question;
import com.eteration.service.QuestionService;

@Controller
@RequestMapping("q")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@ResponseBody
	@GetMapping("allquestion")
	private ResponseEntity<List<Question>> questionEntity()
	{
		List<Question> list = questionService.allQuestion();
		return new ResponseEntity<List<Question>>(list,HttpStatus.OK);
	}
}
