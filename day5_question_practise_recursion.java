import java.util.Scanner;

public class day5_question_practise_recursion {

    // print 1 to n number 
// static void  print1 (int n){
// if(n==0){
//     return;
// }
// print1(n-1);
// System.out.print(n + " ");
// }

// question n to 1 number
//  static void  print1 (int n){
// if(n==0){
//     return;
// }
// System.out.print(n + " ");
//  print1(n-1);
// }
// sum of n natural number
//  static double print3(double n){
//     if(n==0){
//         return 0;
//     }
//     return n + print3(n-1);
//  }


// count digit number
//  static int  print4(int n){
//     if(n==0){ // base cases
//         return 0;
//     }
//     return 1 + print4(n/10);
//  }
 // power of two number
//static int print5(int a,int b){
//   if (b==0) {
//     return 1;
//   }
//   return a* print5(a,b-1);
// }
static int reverse = 0;
static void reverse(int num){
if (num == 0) {
    return;
}
int digit = num % 10;
reverse = reverse * 10 + digit;
reverse (num/10); // recurssive call
}


   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
  // System.out.println("enter first num a");
  // int a =sc.nextInt();
  // System.out.println("enter second num b");
  // int b =sc.nextInt();
  // System.out.println(print5(a,b)); // function call 
//  System.out.println("enter n numer");
//  int n= sc.nextInt();
//  print1(n);

//   System.out.println("enter n numer");
//  int n= sc.nextInt();
//  print1(n);

//   System.out.println("enter n numer");
//  int  n= sc.nextInt();
// System.out.println(print5()); // function call 


// pallidrome number by recursion
System.out.println("enter first num a");
 int num  =sc.nextInt();
  int orginal = num;
 reverse(num); /// function call

if (orginal == reverse) {
    System.out.println("palledrem number");
}
else{
    
    System.out.println(" not palledrem number");

}
}
}