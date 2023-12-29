/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.LabFinal;

import java.util.List;

/**
 *
 * @author fa20-bse-052
 */
public interface ExamType {
    String getTypeId();
    String getTypeName();
    String getDifficultyLevel();
    List<Question> getQuestions();
    void addQuestion(Question question);
    void removeQuestion(Question question);
}
