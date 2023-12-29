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
public class Student implements Stakeholder {
    private Exam exam;

    public Student(Exam exam) {
        this.exam = exam;
    }

    public void takeExam() {
        // Logic for taking exams
        System.out.println("Student is taking an exam.");
    }

    public void submitExam() {
        // Logic for submitting exams
        System.out.println("Student submitted the exam.");
    }

    public void sendMessage(String message) {
        // Logic for sending messages
        System.out.println("Student sent a message: " + message);
    }

   
}
