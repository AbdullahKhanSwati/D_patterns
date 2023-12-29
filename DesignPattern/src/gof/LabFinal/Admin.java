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
public class Admin implements Stakeholder {
    private String schedule;
    private String conductionDetails;

    public Admin(String schedule, String conductionDetails) {
        this.schedule = schedule;
        this.conductionDetails = conductionDetails;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
        System.out.println("Admin: Schedule set - " + schedule);
    }

    public void setConduction(String details) {
        this.conductionDetails = details;
        System.out.println("Admin: Conduction details set - " + details);
    }

    public void sendMessage(String message) {
        // Logic for sending messages
        System.out.println("Admin sent a message: " + message);
    }

    String getSchedule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getConductionDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}