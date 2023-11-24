/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Adapter;

/**
 *
 * @author fa20-bse-052
 */
public class AacPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing AAC file. Name: " + fileName);
    }
}