package disenio_repeticion;

import java.util.Scanner;

public class Ejecutar_sueldofor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cadena;
        String opcion;
        String nombre;
        boolean nuevoEmpleado = true;
        int n =0;
        System.out.println("INGRESE LA CUOTA POR HORA");
        Double cuota= entrada.nextDouble();
        entrada.nextLine();
        System.out.println("CUANTOS EMPLEADOS DESEA INGRESAR");
        n=entrada.nextInt();
        entrada.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("INGRESAR EL NOMBRE");
            nombre = entrada.nextLine();
            System.out.println("INGRESAR EL NUMERO DE HORAS TRANAJADAS");
            int horas = entrada.nextInt();
            Sueldo sueldo=new Sueldo(cuota,horas,nombre);
            entrada.nextLine();
            System.out.println(sueldo.getnombre());
            System.out.println(sueldo.calcular_sueldo());
            System.out.println("DESEA INGRESAR OTRO EMPLEADO");
            opcion=entrada.nextLine();
            if(opcion.equals("no")){
                i=n;
            }

        }
    }
}
