package Disenopoo;
import java.util.Scanner;

public class Ejecuta_cerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Precio de la cerveza:");
        double precio = teclado.nextDouble();
        System.out.println("Unidades vendidas:");
        int  unidades = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Nombre de la cerveza:");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de cerveza:");
        String tipo = teclado.nextLine();
        Cerveza cerveza = new Cerveza(precio,unidades,nombre,tipo);
        cerveza.presentar();
    }
}
