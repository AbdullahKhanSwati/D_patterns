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
public class Parent implements Stakeholder {
    private String progress;

    public Parent() {
        this.progress = "No progress available";
    }

    public void monitorProgress() {
        // Logic for monitoring progress
        System.out.println("Parent is monitoring progress: " + progress);
    }

    public void sendMessage(String message) {
        // Logic for sending messages
        System.out.println("Parent sent a message: " + message);
    }
}