//first problem
interface camera{
    public void clickphoto();
}

interface music{
    public void song();
}

interface gps{
    public void maps();
}

 class SmartDevice implements camera,music,gps{
    public void clickphoto(){ 
        System.out.println("photo clicked");
    }


public void song(){
    System.out.println("music are played");
}

public void maps(){
    System.out.println("maps are run ");
}
 }

 public class multiple_inheritance04j {
 
    
 
public static void main(String[] args) {
    


SmartDevice device = new SmartDevice(); 

  device.clickphoto();
        device.song();
        device.maps();
        
}

 }
// 2nd problem 








    