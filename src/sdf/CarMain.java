package sdf;

public class CarMain{

    public static void main(String[] args) {
        Car c =new Car();
        c.setColour("grey");
        c.setResistration("sdf1234B");
        c.start();
        System.out.printf("Is this car started? %b\n", c.isStarted());

        c.getOutOfWay();

        Car d=new Car();
        //d.setColour("red");
        System.out.printf("Colour of this car d is %s\n", d.getColour());


        Car e=new Car("black","s1234c");
        System.out.printf("Colour of my car? %s\n", e.getColour());
        System.out.printf("registration of my car? %s\n", e.getResistration());

        
    }
}