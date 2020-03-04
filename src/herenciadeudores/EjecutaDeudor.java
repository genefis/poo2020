package herenciadeudores;

import java.util.Scanner;

public class EjecutaDeudor {
    public static void main(String[] args) {
        // Declaraciond e variables
        int opcion = 0;
        int numCli, plazoInv;
        double capPrest;
        String nombre, numCu;
        Scanner entrada = new Scanner(System.in);
        String cadena2 = "" ;

        System.out.println("CALCULO DE DE INTERESES ANUALES");
        // Cadena que imprime el encabezado del reporte
        String cadena = "REPORTE DE INVERSIONES\nNo.CLIENTE\t\t\tNOMBRE\t\t\t\tNo.CUENTA\t\t\t\tINTERES POR PAGAR\n";
        cadena += "-----------------------------------------------------------------------------------------";
        // Ciclo que controla la repeticion del programa
        while(opcion <= 4){
            // menu de opciones
            System.out.println("Digite un numero deacuerdo al tipo de INVERSIONISTA:\n" +
                    "|1. Prestamo de Auto|\n"+ "|2. Prestamo Hipotecario  \t |\n" + "|3.prestamo Personal\t |");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    // Inreso de datos del cliente, nombre, nuemro de cuenta, numero Cliente , capital prestado y el plazo
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = entrada.nextLine();

                    System.out.println("Ingrese el Numero de Cuenta: ");
                    numCu = entrada.nextLine();

                    System.out.println("Ingrese el numero de Cliente: ");
                    numCli = entrada.nextInt();

                    System.out.println("Digite la cantidad del Capital prestado: ");
                    capPrest = entrada.nextDouble();

                    System.out.println("Ingrese el plazo de la inversion : ");
                    plazoInv = entrada.nextInt();

                    // Creacion del objeto metodo constructor
                   Auto Pa = new Auto(numCu,numCli,nombre,capPrest,plazoInv);
                    // calculo del interes
                    Pa.calcularIntAuto();
                    // Creacion del cadena que almacena datos del reporte final que se imprime
                    cadena2 = String.format("%-22s%-22s%-22s%-22f\n",numCli,nombre, numCu,Pa.getIntGeAu());
                    System.out.println(Pa.getIntGeAu());
                    break;
                case 2:
                    entrada.nextLine();
                    // Inreso de datos del cliente, nombre, nuemro de cuenta, numero Cliente , capital prestado y el plazo
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = entrada.nextLine();

                    System.out.println("Ingrese el Numero de Cuenta: ");
                    numCu = entrada.nextLine();

                    System.out.println("Ingrese el numero de Cliente: ");
                    numCli = entrada.nextInt();

                    System.out.println("Digite la cantidad del valor del pagare: ");
                    capPrest = entrada.nextDouble();

                    System.out.println("Ingrese el plazo en meses del vencimiento del pagare: ");
                    plazoInv = entrada.nextInt();

                    // Creacion del objeto
                    Hipotecario Ph = new Hipotecario(numCu,numCli,nombre,capPrest,plazoInv);
                    // calculo del interes
                    Ph.calcularIntHi();
                    // Creacion del cadena que almacena datos del reporte final que se imprime
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",cadena2,numCli,nombre, numCu,Ph.getIntGeHi());
                    System.out.println(Ph.getIntGeHi());

                    break;
                case 3:
                    entrada.nextLine();
                    // Inreso de datos del cliente, nombre, nuemro de cuenta, numero Cliente , capital prestado y el plazo
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = entrada.nextLine();

                    System.out.println("Ingrese el Numero de Cuenta: ");
                    numCu = entrada.nextLine();

                    System.out.println("Ingrese el numero de Cliente: ");
                    numCli = entrada.nextInt();

                    System.out.println("Digite la cantidad del capital prestado : ");
                    capPrest = entrada.nextDouble();

                    System.out.println("Ingrese el plazo de la inversion : ");
                    plazoInv = entrada.nextInt();

                    // Creacion del objeto metodo constructor
                    Personal Pp = new Personal(numCu,numCli,nombre,capPrest,plazoInv);
                    // calculo del interes
                    Pp.calcularIntPe();
                    // Creacion del cadena que almacena datos del reporte final que se imprime
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",cadena2,numCli,nombre, numCu,Pp.getIntGePe());

                    break;
            }
            entrada.nextLine();
            System.out.println("Desea Calcular el interes de algun otro deudor Si/No");
            String opcion2 = entrada.nextLine();
            System.out.println(opcion2);
            if (opcion2.equals("NO")){
                System.out.println(cadena+"\n"+ cadena2 );
                opcion = 5;
            }else{
                System.out.println();
                opcion = 4;

            }

        }

    }
}
