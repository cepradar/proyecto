/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;

/**
 *
 * @author Carlos Prada
 */
public class Conexion {
    String strConexion = "jdbc:mysql://127.0.0.1:3306/yoreparo";
    Connection conn = null;
    
    public Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexion,"root","admin");
            System.out.println("conexion establecida");
        } catch (Exception e) {
            System.out.println("error de conexion "+ e);
        }   
    }
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstn = conn.prepareStatement(strSentenciaSQL);
            pstn.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e+"hola");
            return 0;
        }
    }
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstn = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstn.executeQuery();
            return respuesta;
        } catch (SQLException e) {
            System.out.println(e+"holaaa");
            return null;
        }
    }
}
