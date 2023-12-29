package com.quiz.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.entities.Question;
import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	private QuizRepository quizRepo;
	
	private QuestionClient questClient;
	
	public QuizServiceImpl(QuizRepository quizRepo, QuestionClient questClient) {
		this.quizRepo = quizRepo;
		this.questClient = questClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		List<Quiz> quizzes = quizRepo.findAll();
		List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
			quiz.setQuestions(questClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
		quiz.setQuestions(questClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
	}

}
