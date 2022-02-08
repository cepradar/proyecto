/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import controlador.TecnicoControllerInt;

/**
 *
 * @author Carlos Prada
 */
public class Tecnico extends Persona implements TecnicoControllerInt{

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }
    
    Scanner scan = new Scanner(System.in);
    @Override
    public void crearCliente(Persona p, ArrayList<Persona> listaClientes){
        
    }
    
    @Override
    public Cliente buscarCliente(ArrayList<Cliente> listaClientes){
        Cliente objCliente = null;
        return objCliente;
    }
    
    @Override
    public void eliminarClienteDocumento(ArrayList<Persona> listaClientes){
       
    }
    
    @Override
    public String mostrarClientes(ArrayList<Cliente> listaClientes){
        return "-";
    }
    
}
