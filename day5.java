import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        /* 
   int marks[] = {1,2,3,4,5,6,7,8,9,10};
System.out.println("this is starting order");
    for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
    }
   
    for(int i = marks.length-1;i>=0;i--){
        System.out.println(marks[i]);
    }
    */
   //type casting in java
   //it is of two types
    //1.widening typecasting
    // int a  =10;
    // double b = a;
    // System.out.println(b);
    //2.narrowing typecasting
    // double b =20.8;
    // int a = (int)b;
    // System.out.println(a);
// convert double into int  it is calleed = narrowing typecasting



// variables declration
/* 
    int a;
    String name;
    
// variable initialization

    a = 10;
    name = "java";
    int age  = 12;
    
    //System.out.println(Str."Hello, \{name}. You are \{age} years old");
System.out.println("Hello, " + name + ". You are " + age + " years old");
// ye print f h
System.out.printf("Hello, %s. You are %d years old", name, age);

❌ Galti 1: Java me \{name} jaisa interpolation nahi hota

Ye style Python / JavaScript me hota hai,
❌ Java me nahi hota — isliye error aa raha hai:

illegal escape character

Java me \n, \t, \\ jaise escapes hote hain,
lekin \{ ❌ valid nahi hai. */

// we are practise on 2d array
Scanner sc= new Scanner(System.in);
  System.out.println("enter rows");
 int rows = sc.nextInt();
 System.out.println("enter colm");
 int colm = sc.nextInt();
 int [][] number = new int[rows][colm];
 //input outer loop 
  // rows input
  for(int i= 0; i<rows;i++){
    // column input
    for(int j=0; j<colm;j++){
        number[i][j] = sc.nextInt();
    }
  }
  int x = sc.nextInt();
  //searching x in 2d array
for(int i=0;i<rows;i++){
    for(int j=0; j<colm; j++){
        if (number[i][j] == x) {
            System.out.println(" x at found location (" + i + " , " + j + ")" );
        }
    }
}





//   System.out.println("output Result");
//   //output outer loop
// for(int i= 0; i<rows;i++){
//     for(int j=0; j<colm;j++){
//         System.out.print(number[i][j] + " ");   
//     }
//     System.out.println();
// }













    }
}















        
  
