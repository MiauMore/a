package Modelo;

import java.util.Date;

public class Arriendo {

    private long codigo;
    private Date fechaInicio;
    private Date fechaDevolucion;
    private EstadoArriendo estado;

    public Arriendo(long codigo, Date fechaInicio, Cliente cliente) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;

        estado = EstadoArriendo.INICIADO;
    }

    public long getCodigo() {
        return codigo;
    }


    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public EstadoArriendo getEstado() {
        return estado;
    }

    public void setEstado(EstadoArriendo estado) {
        this.estado = estado;
    }
}
