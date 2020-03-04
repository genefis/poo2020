package herenciainversionistas;

public class CuentaAhorro extends Inversionista{
    private double intGeA;

    /**
     * Creacion del Metodo construtor
     * @param numCu
     * @param numCl
     * @param nom
     * @param capInvert
     * @param plazo
     */
    public CuentaAhorro(String  numCu, int numCl, String nom, double capInvert, int plazo){
        this.setNumCuenta(numCu);
        // Variables heredadas
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;


    }

    /**
     * Metodo para clcular el interes generado
     */
    public void calcularIntA() {
        if (capInvert >= 700 && capInvert <= 1000){
            tazaInt = 0.04;
            intGeA = (capInvert * tazaInt) * plazoInv;

        }else if (capInvert >=2000 && capInvert <= 4000){
            tazaInt = 0.10;
            intGeA = (capInvert * tazaInt) * plazoInv;
        }else if(capInvert > 4500) {
            tazaInt = 0.15;
            intGeA = (capInvert * tazaInt) * plazoInv;
        }
    }

    /**
     * Metodo para obtener el valor de la variable IntGenA
     * @return intGeA
     */
    public double getIntGeA() {
        return intGeA;
    }

    /**
     * metodo para establecer el valor de la variable intGA
     * @param intGeA
     */
    public void setIntGeA(double intGeA) {
        this.intGeA = intGeA;
    }
}
