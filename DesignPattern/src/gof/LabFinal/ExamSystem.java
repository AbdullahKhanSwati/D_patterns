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
public class ExamSystem {
    private static ExamSystem instance;

    private ExamSystem() {
        // Private constructor to enforce Singleton pattern
    }

    public static ExamSystem getInstance() {
        if (instance == null) {
            instance = new ExamSystem();
        }
        return instance;
    }

    public void setSchedule(Admin admin, String schedule) {
        admin.setSchedule(schedule);
    }

    public void setConduction(Admin admin, String details) {
        admin.setConduction(details);
    }
}