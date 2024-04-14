package model;

public class Empleado extends Usuario {

    private String cargo;
    
    public Empleado(String usuario, int contraseña, String nombre, int identificacion, String direccion, int telefono,
            String cargo) {
        super(usuario, contraseña, nombre, identificacion, direccion, telefono);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
