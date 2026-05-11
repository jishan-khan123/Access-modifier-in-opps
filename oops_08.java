class cellphone{
    int quantity;
String name;
int number;



void phones(){
    System.out.println("mobile phone quantity" + quantity);
    System.out.println("mobile model name" + name);
    System.out.println("mobile phone order number" + number);
} 
}

class student{                   // it is class
int salary;
String name;
int age;
int roll;
int marks;
String grade;




void display(){                                       // its method to print var
    System.out.println("salary: " + salary );
    System.out.println("Name: " + name );
    System.out.println("age: " + age );
    System.out.println("roll: " + roll);
    System.out.println("marks: " + marks);
    System.out.println("Grade: " + grade);
}

}

public class oops_08 {
public static void main(String[] args){

student s1 = new student();  // object
student s2 = new student();  // object
student s3 = new student();  // object

cellphone a1 = new cellphone();  // object


s1.salary = 546564;
s1.name = "jishan";
s1.age = 21;
s1.roll = 4010;
s1.marks = 450;
s1.grade = "A+";
s1.display();
        
System.out.println("this is second student data ");

s2.salary = 544564;
s2.name = "Rihan";
s2.age = 22;
s2.roll = 4036;
s2.marks = 445;
s2.grade = "B+";
s2.display();

System.out.println("this is third student data ");

s3.salary = 546364;
s3.name = "Aman";
s3.age = 18;
s3.roll = 4038;
s3.marks = 425;
s3.grade = "C+";
s3.display();

System.out.println("this is other class data ");
a1.quantity = 456;
a1.name = "oppo";
a1.number = 00156;
a1.phones();



    }
}
