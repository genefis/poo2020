package taller_repeticion;

import java.util.Scanner;

public class Ejecuta_multplicacion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE EL FACTOR 1");
        Double dividendo = entrada.nextDouble();
        System.out.println("INGRESE EL FACTOR 2");
        Double divisor =entrada.nextDouble();
        MultiplicacionRestas multiplicacion=new MultiplicacionRestas(dividendo,divisor);
        System.out.println(+multiplicacion.getFactor1()+" x "+multiplicacion.getFactor2()+
                " es: "+multiplicacion.producto());
    }
}

