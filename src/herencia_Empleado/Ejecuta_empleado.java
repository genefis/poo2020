package herencia_Empleado;
import java.util.Scanner;
public class Ejecuta_empleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("INGRESE DATOS DEL EMPLEADO");
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el cargo");
        String cargo = entrada.nextLine();
        System.out.println("Ingrese la dependencia");
        String dependencia = entrada.nextLine();
        System.out.println("A ue tipo de empleado pertenece:\n1.Por hora\n2.Asalariado");
        int opcion = entrada.nextInt();
       switch (opcion){
           case 1:
               System.out.println("Imgrese el valor x hora");
               Double valor = entrada.nextDouble();
               System.out.println("Ingrese el numero de horas trabajadas");
               int horas =entrada.nextInt();
               Empleado_hora hora =new Empleado_hora(horas,valor,nombre,cargo,dependencia);
               hora.getNombre();
               hora.getCargo();
               hora.getDependencia();
               hora.getHora();
               hora.getValorhora();

               break;
           case 2:
               System.out.println("Imgrse el valor mensual");
               Double mensual=entrada.nextDouble();
               Asalariado asalariado =new Asalariado(mensual,nombre,cargo,dependencia);
               asalariado.getNombre();
               asalariado.getCargo();
               asalariado.getDependencia();
               asalariado.getValor_mensual();
               break;

        }


    }

}
