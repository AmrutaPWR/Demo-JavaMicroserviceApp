package com.quiz.services;


import com.quiz.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8087", value = "Question-client")
@FeignClient(name = "QUESTIONSERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question>getQuestionOfQuiz(@PathVariable Long quizId);
}
