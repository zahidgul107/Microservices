package com.quiz.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	private QuizRepository quizRepo;
	
	public QuizServiceImpl(QuizRepository quizRepo) {
		super();
		this.quizRepo = quizRepo;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		return quizRepo.findAll();
	}

	@Override
	public Quiz get(Long id) {
		return quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
	}

}
