package com.quiz.controller;

import com.quiz.entity.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz-test")
public class QuizTestController {

    @GetMapping
    public String get() {
        return "this is quiz-test controller";
    }
}
