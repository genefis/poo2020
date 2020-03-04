package herenciaautomotriz;

public class RegistroFC {
    protected String nombre;
    protected String departamento;
    protected String puesto;

    /**
     * Metodo que obgtiene el valor dela variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el valor de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene le valor de la varibale departamento
     * @return departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * metodo que establece el valord e la variable departamento
     * @param departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Metodo que obtiene el valor de la variable puesto
     * @return puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Metodo que actualiza el vlaor de la variabe puesto
     * @param puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
