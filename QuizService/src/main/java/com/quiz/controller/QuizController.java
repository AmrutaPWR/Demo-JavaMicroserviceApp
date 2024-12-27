package com.quiz.controller;

import com.quiz.entity.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

  private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
//        return quizService.add(quiz);

        System.out.println("Received Quiz: " + quiz);
        Quiz savedQuiz = quizService.add(quiz);
        System.out.println("Saved Quiz: " + savedQuiz);
        return savedQuiz;
    }
    //get
    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id ){
        return quizService.getOne(id);
    }

}
