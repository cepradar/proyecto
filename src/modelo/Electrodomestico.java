package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Electrodomestico {
    public String tipo;
    public String marca;
    public String modelo;
    public String nSerie;
    public int idDueño;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", nSerie=" + nSerie + ", idDue\u00f1o=" + idDueño + '}';
    }
    
       
}
