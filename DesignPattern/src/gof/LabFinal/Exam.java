/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.LabFinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fa20-bse-052
 */
public class Exam {
    private List<Question> questions;

    public Exam() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}