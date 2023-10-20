/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.mediator;

/**
 *
 * @author fa20-bse-052
 */
public class University implements Colleague {
    private String name;

    public University(String name) {
        this.name = name;
    }

    University(String comsats) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message, Colleague[] targets) {
        ChatRoom.showMessage(this, message, targets);
    }
}

