/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buque.ejercicio;

/**
 *
 * @author HERNAN GUTIERREZ
 */
public class Contenedor {
    private double area;
    private double peso;
    private double valor;
    
    public Contenedor(double area, double peso, double valor){
        this.area = area;
        this.peso = peso;
        this.valor = valor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
