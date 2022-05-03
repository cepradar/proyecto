/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author SERVIPRADA
 */
public class OT {
    public int idTecnico;
    public int idElectrodomestico;
    public String fechaRecepcion;
    public String fechaEntrega;
    public int valorRevision;
    public String accesoriosRecibidos;
    public String Historia;
    public int totalAPagar;

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getIdElectrodomestico() {
        return idElectrodomestico;
    }

    public void setIdElectrodomestico(int idElectrodomestico) {
        this.idElectrodomestico = idElectrodomestico;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getValorRevision() {
        return valorRevision;
    }

    public void setValorRevision(int valorRevision) {
        this.valorRevision = valorRevision;
    }

    public String getAccesoriosRecibidos() {
        return accesoriosRecibidos;
    }

    public void setAccesoriosRecibidos(String accesoriosRecibidos) {
        this.accesoriosRecibidos = accesoriosRecibidos;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String Historia) {
        this.Historia = Historia;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
    
    
}
