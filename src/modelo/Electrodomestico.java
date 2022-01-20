package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Electrodomestico {
    public String tipo;
    public Date fecha;
    public Boolean reparado;
    public ArrayList<String> accesorios;

    public Electrodomestico(String tipo, Date fecha, Boolean reparado, ArrayList<String> accesorios) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.reparado = reparado;
        this.accesorios = accesorios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getReparado() {
        return reparado;
    }

    public void setReparado(Boolean reparado) {
        this.reparado = reparado;
    }

    public ArrayList<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<String> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", reparado=" + reparado +
                ", accesorios=" + accesorios +
                '}';
    }
}
