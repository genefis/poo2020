package polimorfismoautomotriz;
public class Vendedores extends RegistroFC {
    private double precioAuto;
    private int nAutos;
    private double valorventa;
    private double salariom;
    public Vendedores(String nombre, String dep, String pues,double salariom,double precioAuto,int nAutos) {
              this.salariom=salariom;
        this.salariom=salariom;
        this.nAutos=nAutos;

    }
    @Override
    public void Calcularquincenal() {
        for (int i = 0; i < nAutos; i++) {
            sueldo = salariom+(precioAuto * 0.02);
        }

    }
    /**
     * metodo que obtiene el valor de la vairbale precio
     * @return precioAuto
     */
    public double getPrecioAuto() {
        return precioAuto;
    }
    /**
     * Metodo que obtiene el valor de la variable
     * @return numAutos
     */
    public int getNumAutos() {
        return nAutos;
    }
}