import java.util.Scanner;

public class day6Recursion {
    static   void pattern ( int n){
        for(int i =0;i<n;i++){
            for (int j=0;j<i+1;j++) {
                System.out.print(" X ");
            }
            System.out.println();
        }

        // for (int i= 1; i<=10;i++) {
        //     System.out.format( n + " X " + i + " = " +(n*i) + "\n");
        // }
        //this is fac torial fortmula by method of recursion
        // System.out.println("the factorial  y is = " + jishan(y));
    //     if (n==1 || n==0) {
    //        return 1; -
    //     }
    //     else{
             //return n * jishan  (n-1); 
    // }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter pattern number");
    int n= sc.nextInt();
    pattern(n);
  // table formula; 
   //static   void multilicatiion( int n){
        // for (int i= 1; i<=10;i++) {
        //     System.out.format( n + " X " + i + " = " +(n*i) + "\n");
        // }
//      
//      System.out.println("enter table number");
//  
//   multilicatiion(n);





}
    

    


    
}
    

