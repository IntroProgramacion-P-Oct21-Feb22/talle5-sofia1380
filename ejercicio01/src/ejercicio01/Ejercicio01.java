/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author cami
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    double costoKilovaltio;
    double valorConsumido;
    int edad;
    double descuento;
    double valorTotal;
    
    //funciones
    System.out.println("ingrese el costo por kilovaltio");
    costoKilovaltio = entrada.nextDouble();
    
    System.out.println("Ingrese el numero de Kilovaltios consumidos");
    valorConsumido = entrada.nextDouble();
    
    System.out.println("ingrese edad de la persona");
    edad = entrada.nextline();
    
    valorTotal = costoKilovaltio*valorConsumido;
    
    
    }
    
}
