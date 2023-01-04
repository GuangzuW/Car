package sdf;

public class Car{
    //members
    private String resistration;
    private String colour;
    private int year;
    private boolean started;

    //constructor
    public Car(){
    //default constructor
        this.colour="white";
    }

    public Car(String colour, String registration){
        this.colour=colour;
        this.resistration=registration;
    }



    public String getResistration() {
        return resistration;
    }

    public String getColour() {
        return colour;
    }

    public void setResistration(String resistration) {
        this.resistration = resistration;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    //method
    public void start(){
        this.started=true;
    }

    public void stop(){
        this.started=false;
    }

    public void getOutOfWay(){
        System.out.println("HONK................");
    }

    
}