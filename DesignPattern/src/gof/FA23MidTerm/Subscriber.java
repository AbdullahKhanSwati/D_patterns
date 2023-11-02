/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.FA23MidTerm;

/**
 *
 * @author fa20-bse-052
// */
//public class Subscriber {
//    
//}





import java.util.ArrayList;
import java.util.List;

public class Subscriber {
	
   private List<ViewersOfMatch> observers = new ArrayList<ViewersOfMatch>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(ViewersOfMatch observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (ViewersOfMatch observer : observers) {
         observer.update();
      }
   } 	
}