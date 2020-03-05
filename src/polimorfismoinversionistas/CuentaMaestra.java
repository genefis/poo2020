package polimorfismoinversionistas;

public class CuentaMaestra extends Inversionista {
      private double tazaInt;
      public CuentaMaestra(String  numCu, int numCl, String nom, double capInvert, int plazo){
          this.numCuenta=numCu;
        this.numCliente = numCl;
        this.nom = nom;
        this.capInvert = capInvert;
        this.plazoInv = plazo;

    }

    @Override
    public void interesGanado() {
        if (capInvert >= 10000 && capInvert <= 10500) {
            tazaInt = 0.15;
            interesganado = (capInvert * tazaInt) * plazoInv;

        }else if(capInvert >=10600 && capInvert <= 20000){
            tazaInt = 0.20;
            interesganado= (capInvert * tazaInt) * plazoInv;
        }else {
            if (capInvert > 30000) {
                tazaInt = 0.25;
                interesganado = (capInvert * tazaInt) * plazoInv;
            }


        }
      }
}