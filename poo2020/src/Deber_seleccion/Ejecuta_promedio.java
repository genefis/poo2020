package Deber_seleccion;

import java.util.Scanner;

public class Ejecuta_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("INGRESE EL NOMBRE\t");
        String nombre = entrada.nextLine();
        Double notas[] = new Double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("INGRESE LA NOTA DEL BIMESTRE" + (i+1)+"\t");
            notas[i] = entrada.nextDouble();
        }
        Promedio promedio = new Promedio(nombre, notas[0], notas[1], notas[2], notas[3]);
        System.out.println("El promedio de sus calificaciones es: " + promedio.media() +"\t"+ promedio.validacion());

    }
}
