/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Proxy;

/**
 *
 * @author fa20-bse-052
 */


public class RemoteImage implements Image{
    public void display(String actualSource) {
        System.out.println("Loaing image from actual source "+actualSource);
    }
}
