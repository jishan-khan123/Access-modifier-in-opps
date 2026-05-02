
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


}

public class getter_setter01 {
public static void main(String[] args) {
 
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

}    
}


