package disenio_seleccion;

import java.util.Scanner;

public class Ejecuta_sueldo {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);

        System.out.println("INGRESE EL NOMBRE");
        String nombre = ent.nextLine();
        System.out.println("INGRESE EL NUMERO DE HORAS");
        int  horas =ent.nextInt();
        System.out.println("INGRESE LA CUOTA X HORA");
        Double cuota =ent.nextDouble();
        Sueldo sueldo = new Sueldo(cuota,horas,nombre);
        System.out.println(sueldo.calcular_sueldo());
    }
}
