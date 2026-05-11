import java.util.Scanner;

public class day1 {

    public static void main(String[] args) {
        System.out.println("hello this is java practise day 1");
         Scanner sc= new Scanner(System.in);
         
int a = 5;
int b = 10;

 a=a+b;
 b=a-b;
 a=a-b;
System.out.println(a);
System.out.println(b); 
 
System.out.println(" please enter number");
int x=sc.nextInt();
if (x % 2 == 0) {
    System.out.println("even number");
}
else{
    System.out.println("odd number");
}

System.out.println("how to check whose number is big");
System.out.println("enter first value");
int a=sc.nextInt();
System.out.println("enter second value");
int b=sc.nextInt();
if (a>b) {
    System.out.println(" A number is graeter then number B ");
}
else{
    System.out.println(" A number is smaller then number B ");
}
    
//how to find last digit number//
int number = sc.nextInt();
int lastdigit = number % 10; 
System.out.println(lastdigit + " your last digit number");


 //student collect your  percentage and score//
 System.out.println("student enter first subject score");
 double subject1 =  sc.nextDouble();
 System.out.println("student enter second subject score");
 double subject2 =  sc.nextDouble();
 System.out.println("student enter third subject score");
 double subject3 =  sc.nextDouble();

double total= (subject1+subject2+subject3);
double percentage = (total/300)*100;
double cgpa= (percentage/9.5);
System.out.println("this is your total marks  500 / "  + total);
System.out.println("percentage = " + percentage + "%");
System.out.println("CGPA " + cgpa);
    }
}