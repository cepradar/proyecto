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
    
    public Tecnico(String nombre, String apellido, double documento, String telefono, String direccion) {
        super(nombre, apellido, documento, telefono, direccion);
        this.idTipoUsuario = 2;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
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
        if(p.getIdTipoUsuario()!= 3){ //condicion implementada solo en este metodo para prueba
            System.out.println("Nombre");
            String nom = scan.nextLine();
            System.out.println("apellido");
            String ape = scan.nextLine();
            System.out.println("documento");
            double doc = Double.valueOf(scan.nextLine());
            System.out.println("telefono");
            String tel = scan.nextLine();
            System.out.println("direccion");
            String dir = scan.nextLine();
            listaClientes.add(new Cliente(nom, ape, doc, tel, dir));
        }
        else System.out.println("UD NO PUEDE HACER ESTO");
    }
    
    @Override
    public Cliente buscarCliente(ArrayList<Cliente> listaClientes){
        System.out.println("Ingrese el documento del cliente a buscar");
        double busqueda = Double.valueOf(scan.nextLine());
        for(Cliente x: listaClientes){
            if (String.valueOf(x.getDocumento()).compareTo(String.valueOf(busqueda))==0){
                System.out.println("Se encontro el cliente");
               return x;
            }
        }
        System.out.println("El cliente no se encuentra registrado");
        return null;
    }
    
    @Override
    public void eliminarClienteDocumento(ArrayList<Persona> listaClientes){
        boolean encontro = false;
        System.out.println("Ingrese el documento del cliente a eliminar");
        double busqueda = Double.valueOf(scan.nextLine());
        for(Persona x: listaClientes){
            if(String.valueOf(x.getDocumento()).compareTo(String.valueOf(busqueda))==0) {
                encontro = true;
                listaClientes.remove(x);
                System.out.println("El cliente fue removido con exito");
                break;
            }
        }
        if (encontro==false){
            System.out.println("El Cliente no se encuentra registrado");
        }
    }
    
    @Override
    public String mostrarClientes(ArrayList<Cliente> listaClientes){
        return listaClientes.toString();
    }
    
}
