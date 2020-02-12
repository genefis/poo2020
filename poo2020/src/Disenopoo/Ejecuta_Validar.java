package Disenopoo;

import java.util.Scanner;

public class Ejecuta_Validar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("NOMBRE DEL ALUMNO ");
        String nombre = entrada.nextLine();
        System.out.print("MATERIA ");
        String materia = entrada.nextLine();
        System.out.print("BIMESTRE 1 ");
        Double B1=entrada.nextDouble();
        System.out.print("BIMESTRE 2");
        Double B2=entrada.nextDouble();
        Validar validar= new Validar(nombre,materia,B1,B2);
        validar.presentar_estudiante();
    }
}
