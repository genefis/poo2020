package herenciadeudores;

public class Hipotecario  extends Deudor {
    private double intGeHi;
    private double tazaA;

    /**
     * Metodo constructor creao con las variables hredadas
     * @param numCu
     * @param numCl
     * @param nom
     * @param capPrest
     * @param plazo
     */
    public Hipotecario(String numCu, int numCl, String nom, double capPrest, int plazo){
        this.setNumCuentaD(numCu);
        this.numClienteD = numCl;
        this.nomD = nom;
        this.capPrest = capPrest;
        this.plazoInvD = plazo;


    }

    /**
     * Metodo que calcula el interes
     */
    public void calcularIntHi() {
        tazaA = 0.20;
        intGeHi = capPrest * (tazaA * plazoInvD);

    }

    /**
     * Metodo que obtiene el valor de la variable
     * @return
     */
    public double getIntGeHi() {
        return intGeHi;
    }

    /**
     * Metodo que establece el valor de la variable
     * @param intGeHi
     */
    public void setIntGeHi(double intGeHi) {
        this.intGeHi = intGeHi;
    }

    public double getTazaA() {
        return tazaA;
    }

    /**
     * metodo que actualiza el valor d la variable
     * @param tazaA
     */
    public void setTazaA(double tazaA) {
        this.tazaA = tazaA;
    }
}
