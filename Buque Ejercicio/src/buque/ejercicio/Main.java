/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buque.ejercicio;

/**
 *
 * @author HERNAN GUTIERREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buque buque = new Buque(100, 500);
        String resultado1 = buque.cargarContenedor(30, 100, 5000);
        String resultado2 = buque.cargarContenedor(new Contenedor(20, 50, 2000));
        String resultado3 = buque.cargarContenedor(25, 80, 3000); 

        System.out.println("Resultados de cargar contenedores:");
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);

        System.out.println("Area disponeble: " + buque.areaDisponible());
        System.out.println("Peso disponible: " + buque.pesoPermitido());

        buque.setEstado("Zarpado");
        String resultado4 = buque.cargarContenedor(40, 50, 5000); 
        System.out.println("Resultado 4: " + resultado4);
        
        System.out.println("Duracion del viaje: " + buque.duracionViaje() + " dias");
        System.out.println("Contenedores transportados: " + buque.contenedoresCargados());
        System.out.println("Valoracion de la carga: : " + "$" + buque.valorCarga());

    }
    
}
