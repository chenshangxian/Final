package Java.ACMEPay;
import java.util.*;
public class ACMEPay {
    public static void main(String[] args) throws Exception 
    {
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();

      //ask for hours worked
        System.out.println("How many hours do you worked?");
        double hours = input.nextDouble();
      //ask for participation in retirement plan if the second or third shift are selected
        if(shift == 2 || shift == 3){
            System.out.println("Do you want to participate in the retirement plan?(Y or N)");
            String choice = input.next();
            if(choice.equalsIgnoreCase("y")){
                retire = 1;
            }else {
                retire = 0;
            }
        }

        double rate = payRate(shift);
        double gross = grossPay(rate, hours);
        
        System.out.println("Hours worked is " + hours);
        System.out.println("Hourly pay rate is " + rate);
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }

    public static double payRate(int shift)
    {
        //fill in the details
        double rate = 0;
        if(shift == 1){
            rate = 17;
        }else if(shift == 2){
            rate = 18.50;
        }else if(shift == 3){
            rate = 22;
        }
        return rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        //fill in details
        double regular = 0;
        double overtime = 0;
        if(hours > 40){
            regular = rate * 40;
            overtime = (hours - 40) * 1.5 * rate;
        }else {
            regular = hours * rate;
        }
        System.out.println("The regular pay is " + regular);
        System.out.println("The overtime pay is " + overtime);
        System.out.println("The total of regular and overtime pay is " +(regular + overtime));
    }

    public static double grossPay(double rate, double hours)
    {
        //fill in details 
        if(hours > 40){
            return 40 * rate + (hours - 40) * rate * 1.5;
        }
        return rate * hours;
    }

    public static void retirementPay(int shift ,int choice, double gross)
    {
        //fill in details
        double retire = 0;
        if(shift == 2 || shift == 3){
            if(choice == 1){
                retire = gross * 0.03;
            }
        }
        System.out.println("Retirment Deduction is " + retire);
        System.out.println("Net Pay is ...................." + (gross - retire));
    }
}
