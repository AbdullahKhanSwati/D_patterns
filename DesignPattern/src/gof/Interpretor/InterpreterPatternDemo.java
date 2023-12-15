/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.Interpretor;

/**
 *
 * @author fa20-bse-052
 */
public class InterpreterPatternDemo {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
 public static Expression getSonExpression(){
      Expression Stuart = new SonExpression("Stuart");
      Expression Son = new SonExpression("Son");
      return new AndExpression(Stuart, Son);		
   }
  public static Expression getDaughterExpression(){
      Expression Samantha = new DaughterExpression("Samantha");
      Expression Daughter = new SonExpression("Daughter");
      return new AndExpression(Samantha, Daughter);		
   }
   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSon = getSonExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Staurt is a Son of Robert? " + isSon.interpret("Robert's Son"));
      System.out.println("Samantaha is a Daughter of Julie? " + isSon.interpret("Julie's Daughter"));
   }
}