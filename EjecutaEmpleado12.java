package polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        double hora,cuota;
        //obtener el sueldo quincenal de un eplado por ahota
        EmpleadoxPorHora2 empHoras = new EmpleadoxPorHora2() ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo sueldo quiencenal empleadospor ahora");
        System.out.println("Ingrese horas trabajadas");
        empHoras.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("Ingrese la cuota por hora");
        empHoras.setCuotaPorHora(teclado.nextDouble());
        empHoras.CalSueldoQuin();
        System.out.println("El sueldo quincencal es"+empHoras.getSueldo());

        EmpleadoAsalariado2 empAsa = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal de emplado asalariado");
        System.out.println("Ingrese saldo mensual");
        empAsa.CalSueldoQuin();
        System.out.println("Sueldo quiencenal es:"+empAsa.getSueldo());


    }
}
