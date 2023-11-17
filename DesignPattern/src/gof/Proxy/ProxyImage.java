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


import java.util.ArrayList;
import java.util.Arrays;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageType;
    private String supportedTypes;
    private String fileName;

    public ProxyImage(String fileName, String imageType){
        this.fileName = fileName;
        this.imageType = imageType;
        supportedTypes = "png,svg";
    }

   ProxyImage(String test_10mbjpg, String png) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display(String imageType) {
        if(supportedTypes.contains(imageType)){
            realImage = new RealImage(fileName);
            realImage.display(imageType);
        }
        else{
            System.out.println("Displaying fake version of "+imageType);
        }
    }
}