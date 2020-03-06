package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        boolean ban= true;
        do{
            System.out.println("Digite 1 para almacenar nuevo:");
            System.out.println("Digite 2 para presentar reporte");
            System.out.println("Digite 3 para salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.print("Ingrese placa\t");
                    vehiculo.setPlaca(entrada.nextLine());
                    System.out.print("Ingrese Marca\t");
                    vehiculo.setMarca(entrada.nextLine());
                    System.out.print("Ingrese anio\t");
                    vehiculo.setAnio(entrada.nextLine());
                    System.out.print("Ingrese modelo\t");
                    vehiculo.setModelo(entrada.nextLine());
                    System.out.print("Ingrese color\t");
                    vehiculo.setColor(entrada.nextLine());
                    System.out.print("Ingrese cilindraje\t");
                    vehiculo.setCilindraje(entrada.nextInt());
                    vehiculos.add(vehiculo);
                    break;

                case 2:
                    System.out.println("VEHICULO");
                    System.out.println("PLACA\t\tMARCA\t\tCILINDRAJE");
                    for (Vehiculo v: vehiculos){
                        System.out.println(v.getPlaca()+"\t\t"+v.getMarca()+"\t\t"+v.getCilindraje());
                    }
                    break;
                case 3:
                    ban=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(ban==true);
    }
}
