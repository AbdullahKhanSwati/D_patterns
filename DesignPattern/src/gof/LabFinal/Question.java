/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.LabFinal;

/**
 *
 * @author fa20-bse-052
 */
public class Question {
    private String text;
    private QuestionType type;

    public Question(String text, QuestionType type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public QuestionType getType() {
        return type;
    }
}
