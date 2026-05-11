import java.util. ArrayList;
import java.util.Scanner;
public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
Scanner sc = new Scanner(System.in);
        // add  number 
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
System.out.println("this is add methodd");
        // get element
        list.add(8);
        System.out.println(list);
        System.out.println("this is set methodd");
        //   set element (replace number)
        list.set(3,9);
        System.out.println(list);
    System.out.println("this is add element between number methodd");
        //add element between number
        list.add(0,10);
        System.out.println(list);
System.out.println("this is delete methodd");
        // delete element
        list.remove(0);
        System.out.println(list);

        // size method
        System.out.println("this is size methodd");
         int size = list.size();
        System.out.println(size);




// using for looop condition to take input from user


    }
    
}
