package Deber_seleccion;

import java.util.Scanner;

public class EjecutaN_mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE 4 NUMEROS");
        double []numero=new double[4];
        for (int i =0;i<4;i++){
            System.out.println("Escriba un numero");
            numero[i]=entrada.nextDouble();
        }
        N_mayor n_mayor = new N_mayor(numero[0],numero[1],numero[2],numero[3]);
        System.out.println("El numero mayor es: "+n_mayor.calcular_mayor());


    }
}
