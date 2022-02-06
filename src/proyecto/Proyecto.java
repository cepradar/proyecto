/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import db.Conexion;
import java.util.ArrayList;
import javax.swing.JFrame;
import modelo.Admin;
import modelo.Cliente;
import modelo.Persona;
import modelo.Tecnico;
import vista.Inicio;
import vista.Principal;
import vista.Principal;

/**
 *
 * @author Carlos Prada
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Admin admin = new Admin("Carlos","Prada",1098779983, "300863938","cra 7 # 13-17");
        admin.crearCliente(new Cliente("juan","cho",1098273749,"3002452345","Cra 2 # 3-43"));
        System.out.println(admin.mostrarClientes().toString());
        System.out.println("........................");
        System.out.println(admin.toString());*
         */        
        //ArrayList<Persona> clientes = new ArrayList<>();
       // Admin admin = new Admin("Carlos",1098779983, "300863938","cra 7 # 13-17");
        //Tecnico tecnico = new Tecnico("juan",1098273749,"3002452345","Cra 2 # 3-43");
        //System.out.println(tecnico.toString());
        //tecnico.crearCliente(tecnico, clientes);
       // System.out.println(clientes);
        //JFrame v = new NewJFrame();
        //Conexion con = new Conexion();
        Inicio nuevaVentana = new Inicio();
        nuevaVentana.setVisible(true);
    }
    
}
