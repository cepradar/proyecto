package modelo;

import controlador.TecnicoControllerInt;
import java.util.ArrayList;

public class Admin extends Persona implements TecnicoControllerInt{
    
    public Admin(String nombre, int documento, String telefono, String direccion) {
        super(nombre, documento, telefono, direccion);
        this.idTipoUsuario = 1;
    }

    @Override
    public void crearCliente(Persona p, ArrayList<Persona> listaClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente buscarCliente(ArrayList<Cliente> listaClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarClienteDocumento(ArrayList<Persona> listaClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String mostrarClientes(ArrayList<Cliente> listaClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
