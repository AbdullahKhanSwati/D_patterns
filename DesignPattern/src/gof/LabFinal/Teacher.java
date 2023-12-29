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
public class Teacher implements Stakeholder {
    public void manageExams() {
        // Logic for managing exams
        System.out.println("Teacher is managing exams.");
    }

    public void conductExam() {
        // Logic for conducting exams
        System.out.println("Teacher is conducting an exam.");
    }

    public void sendMessage(String message) {
        // Logic for sending messages
        System.out.println("Teacher sent a message: " + message);
    }
}