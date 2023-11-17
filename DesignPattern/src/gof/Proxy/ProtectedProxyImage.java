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


public class ProtectedProxyImage implements Image{
    private String allowedUsers;
    private String userName;
    public ProtectedProxyImage(String userName){
        this.userName = userName;
        allowedUsers = "ali,fahad";
    }

    ProtectedProxyImage(String assad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ProtectedProxyImage(String assad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void display(String imageType) {
        if(allowedUsers.contains(userName)){
            System.out.println(userName + " authenticated.");
            new ProtectedImage().display(imageType);
    
        }
        else {
            System.out.println(userName + " not authenticated and display a fake image to him.");
        }
    }
}
