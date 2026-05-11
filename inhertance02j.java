
//  class Animal{   // this is parents class
// void eat(){
//     System.out.println("Animal are eats");
// }
// }

//  class DOG extends Animal  {
// void walk(){
// System.out.println("dogs are walking");
// }
 
    
// }
// main class or main function m lokjnah h ye code
// DOG d1 = new DOG();
// d1.eat();  // parents ka method pront krne ke lie
// d1.walk(); // child ka method pront krne ke lie        

 // double inheritance
class parntsvechile{
    int model;
    String name;
double miledge;
String ftype;
boolean sunroof;
void display(){
    System.out.println(" model: " + model);
    System.out.println(" name: " + name);
    System.out.println(" moildge: " + miledge);
    System.out.println(" engine type: " + ftype);
    System.out.println( " open body: " + sunroof);
}
}
    
 

class car extends parntsvechile{
String color;
int serial;
float plat;
}


// singal inheritance
class employee{
    void salry(){
        System.out.println("salary = 120000");
    }
}
class hr extends employee{
    void bonus(){
        System.err.println("bonus = 1500");
    }
}
public class inhertance02j {

    public static void main(String[] args) {
      
        car a1 = new car();
        a1.model = 2025;
        a1.miledge = 455544;
        a1.ftype = "diesel";
        a1.sunroof = true;
        a1.display();

        //singal inheritance
        hr a1 = new hr();
        a1.salry();
        System.out.println();
        
        a1.bonus();






    }
}