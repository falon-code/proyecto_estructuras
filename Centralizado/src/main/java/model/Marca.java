package model;

public class Marca {
    public static final Marca MERCEDES_BENZ = new Marca("Mercedes-Benz");
    public static final Marca ARNOLD = new Marca("Arnold");

    private String name;

    private Marca(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
