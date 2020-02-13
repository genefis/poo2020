package Deber_seleccion;
import java.util.Scanner;

public class Ejecuta_sueldotriple {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        System.out.println("INGRESE EL NOMBRE");
        String nombre = ent.nextLine();
        System.out.println("INGRESE EL NUMERO DE HORAS");
        int  horas =ent.nextInt();
        System.out.println("INGRESE LA CUOTA X HORA");
        Double cuota =ent.nextDouble();
        Sueldo_triple  sueldotriple = new Sueldo_triple(cuota,horas,nombre);
        System.out.println("El sueldo correspondiente es "+sueldotriple.calcular_sueldo());
    }
}
