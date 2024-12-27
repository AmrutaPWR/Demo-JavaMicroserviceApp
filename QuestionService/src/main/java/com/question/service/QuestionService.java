package com.question.service;

import com.question.entities.Question;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuestionService {

    Question create(Question quetion);
    List<Question>get();
    Question getOne(Long id);
    List<Question>getQuestionByQuizId(Long quizId);

}
