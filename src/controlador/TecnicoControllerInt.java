/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Persona;

/**
 *
 * @author Carlos Prada
 */
public interface TecnicoControllerInt {
    public void crearCliente(Persona p, ArrayList<Persona> listaClientes);
    public Cliente buscarCliente(ArrayList<Cliente> listaClientes);
    public void eliminarClienteDocumento(ArrayList<Persona> listaClientes);
    public String mostrarClientes(ArrayList<Cliente> listaClientes);
}
