package sdf;

public class CarMain2 {

    public static void main(String[] args) {
        
        Porche p=new Porche();

        Car c = new Porche("yellow","s1234z");

        System.out.printf(">>>>>>>c.registration: %s, %s \n",c.getResistration(),c.getColour());

        
        p =(Porche) c;//castting
        p.accelerate();

        System.out.printf(">>>>p.registration: %s, %s\n",p.getResistration(),p.getColour());

        //c=new Car();
        if (c  instanceof Porche){
            System.out.println("you have a porche");
            p=(Porche) c;
            p.accelerate();
        }else{
            System.out.println("your car is not a porche");
        }

    }
    
}
