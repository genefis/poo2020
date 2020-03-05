package polimorfismoinversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        // Declaracion de variables
        int opcion = 0;
        int numCli, plazoInv;
        double capInvert;
        String nombre, numCu;
        Scanner entrada = new Scanner(System.in);
        String cadena2 = "" ;

        System.out.println("CALCULO DE DE INTERESES ANUALES");

        String cadena = "REPORTE DE INVERSIONES\nNo.CLIENTE\t\t\t NOMBRE\t\t\t\t No.CUENTA\t\t\t\tINTERES POR PAGAR\n";
        cadena += "-----------------------------------------------------------------------------------------";
               while(opcion <= 4){
            // Aclaracion de las opciones disponibles
            System.out.println("Digite un numero deacuerdo al tipo de INVERSIONISTA:\n" +
                    "|1. Cuenta Ahorro|\n"+ "|2. Pagare \t |\n" + "|3.Cuenta Maestra\t |\n\n"+
                    " Si elige la opcion de Cuenta Ahorro, tome en cuenta que el valor minimo " +
                    "para invertir es de 700\n"+
                    " Si elige la opcion de Pagare, tome en cuenta que el valor minimo " +
                    "para invertir es de 1000\n"+
                    " Si elige la opcion de Cuenta Maestra, tome en cuenta que el valor minimo " +
                    "para invertir es de 10000\n Ingrese la opcion porfavor: \n");
            opcion = entrada.nextInt();
            System.out.println("Ingrese el nombre del Cliente: ");
            nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese el Numero de Cuenta: ");
            numCu = entrada.nextLine();
            System.out.println("Ingrese el numero de Cliente: ");
            numCli = entrada.nextInt();

            switch (opcion){
                case 1:
                    entrada.nextLine();
                    System.out.println("Digite la cantidad del valor invertido: ");
                    capInvert = entrada.nextDouble();

                    System.out.println("Ingrese el plazo de la inversion : ");
                    plazoInv = entrada.nextInt();
                    // Creacion del objeto constructor
                    CuentaAhorro ahorro=new CuentaAhorro(numCu,numCli,nombre,capInvert,plazoInv);
                    // Llamado al metodo que calcula el cueldo
                    ahorro.interesGanado();
                    System.out.println(ahorro.getInteresganado());
                    // Creacion del cadena que almacena datos del reporte final que se imprime
                    cadena2 = String.format("%-22s%-22s%-22s%-22f\n",numCli,nombre, numCu,ahorro.interesganado);

                    break;
                case 2:
                    entrada.nextLine();
                                        System.out.println("Digite la cantidad del valor del pagare: ");
                    capInvert = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de vencimiento del pagare: ");
                    plazoInv = entrada.nextInt();
                    // Creacion del objeto
                    Pagare pagare= new Pagare(numCu,numCli,nombre,capInvert,plazoInv);
                    pagare.interesGanado();
                    System.out.println(pagare.getInteresganado());
                    // Creacion del cadena que almacena datos del reporte final que se imprime
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",cadena2,numCli,nombre, numCu,pagare.getInteresganado());

                    break;
                case 3:
                    System.out.println("Digite la cantidad del valor invertido: ");
                    capInvert = entrada.nextDouble();
                    // Se debe tomar en cuenta las siguientes condiciones que son escenciales para la Cuenta Maestra
                    if(capInvert <10001){
                        System.out.println("El tipo de cuenta que ha escogido es Cuenta Maestra," +
                                " por lo tanto su inversion debe superar los 10000\nIntente nuevamente porfavor");
                        break;

                    }
                    System.out.println("Ingrese el plazo de la inversion : ");
                    plazoInv = entrada.nextInt();
                    // Creacion del objeto
                    CuentaMaestra Cuenta = new CuentaMaestra(numCu,numCli,nombre,capInvert,plazoInv);
                    Cuenta.interesGanado();


                    // Creacion del cadena que almacena datos del reporte final que se imprime
                    cadena2 = String.format("%-22s%-22s%-22s%-22s%-22f\n",cadena2,numCli,nombre, numCu,Cuenta.getInteresganado());

                    break;
            }
            entrada.nextLine();
            System.out.println("Desea Calcular de algun otro inversor Ingrese Si/No");
            String opcion2 = entrada.nextLine().toUpperCase();
            System.out.println(opcion2);
            if (opcion2.equals("NO")){
                // Impresion de la cadena almacenada con el reporte
                System.out.println(cadena+"\n"+ cadena2 );
                opcion = 5;
            }else{
                System.out.println();
                opcion = 4;

            }

        }

    }
}
