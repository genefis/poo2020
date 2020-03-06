package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        List<String> Nombres= new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESO DE DATOS");
        boolean ban= true;
        do{
            System.out.println("MENU\n:1.AGREGAR NOMBRE \n2.PRESENTAR LISTA DE NOMBRES\n3.SALIR");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese un nombre");
                    Nombres.add(entrada.nextLine());

                break;
                case 2:
                    System.out.println("NOMBRES");
                    for (int cont = 0; cont < Nombres.size(); cont++) {
                        System.out.println((cont+1)+"\t"+Nombres.get(cont));
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
