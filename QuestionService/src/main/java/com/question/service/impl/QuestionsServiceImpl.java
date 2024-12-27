package com.question.service.impl;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question create(Question quetion) {
        return questionRepository.save(quetion);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("question not found"));
    }

    @Override
    public List<Question> getQuestionByQuizId(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
