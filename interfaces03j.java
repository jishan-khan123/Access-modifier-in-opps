 
 /* 
 interface Car{
   public void Start();

  } 
   class Electric  implements  Car {
 public void Start(){
System.out.println("electric car run");
}

   }

class Diesel implements Car{
     public void Start(){
        System.out.println("Diesel car start");
    }
}

class Ev implements  Car{
    public void Start(){
        System.out.println("ev car is run");
    }
}
    */
/* 
interface A{
   public  void Shock();
}
class B implements A{
    public void Shock(){
        System.out.println("this is B method");
    }
}

class C implements A{
    public void Shock(){
        System.out.println("this is C  method");
    }
}

class D implements A{
    public void Shock(){
        System.out.println("this is D method");
    }
}*/

interface payment{
    public void pay();
}

class upi  implements payment{
public void pay(){
System.out.println(" This is UPI payments");
}
}

class card  implements payment{
public void pay(){
System.out.println(" This is CARD payments");
}
}

class  wallet   implements payment{
public void pay(){
System.out.println(" This is WALLET payments");
}
}


public class interfaces03j {
    public static void main (String[]args){
// Car  a1 = new Diesel();
// a1.Start();
//  A  A1 = new D();
//  A1.Shock();


payment   A1  = new upi();
payment   A2  = new card();
payment   A3  = new wallet();
A3.pay();








    }
}
