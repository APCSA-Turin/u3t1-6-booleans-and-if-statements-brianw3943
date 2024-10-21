import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }
   // helper method that returns string containing message to be printed
   private String result(int num) {
        String output = "";
        if (num % 2 == 1) {
            if (num % 5 == 0 && num % 7 == 0) {
                output = "Divisible by both 5 and 7!";
            } else {
               if (num % 5 == 0) {
                output = "Divisible by 5!";
               } else {
               if (num % 7 == 0) {
                output = "Divisible by 7!";
               } else {
                output = "Not divisible by 5 or 7!";
               }
              }
            }
            
        }
        if (num % 2 == 0) {
            if (num >= 100) {
                output = "Big even number!";
            } else {
                if (num >= 50 && num < 100) {
                    output = "Medium even number!";
                } else {
                    output = "Small even number!";
                }
            }
        }
                if (num <= 0) {
            output = "That isn't positive!";
        }
        return output;
       // complete the code for this method;
       // make no other changes to the program
   }
}
