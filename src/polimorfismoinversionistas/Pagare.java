package polimorfismoinversionistas;

public class Pagare extends Inversionista {
    private double intGeP;
    // Metodo constructor creado con variables heredadas
    public Pagare(String numCu, int numCl, String nom, double capInvert, int plazo){
        this.setNumCuenta(numCu);
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;

    }

    /**
     * metodo para calcular los interes de uin pagare
     */
    public void CalcularIntPa(){
        if (capInvert >= 1000 && capInvert <= 2400){
            tazaInt = 0.05;
            intGeP = (capInvert * tazaInt) * plazoInv;
        }else if (capInvert >2800 ){
            tazaInt = 0.08;
            intGeP = (capInvert * tazaInt) * plazoInv;

        }
    }

    /**
     *  metodo que obtiene el valor de la variable
     * @return intGeP
     */
    public double getIntGeP() {
        return intGeP;
    }

    /**
     *  metodo que ayuda actualizar  el valor de la variable
     * @param intGeP
     */
    public void setIntGeP(double intGeP) {
        this.intGeP = intGeP;
    }
}
