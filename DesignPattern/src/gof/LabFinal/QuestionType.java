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
public class QuestionType implements ExamType {
    private String typeId;
    private String typeName;
    private String difficultyLevel;
    private List<Question> questions;

    public QuestionType(String typeId, String typeName, String difficultyLevel) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.difficultyLevel = difficultyLevel;
        this.questions = new ArrayList<>();
    }

    public String getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }
}
