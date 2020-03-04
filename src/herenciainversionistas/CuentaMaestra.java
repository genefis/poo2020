package herenciainversionistas;

public class CuentaMaestra extends Inversionista {
    private double  intGeMa;

    /**
     * Creacion del metodo constructor con las variables erredadas de la superclase
     * @param numCu
     * @param numCl
     * @param nom
     * @param capInvert
     * @param plazo
     */
    public CuentaMaestra(String  numCu, int numCl, String nom, double capInvert, int plazo){
        this.setNumCuenta(numCu);
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;

    }

    /***
     * Merodo que calcula el interes tomando en cuenta el monto de inversion
     */
    public void calcularIntCm() {
        if (capInvert >= 10000 && capInvert <= 10500) {
            tazaInt = 0.15;
            intGeMa = (capInvert * tazaInt) * plazoInv;

        }else if(capInvert >=10600 && capInvert <= 20000){
            tazaInt = 0.20;
            intGeMa = (capInvert * tazaInt) * plazoInv;
        }else{
            if(capInvert > 30000){
                tazaInt = 0.25;
                intGeMa = (capInvert * tazaInt) * plazoInv;

            }

        }
    }

    /**
     * MEtodo que obtiene el valor de la vriable intGeMa
     * @return intGeMa
     */
    public double getIntGeMa() {
        return intGeMa;
    }

    /**
     * metodo que establece el valor de la variable intGeMa
     * @param intGeMa
     */
    public void setIntGeMa(double intGeMa) {
        this.intGeMa = intGeMa;
    }
}
