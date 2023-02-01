package exampleBasics;

public class CreatorLamp {
    private String color;
    private boolean switchedOn;

    public static  void main(String[] args){
        Lamp lamp = new Lamp();
        System.out.println(lamp.getColor()+ ""+lamp.isSwitchedOn());
        lamp.interruptor();
        System.out.println(lamp.getColor()+""+lamp.isSwitchedOn());
        System.out.println(lamp);
    }
}
