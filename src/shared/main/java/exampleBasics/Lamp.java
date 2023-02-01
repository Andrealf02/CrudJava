package exampleBasics;

public class Lamp {
    private String color;
    private boolean switchedOn;

    public Lamp(String color) {
        this.color = color;
    }
    public Lamp(){
        this("Roja");
    }
    public String getColor(){
        return color;
    }
    public void interruptor(){
        switchedOn = !switchedOn;
        System.out.println("Lamp:"+ switchedOn);
    }
    public boolean isSwitchedOn(){
        return switchedOn;
    }
}
