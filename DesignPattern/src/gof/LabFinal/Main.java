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
public class Main {
    public static void main(String[] args) {
        // Create an Admin
        Admin admin = new Admin("Default Schedule", "Default Conduction Details");

        // Output schedule and conduction details
        System.out.println("Initial Schedule: " + admin.getSchedule());
        System.out.println("Initial Conduction Details: " + admin.getConductionDetails());

        // Create an ExamBuilder instance
        ExamBuilder examBuilder = new ExamBuilder();

        // Create a QuestionType for MCQs
        ExamType mcqType = new QuestionType("1", "MCQ", "Medium");

        // Set the question type for the ExamBuilder
        examBuilder.setQuestionType(mcqType);

        // Create a Question
        Question mcqQuestion = new Question("What is the capital of France?", (QuestionType) mcqType);

        // Add the question to the Exam
        examBuilder.createExam();
        

        // Output exam creation and question addition
        System.out.println("Exam created with a question: " + mcqQuestion.getText());

        // Create a Teacher
        Teacher teacher = new Teacher();

        // Teacher manages exams
        teacher.manageExams();

        // Teacher conducts an exam
        teacher.conductExam();

        // Create a Student
        Student student = new Student((Exam) examBuilder.getExam());

        // Student takes and submits the exam
        student.takeExam();
        student.submitExam();

        // Output notification to stakeholders
        System.out.println("Notification sent to Admin: Exam is completed!");
        System.out.println("Notification sent to Parent: Exam results are available.");
    }
}