package modelo;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Electrodomestico> electrodomesticos;

    public Cliente(String nombre, String apellido, double documento, String telefono, String direccion) {
        super(nombre, apellido, documento, telefono, direccion);
        this.electrodomesticos = null;
        this.idTipoUsuario = 3;
    }

    public void nuevoElectrodomestico(Electrodomestico electrodomestico){
        this.electrodomesticos.add(electrodomestico);
    }

    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }
}
