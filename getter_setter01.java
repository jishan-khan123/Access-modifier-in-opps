/* 
class labur{
    private String name;
    private int sellery;
    private int id;

    public void setname( String name){
        this.name = name;
        }

        public void setid(int id){
        this.id = id;
        }
// condition for  sellery 10k se km a ho
public void setsellery(int sellery){
    if(sellery >= 10000){
this.sellery = sellery;
    }
    else{
        System.out.println("sellery too low");
    }
}
// getter data 
public String getname(){
    return name;
}
public  int  getsellery(){
        return  sellery;
        }

public int getid( ){
    return id;
}
    public  void  incresesellery(int amount){
        sellery = sellery + amount;
    }
    
public void disaplaydata(){
    System.out.println(" Employe name " + name);
    System.out.println(" Employe id " + id);
    System.out.println(" Employe sellery " + sellery);
}


}*/


class human{
   private String name;
    private int age;
  private  String  gender;

    //setter mthod
    public void  setage(int age){
        if (age >= 75) {
            this.age = age;
        }

        else{
            System.out.println("human are not much old");
        }
            

        }
    

 public void setname( String name){
    this.name = name;
  } 

  
  public void setgender( String gender){
    this.gender = gender;
  }

  // getter method

  public int getage(){
    return age;
  }

  public String getname(){
    return name;
  }

  public String getgender(){
    return gender;
  }


  void display(){
    System.out.println( "HUMAN AGE " + age);
    System.out.println( "HUMAN NAME " + name);
    System.out.println( "HUMAN GENDER " + gender);
  }


  public void increseage(int newage){
    age = age + newage;
  }
  

}
public class getter_setter01 {
public static void main(String[] args) {
 /* 
    System.out.println("data start");
    labur a = new labur();
a.setname("jishankhan");
a.setid(45244);
a.setsellery(10000);
a.getname();
a.getid();

a.disaplaydata();
a.incresesellery(5000);

System.out.println(" New seller after increase " + a.getsellery());
a.getsellery();
*/




human a = new human();
a.setage(100);
a.setname("sabbbir khan");
a.setgender("MALE");

a.getage();
a.getname();
a.getgender();
System.out.println("old age");
a.display();
System.out.println("New age " + a.getage() );
}    
}


