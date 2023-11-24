/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Command.SubExpert;

/**
 *
 * @author fa20-bse-052
 */
public class Light {

    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

}