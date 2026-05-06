
class techer{
    public int roll = 546542;
    private  int id = 1001;
    protected String name =  "jishan";
    String sex  = "male";

public void diplay(){
    System.out.println(roll);
    System.out.println(id);
    System.out.println(name);
    System.out.println(sex);
}

}





public class access_modifier {
    public static void main(String[] args) {
        
        techer t = new techer();
        t.diplay();
        System.out.println(t.roll);
        //System.out.println(t.id);
        System.out.println(t.name);
        System.out.println(t.sex);
        
    }
}
