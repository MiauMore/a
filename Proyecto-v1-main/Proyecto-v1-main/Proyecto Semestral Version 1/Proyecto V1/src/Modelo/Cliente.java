package Modelo;

public class Cliente {
    private String rut;
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean activo=true;

    public Cliente (String rut, String nom, String dir, String tel){
        this.rut=rut;
        this.nombre=nom;
        this.direccion=dir;
        this.telefono=tel;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isActivo(){

        return activo;
    }

    public void setActivo(){
        this.activo = true;
    }

    public void setInactivo(){
        this.activo = false;
    }

    public void addArriendo(Arriendo arriendo){

    }

    public Arriendo[] getArriendosPorDevolver(){
        //Retorna todos los arriendos de un cliente que tengan el estado ENTREGADO.
        if
        return new Arriendo[0];
    }
}
