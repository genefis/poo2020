package polimorfismoautomotriz;
import herencia.Administrativo;

import java.util.Scanner;
public class EjecutaAutomotriz {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
        boolean ban = true;
        String nombre,departamento,puesto;
        System.out.println("CALCULO DEL SALARIO");
        System.out.println("Ingrese el nombre");
        nombre=entrada.nextLine();
        System.out.println("que tipo de empleado desea ingresar");
        departamento = entrada.nextLine();
        while(ban=true) {
            switch (departamento){
                case "Administrativo":
                    System.out.println("Ingrese el saldo mensual");
                    double SueldoMensual=entrada.nextDouble();
                    System.out.println("Ingrese el puesto");
                    puesto=entrada.nextLine();
                    Administrativos administrativo = new Administrativos(nombre,SueldoMensual,departamento,puesto);
                    System.out.println("");
                    administrativo.Calcularquincenal();
                    System.out.println(administrativo.getSueldoquincena());
                    break;
                case "Mecanico":
                    System.out.println("Ingrese el numero de trabajos");
                    int numtrabajos =entrada.nextInt();
                    System.out.println("Ingrese el puesto");
                    puesto=entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Ingrese la cuota por trabajo");
                    double cuota =entrada.nextDouble();
                    Mecanicos mecanicos = new Mecanicos(nombre,departamento,puesto,numtrabajos,cuota);
                    mecanicos.Calcularquincenal();
                    System.out.println(mecanicos.getSueldoquincena());
                    break;
                case"Vendedores":
                    System.out.println("Ingrese el puesto");
                    puesto=entrada.nextLine();
                    System.out.println("Ingrese el salario minimo");
                    double salario = entrada.nextDouble();
                    System.out.println("Ingrese el precio por auto");
                    double precioauto=entrada.nextDouble();
                    System.out.println("Ingrese el numero de autos vendidos");
                    int nAutos=entrada.nextInt();
                    Vendedores vendedores = new Vendedores(nombre,departamento,puesto,salario,precioauto, nAutos);
                    vendedores.Calcularquincenal();
                    System.out.println(vendedores.getSueldoquincena());
                    break;
                default:
                    ban =false;
                    break;
            }

        }
    }
}

