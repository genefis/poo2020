package taller_repeticion;

public class Division {
    // Genesis Gonzalez, Ricardo Freire,Alexander Loja
    private int cociente;
    private double dividendo;
    private double divisor;
    private double residuo;
    private double divideTemp;
    private double divisoTemp;

    public Division(double dividendo, double divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
        divideTemp = dividendo;
        divisoTemp = divisor;
    }

    /**
     * Este metodo sirve para calcular la division de dos numeros con restas repetitivas
     */
    public void calcularSolucion() {
        residuo = 1;
        while (residuo > 0) {
            cociente = cociente + 1;
            residuo = dividendo - divisor;
            dividendo = residuo;
        }
    }

    public void obtenerCociente() {
        System.out.println(divideTemp + " / " + divisoTemp + ": " + cociente);
    }

}
