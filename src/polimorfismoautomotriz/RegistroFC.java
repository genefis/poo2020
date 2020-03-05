package polimorfismoautomotriz;

abstract class RegistroFC {
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected  double sueldo;
    /**\
     * Son 3 metodos abtractos que sirven para ser usados en otras claes para recibir los datod de nombre departamento
     * y puesto
     */

    public abstract void Calcularquincenal() ;
    public String getNombre() {
        return nombre;
    }
    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }
    public double getSueldoquincena(){
        return sueldo;
    }




}
