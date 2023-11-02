/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.FA23MidTerm;

import javax.security.auth.Subject;

/**
 *
 * @author fa20-bse-052
 */
public class RequestForMatch {
    public static void main(String[] args) {
      Subscriber subscriber = new Subscriber();

//      new CountryViewers(subject);
      new ForiegnViewers(subscriber);
     

      System.out.println("First state change: 15");	
      subscriber.setState(15);
      System.out.println("Second state change: 10");	
      subscriber.setState(10);
   }
}
