package Modelo;

public class Equipo {
    private long codigo;
    private String descripcion;
    private long precioArriendoDia;
    private EstadoEquipo estado;

    public Equipo(long cod, String desc, long precio){
        codigo= cod;
        descripcion=desc;
        precioArriendoDia=precio;
        estado=EstadoEquipo.OPERATIVO;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public long getPrecioArriendoDia() {
        return precioArriendoDia;
    }

    public EstadoEquipo getEstado() {
        return estado;
    }

    public void setEstado(EstadoEquipo estado) {
        this.estado = estado;
    }

    public void addDetalleArriendo(DetalleArriendo detalle){

    }

    public boolean isArrendado(){
        return ;
    }
}
