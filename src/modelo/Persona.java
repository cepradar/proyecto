/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos Prada
 */
public class Persona {
    
    public String nombre;
    protected double documento;
    protected String telefono;
    protected String direccion;
    protected int idTipoUsuario; //1-Admin, 2-Tecnico, 3-Cliente

    public Persona(String nombre, double documento, String telefono, String direccion) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "nombre='" + nombre + '\''
                + ", documento=" + documento
                + ", telefono=" + telefono
                + ", direccion='" + direccion + '\''
                + '}';
    }
}
