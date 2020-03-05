package polimorfismoinversionistas;

public class Inversionista {
    private String numCuenta;
    protected int numCliente;
    protected String nom;
    protected double capInvert;
    protected double tazaInt;
    protected int plazoInv;
/*
    public void Datos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de Cliente: ");
        this.numCliente = entrada.nextInt();
        System.out.println("Ingrese el nombre del Cliente: ");
        this.nom = entrada.nextLine();
        System.out.println("Ingrese el Numero de Cuenta: ");
        this.numCuenta = entrada.nextInt();
        System.out.println("Digite la cantidad del valor invertido: ");
        this.capInvert = entrada.nextDouble();
        System.out.println("Ingrese el plazo de la inversion : ");
        this.capInvert = entrada.nextInt();
    }
*/

    /**
     * Metodo que obtiene el valor de la variable NumCliente
     * @return numCliente
     */
    public int getNumCliente() {
        return numCliente;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param numCliente
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * metodo que obtiene el valor de la variable
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *  Metodo que actualiza el valor de la variable
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *  metodo que obtiene el valor de la variable
     * @return capinvert
     */
    public double getCapInvert() {
        return capInvert;
    }

    /**
     *  Metodo que actualiza el valor de la variable
     * @param capInvert
     */
    public void setCapInvert(double capInvert) {
        this.capInvert = capInvert;
    }

    /**
     *  metodo que obtiene el valor de la variable
     * @return tazaInt
     */
    public double getTazaInt() {
        return tazaInt;
    }

    /**
     * Metodo que actualiza el valor de la variable
     * @param tazaInt
     */
    public void setTazaInt(double tazaInt) {
        this.tazaInt = tazaInt;
    }

    /**
     *  metodo que obtiene el valor de la variable
     * @return plazoInv
     */
    public int getPlazoInv() {
        return plazoInv;
    }

    /**
     *  Metodo que actualiza el valor de la variable
     * @param plazoInv
     */
    public void setPlazoInv(int plazoInv) {
        this.plazoInv = plazoInv;
    }

    /**
     *  metodo que obtiene el valor de la variable
     * @return numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     *  Metodo que actualiza el valor de la variable
     * @param numCuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
