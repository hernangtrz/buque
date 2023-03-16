/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buque.ejercicio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author HERNAN GUTIERREZ
 */
public class Buque {
    private double areaBuque;
    private double limCarga;
    private String estado;
    private double pesoActual;
    private int numContenedores;
    private double valoracionTotal;
    private LocalDate  fechaArribo;
    private LocalDate  fechaZarpado;
    
    public Buque(){
        this.areaBuque = 0;
        this.limCarga = 0;
        this.estado = "Arribado";
        this.fechaArribo = LocalDate.now();
        this.fechaZarpado = LocalDate.of(2023, 2, 23);
        this.numContenedores = 0;
        this.valoracionTotal = 0;
    }
    
    public Buque(double areaBuque,double limCarga){
        this.areaBuque = areaBuque;
        this.limCarga = limCarga;
        this.estado = "Arribado";
        this.fechaArribo = LocalDate.now();
        this.fechaZarpado = LocalDate.of(2023, 2, 23);
        this.numContenedores = 0;
        this.valoracionTotal = 0;
    }
    
    public double getAreaBuque(){
        return areaBuque;
    }
    
    public void setAreaBuque(double areaBuque){
        this.areaBuque = areaBuque;
    }

    public double getLimCarga() {
        return limCarga;
    }

    public void setLimCarga(double limCarga) {
        this.limCarga = limCarga;
    }

    public double getPesoActual() {
        return pesoActual;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaArribo() {
        return fechaArribo;
    }

    public LocalDate getFechaZarpado() {
        return fechaZarpado;
    }

    public int getNumContenedores() {
        return numContenedores;
    }
 
    public double getValoracionTotal() {
        return valoracionTotal;
    }
    
    public String cargarContenedor(double area, double peso, double valor){
        if (!"Arribado".equals(this.estado)){
            return "No se pudo cargar el contenedor ya que el buque se encuentra navegando";
        }else if (limCarga < peso + pesoActual){
            return "No se pudo cargar el contenedor ya que se supero el area del buque";
        }else if (areaBuque < area){
            return "No se pudo cargar el contenedor ya que se supero el area del buque";
        }
        areaBuque -= area;
        pesoActual += peso;
        valoracionTotal += valor;
        numContenedores++;
        return "Operacion exitosa";
    }
    
    public String cargarContenedor(Contenedor contenedor) {
    return cargarContenedor(contenedor.getArea(), contenedor.getPeso(), contenedor.getValor());
}
    
    public double areaDisponible(){
        return areaBuque;
    }
    
    public double pesoPermitido() {
        return limCarga - pesoActual;
}

    public double valorCarga() {
        return valoracionTotal;
    }
    
    public int contenedoresCargados(){
        return numContenedores;
    }
    

    public long duracionViaje() {
        return ChronoUnit.DAYS.between(fechaZarpado, fechaArribo);
        //Numero de dias que tardara el viaje
            }
}
