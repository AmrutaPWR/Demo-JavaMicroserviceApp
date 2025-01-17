package com.quiz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @JsonProperty("questionId")
    private Long questionId;

    @JsonProperty
    private String question;

    @JsonProperty
    private Long quizId;
}
