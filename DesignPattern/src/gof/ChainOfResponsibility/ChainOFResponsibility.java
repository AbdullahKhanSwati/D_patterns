/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.ChainOfResponsibility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fa20-bse-052
 */

 abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;
    static int WARNING;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
   }

   abstract protected void write(String message);
	
}



class ConsoleLogger extends AbstractLogger {

   public ConsoleLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Standard Console::Logger: " + message);
   }
}



class ErrorLogger extends AbstractLogger {

   public ErrorLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("Error Console::Logger: " + message);
   }
}


class FileLogger extends AbstractLogger {

   public FileLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
      System.out.println("File::Logger: " + message);
   }
}






public class ChainOFResponsibility {


    private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
  AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
  AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
  AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARNING);

  errorLogger.setNextLogger(fileLogger);
  fileLogger.setNextLogger(consoleLogger);
  consoleLogger.setNextLogger(databaseLogger); // Add the database logger to the chain

  return errorLogger;
   }
    
    private static AbstractLogger getNewChainOfLoggers(){

  AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
  AbstractLogger warningLogger = new DatabaseLogger(AbstractLogger.WARNING);
  AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

  errorLogger.setNextLogger(warningLogger);
  warningLogger.setNextLogger(infoLogger);

  return errorLogger;
}
  

    
    
    public static void main(String[] args) {
       AbstractLogger loggerChain = getChainOfLoggers();

    loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
    loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

    // Using the new chain for error, warning, and info messages
    AbstractLogger newLoggerChain = getNewChainOfLoggers();

    newLoggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
    newLoggerChain.logMessage(AbstractLogger.WARNING, "This is a warning information.");
    newLoggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
    
}
