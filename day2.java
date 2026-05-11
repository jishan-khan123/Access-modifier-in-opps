import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {

        System.out.println("hello today we are working on relational operators");

        Scanner sc = new Scanner(System.in);
        /* 
        switch (a) {
            case 1:
                System.out.println("hi");
                break;
            case 2:7
                System.out.println("hello");
                break;
            case 3:
                
                System.out.println("hey");
                break;
            default:
                System.out.println("noty boy");
      
                 switch (a) {   
                    case 1:System.out.println("Monday");
                        break;
                        case 2:System.out.println("Tuesday");
                        break;
                        case 3:System.out.println("wednesday");
                        break;
                        case 4:System.out.println("Thursday");
                        break;
                        case 5:System.out.println("Friday");
                        break;
                        case 6:System.out.println("Saturday");
                        break;
                        case 7:System.out.println("Sunday");
                        break; 
                        default: System.out.println("invalid days");
                        break;
                 }

                  

                         System.out.print("Enter A,E,I,O,U: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");

        }

        //find number of days in month

        System.out.println("please enter 1-12 and get month name");
        int month = sc.nextInt();

        switch (month) {
            case 1:System.out.println("January 31 ");break;
            case 2:System.out.println("Ferbuary 28 ");break;
            case 3:System.out.println("March 31 ");break;
            case 4:System.out.println("April 30 ");break;
            case 5:System.out.println("May 31 ");break;
            case 6:System.out.println("June 30 ");break;
            case 7:System.out.println("July 31 ");break;
            case 8:System.out.println("August 31 ");break;
            case 9:System.out.println("September 30");break;
            case 10:System.out.println("October 31");break;
            case 11:System.out.println("November 30");break;
            case 12:System.out.println("December 31");break;

            default:System.out.println("invalid month");
                
        }
        //student check own score easily by this Grade System
        System.out.println("enter student marks and get grade");
        int grade = sc.nextInt();
        switch ( grade/10) {
            case 10:
            case 9:                                       
                System.out.println("Grade A ");
                break;
            case 8:
            case 7: 
                System.out.println("Grade B ");
                break;
            case 6:
            case 5: 
                System.out.println("Grade C ");
                break;
            case 4:
            case 3: 
                System.out.println("Grade D ");
                break;
        
            default:System.out.println("fail");
                break;
        }
                
//       traffic light system

           System.out.println("Enter  signal button ");
           int traffic= sc.next().charAt(0);
           switch (traffic) {
          case 'r':
          case 'y':
         System.out.println("stop");
        break;
        case 'b':
       case 'R':
        System.out.println("Ready");
        break;
        case 'Y':
       case 'B':
        System.out.println("Go");
        break;

            default:System.out.println("invalid signal");
        break;
}
        


        // simple menu system
    System.out.println("User enter your condition");
int ammount =sc.nextInt();
switch (ammount) {
    case 1:System.out.println("Balance check");
        break;
        case 2:System.out.println("savings Account");
        break;
         case 3:System.out.println("Withdraw");
        break;
         case 4:System.out.println("Deposit");
        break;

    default:System.out.println("invalid user");
        break;
}

// simple 4 digit otp generate your mobile  number in java
Random rand=new Random();

System.out.println("enter your mobile number");
long number= sc.nextLong();
int otp = 1000 + rand.nextInt(9999);
System.out.println("OTP sent to your mobile number ");
System.out.println("your otp is " + otp);
System.out.println( number);
*/
System.out.println("enter first num");
int m=sc.nextInt();
System.out.println("enter second number");
int n=sc.nextInt();
if (m>n && n<m) {
    System.out.println("hey");
}
else{
    System.out.println("hello");
}


    }
    }

