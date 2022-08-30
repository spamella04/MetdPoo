/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Synthia Pamella
 */
public class Trabajador {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private double salarioMensual;
    private double salarioDiario;

    //metodo para calcular el salario diario del trabajador
    public void calcularSalarioD(double salarioMensual){

                salarioDiario = salarioMensual / 30;
              
                
           }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
    
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    public double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public Trabajador() {
    }

    public Trabajador(int codigo, String nombre, String apellido, double salarioMensual, double salarioDiario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        this.salarioDiario = salarioDiario;
    }
    
   
}
