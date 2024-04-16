package model;


public class Marca  {

    public static Marca MERCEDES_BENZ;
    public static Marca ARNOLD;
    
    public  String name;

    public Marca(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
