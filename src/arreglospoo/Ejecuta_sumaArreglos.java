package arreglospoo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejecuta_sumaArreglos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int [] Arreglo1=new int[10];
        int [] Arreglo2=new int[10];
        System.out.println("ARREGLO 1");
        for(int i=0;i<10;i++) {
            System.out.print("VALOR"+(i+1));
            Arreglo1[i]=entrada.nextInt();
        }
        System.out.println("ARREGLO 2");
        for(int i=0;i<10;i++) {
            System.out.print("VALOR"+(i+1));
            Arreglo2[i]=entrada.nextInt();
        }
        sumaArreglos suma = new sumaArreglos(Arreglo1,Arreglo2);
        suma.calculo();
        suma.presentar();

    }


}
