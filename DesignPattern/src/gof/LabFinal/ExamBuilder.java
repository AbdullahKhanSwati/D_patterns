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
public class ExamBuilder {
    private Exam exam;
    private ExamType questionType;

    public ExamBuilder() {
        this.exam = new Exam();
    }

    public void createExam() {
        // Initialization logic for creating an exam
        System.out.println("Exam created.");
    }

    public void setQuestionType(ExamType type) {
        this.questionType = type;
    }

    Object getExam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
