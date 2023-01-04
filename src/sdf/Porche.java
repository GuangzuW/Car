package sdf;

public class Porche extends Car{


    private String turbo="off";
    private int accelerate=0;
    public Porche(){
       super.setColour("red");//call parent method
    }

    public Porche(String colour,String registration){
        setColour(colour);
        setResistration(registration);
    }
    
public String getTurbo(){return turbo;}


//I can no longer change colour of the car once it is 
@Override
public void setColour(String c){}// not allow change colour

public void accelerate(){
    this.accelerate++;
    if(this.accelerate>4){
        this.turbo="on";
    }

}
public void decelerate(){
    this.accelerate--;
    if(this.accelerate>=4){
        this.turbo="off";
    }

}



}
