package com.question.service;

import java.util.List;

import com.question.entities.Question;

public interface QuestionService {
	
	Question create(Question question);
	
	List<Question> getAll();

	Question getById(Long id);
	
	List<Question> getByQuizId(Long quizId);
}
