/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobuque;

/**
 *
 * @author ESTUDIANTES
 */
public class Buque {
    private double areaBuque;
    private double limCarga;
    private String estado;
    private String fechaArribo;
    private String fechaZarpado;
    private int numContenedores;
    private double valoracionTotal;
    
    public Buque(){
        this.areaBuque = 0;
        this.limCarga = 0;
        this.estado = "Arribado";
        this.fechaArribo = "13/03/2023";
        this.fechaZarpado = "23/09/2022";
        this.numContenedores = 0;
        this.valoracionTotal = 0;
    }
    
    public Buque(double areaBuque,double limCarga){
        this.areaBuque = areaBuque;
        this.limCarga = limCarga;
        this.estado = "Arribado";
        this.fechaArribo = "13/03/2023";
        this.fechaZarpado = "23/09/2022";
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaArribo() {
        return fechaArribo;
    }

    public void setFechaArribo(String fechaArribo) {
        this.fechaArribo = fechaArribo;
    }

    public String getFechaZarpado() {
        return fechaZarpado;
    }

    public void setFechaZarpado(String fechaZarpado) {
        this.fechaZarpado = fechaZarpado;
    }

    public int getNumContenedores() {
        return numContenedores;
    }

    public void setNumContenedores(int numContenedores) {
        this.numContenedores = numContenedores;
    }

    public double getValoracionTotal() {
        return valoracionTotal;
    }

    public void setValoracionTotal(double valoracionTotal) {
        this.valoracionTotal = valoracionTotal;
    }
    
    public String cargarContenedor(){
        
    }
    
    
}
