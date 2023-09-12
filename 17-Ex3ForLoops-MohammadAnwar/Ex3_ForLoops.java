import java.lang.Math;
import java.text.DecimalFormat;

//Ex3_ForLoops.java
class Ex3_ForLoops {
    public static void run() {
        // Declare decimal format for formatting decimals
        DecimalFormat df = new DecimalFormat("#.000");
        
        // Count up to 1000
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        
        // Count up to 50 showing the square roots of each number
        System.out.println("Square roots of each number until 50");
        for (int i = 0; i < 50; i++) {
            // round to decimal
            System.out.println(df.format(Math.sqrt(i)));
        }
        
        System.out.println("Counting down from 50, showing only the even numbers");
        // Count down from 50, showing the even numbers only
        for (int i = 50; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("Counting up to 100, showing only prime numbers");
        // Print out the Prime Numbers up to 100
        for (int num = 2; num <100; num++){
            // Initialize var to hold whether number is prime
            Boolean isPrime = true;
            // Check if it divisble against every number below it
            for (int againstNum = 2; againstNum < num; againstNum++){
                // If the number is divisble, then it is not prime
                if (num % againstNum == 0){ 
                    isPrime = false;
                }
            }
            // Print out the number if it is prime
            if (isPrime){
                System.out.println(num);
            }
        }
        // Code the FizzBuzz Game: https://www.youtube.com/watch?v=QPZ0pIK_wsc
        // Execute FizzBuzz
        for (int i = 0; i <= 100; i++){
            // If divisible by 15, print FizzBuzz
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){ // If divisible by 3, print Fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0){ // If divisible by 5, print Buzz
                System.out.println("Buzz");
            } else { // Or just print the number
                System.out.println(i);
            }
        }
    }
}