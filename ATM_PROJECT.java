import java.util.Scanner;

class ATM{
    float valance;
    int pin = 7860;
   

    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Pin : ");
         int enterpin = sc.nextInt();
         if (enterpin == pin) {
            menu();
         }
         else{
            System.out.println("Pin is incorrect");
         }

        /*  System.out.println("enter again");
         enterpin = sc.nextInt();*/

    }


    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C valance");
        System.out.println("2. Withdraw Ammount");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        while (true) {
        Scanner sc = new Scanner(System.in);
   int  option = sc.nextInt();
        switch (option) {
            case 1 : 
            valance();
                break;

             case 2 : 
            withdrawammount();
                break;

             case 3 : 
            deposit();
                break;

            case 4 : 
            exit();
                break;
            default:
                System.out.println("Enter a valid choose option");
                break;
        }
        }
    }

    public void valance(){
        System.out.println("valance " + valance);
        menu();
    }


    public void withdrawammount(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter ammount to withdraw");
        float ammount = sc.nextFloat();
        if(ammount>valance){
            System.out.println("A/C Valance is Sufficient");
        }
        else{
    
             valance = valance-ammount;
            System.out.println("Amount Withdraw is Succesfull");
        }
         
        menu();
    }


    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deposit  ammount");
        float amount1 = sc.nextFloat();

        valance = valance + amount1;
        System.out.println("Ammount deposit successfully");

    }
    public void exit(){
        return;
    }
}
public class ATM_PROJECT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM obj = new ATM();
        obj.checkpin();
    }
    
}
