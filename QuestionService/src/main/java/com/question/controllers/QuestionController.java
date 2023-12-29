package com.question.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	private QuestionService questionSer;

	public QuestionController(QuestionService questionSer) {
		this.questionSer = questionSer;
	}
	
	@PostMapping
	public Question create(@RequestBody Question question) {	
		return 	questionSer.create(question);
	}
	
	@GetMapping
	public List<Question> getAll() {
		return questionSer.getAll();
	}
	
	@GetMapping("/{id}")
	public Question getById(@PathVariable Long id) {
		return questionSer.getById(id);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getByQuizId(@PathVariable Long quizId) {
		return questionSer.getByQuizId(quizId);
	}
	
	

}
