package com.quiz.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private QuizService quizSer;

	public QuizController(QuizService quizSer) {
		super();
		this.quizSer = quizSer;
	}
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizSer.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> getAll() {
		System.err.println("called quiz service==== ");
		return quizSer.getAll();
	}
	
	@GetMapping("/{id}")
	public Quiz get(@PathVariable Long id) {
		return  quizSer.get(id);
	}
	

}
