package com.question.controller;

import com.question.entities.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return questionService.getOne(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question>getQuestionByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionByQuizId(quizId);
    }
}
