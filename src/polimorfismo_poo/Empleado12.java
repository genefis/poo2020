package polimorfismo_poo;

abstract class Empleado12 {
    // Definicion de atributos protegidos para que se pueda
    protected String Nombre;
    protected  String departamento;
    protected String puesto;
    protected double sueldo;

    /**
     * Metodo abtracto que sera implementado dentro de las clases hijas
     */
    public abstract void CalSueldoQuin();


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
