package disenio_repeticion;
import java.util.Scanner;
import java.util.Date;
public class Ejecuta_sueldoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cadena;
        String opcion;
        String nombre;
        boolean nuevoEmpleado = true;
        System.out.println("INGRESE LA CUOTA POR HORA");
        Double cuota= entrada.nextDouble();
        entrada.nextLine();
        do {
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
                nuevoEmpleado=false;
            }
        }while(nuevoEmpleado==true);

        }

    }

