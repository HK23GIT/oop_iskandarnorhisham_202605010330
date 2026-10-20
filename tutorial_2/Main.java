public class Main{
    
    public static void  main(String[] args){
     car mycar  = new car(); //init the object
    mycar.brand = "toyota";
    mycar.color = "grey";
    mycar.speed = 100;
    
    System.out.println("Below is Attribute");
    System.out.println(mycar.brand);
    System.out.println("Below is Method");
    mycar.displayinfo();
    } 
}