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
public interface Colleague {
    void sendMessage(String message, Colleague[] targets);

    public String getName();
}
