/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ChainOfResponsibility;

import gof.ChainOfResponsibility.AbstractLogger;

/**
 *
 * @author fa20-bse-052
 */
class DatabaseLogger extends AbstractLogger {

   public DatabaseLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      // Code to log message to the database
      System.out.println("Database::Logger: " + message);
   }
}

