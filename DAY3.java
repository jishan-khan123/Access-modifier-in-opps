import java.util.Scanner;

public class day3 {



     static int print1(int n) {
        if (n==0) {
            return 0;
        }

        return n + print1(n-1);
    }
    public static void main(String[] args) {
        System.out.println(print1(5));
  /*       

        int a =8;
        float b= 4.45454f;
        char k = 'j';
        String s ="Rajput";
        double m =54584545; 
        System.out.format("the value of a is = %d and the value of b is = %f and then value of c is = %c and the value of d is = %s" ,a,b,k,s);
        Scanner sc =new Scanner(System.in);
System.out.println("enter age");
        int age =sc.nextInt();
        System.out.println("enter marks");
        int marks = sc.nextInt();
        if (age<=18 && marks >= 33) {
            System.out.println("congrats....!");
        }
        else{
            System.out.println("you are not Eligible and try again");
        }
       

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
System.out.println();
                }
int i = 0;
while (i<100) {

System.out.println(i);
if (i == 50) {
    break;
}
else{
    System.out.println("baby");
}
i++;

}
System.out.println("hello !");
*/ 








}
    }

