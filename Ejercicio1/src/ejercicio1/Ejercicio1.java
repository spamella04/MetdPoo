/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Synthia Pamella
 */
public class Ejercicio1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner entrada = new Scanner(System.in);

    Trabajador trabajador = new Trabajador();

    System.out.println("<<Registro de datos>>");
    System.out.println();
    
    System.out.print("Ingrese codigo: ");
    int codigoTrabajador = entrada.nextInt();
    trabajador.setCodigo(codigoTrabajador);

    System.out.println();

    System.out.print("Ingrese Nombre: ");
    entrada.nextLine(); //limpiamos buffer de entrada
    String nombreTrabajador = entrada.nextLine();
    trabajador.setNombre(nombreTrabajador);

    System.out.println();

    System.out.print("Ingrese Apellidos: ");
    String apellidosTrabajador = entrada.nextLine();
    trabajador.setApellido(apellidosTrabajador);

    System.out.println();

    System.out.print("Ingrese Salario Mensual: ");
    double SalarioMTrabajador = entrada.nextDouble();
    trabajador.setSalarioMensual(SalarioMTrabajador);

    trabajador.calcularSalarioD(SalarioMTrabajador);

    System.out.println();

    System.out.printf("El salario diario de %s es: $%.2f%n ", trabajador.getNombre(), trabajador.getSalarioDiario());

  }

}