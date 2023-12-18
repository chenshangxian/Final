package Java.Rock;
import java.util.Scanner;
public class Rock {

 public static void main(String[] args) {
  int countYou = 0;
  int countComputer = 0;
  int countTie = 0;
  
  for(int i=0; i<10; i++) {
  
   String personPlay; //User's play -- "R", "P", or "S"
   String computerPlay = "U"; //Computer's play -- "R", "P", or "S"
   int computerInt=(int) (Math.random()*3); //Randomly generated number for computer play
   Scanner scan = new Scanner(System.in);
  
   System.out.println("Enter your play: R, P, or S");
   personPlay = scan.nextLine().toUpperCase();
  
   while(personPlay.length()==1&&!personPlay.equals("R")&&!personPlay.equals("P")&&!personPlay.equals("S")) {
   
    System.out.println("Enter your play: R, P, or S");
    personPlay = scan.nextLine().toUpperCase();
   }
  
   while(personPlay.length()>1) {
    if(personPlay.substring(0,2).equals("RO")) {
     personPlay="R";
    }else if(personPlay.substring(0,2).equals("PA")) {
     personPlay="P";
    }else if(personPlay.substring(0,2).equals("SC")) {
     personPlay="S";
    }else {
    System.out.println("Enter your play: R, P, or S");
    personPlay = scan.nextLine().toUpperCase();
    }
 
   }
  
  
   if (computerInt == 0) {
    computerPlay = "R";
   }
   else if (computerInt == 1) {
    computerPlay = "P";
   }else {
    computerPlay = "S";
   }
  
   System.out.println("computer play is "+computerPlay);
      
   if (personPlay.equals(computerPlay)) {
    System.out.println("It's a tie!");
    countTie++;
   }
   
   else if (personPlay.equals("R")) {
    if (computerPlay.equals("S")) {
     System.out.println("Rock crushes scissors. You win!!");
     countYou++;
    }
    if(computerPlay.equals("P")) {
     System.out.println( "you lost!!");
     countComputer++;
    }
   }
   
   else if(personPlay.equals("S")) {
    if (computerPlay.equals("R")) {
     System.out.println("Rock crushes scissors. You lost!!");
     countComputer++;
    }
    if(computerPlay.equals("P")) {
     System.out.println( "you win!!");
     countYou++;
    }
   }
   
   else {
    if (computerPlay.equals("R")) {
     System.out.println("Rock crushes scissors. You win!!");
     countYou++;
    }
   
    if(computerPlay.equals("S")) {
     System.out.println( "you lost!!");
     countComputer++;
    }
   }
  }
  
  System.out.println("tie times:"+ countTie);
  System.out.println("you won times:"+ countYou);
  System.out.println("computer won times"+ countComputer);
  
 
 }

}