package taller1;

public class Docente {
    private String nombre;
    private String edad;
    private String nivel_academico;
    private String genero;
    private String n_cedula;

    /**
     *
     * @return
     */
    public String getEdad() {
        return edad;
    }

    /**
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @return
     */
    public String getN_cedula() {
        return n_cedula;
    }

    /**
     *
     * @return
     */
    public String getNivel_academico() {
        return nivel_academico;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(String edad) {
        this.edad = edad;

    }

    /**
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @param n_cedula
     */
    public void setN_cedula(String n_cedula) {
        this.n_cedula = n_cedula;
    }

    /**
     *
     * @param nivel_academico
     */
    public void setNivel_academico(String nivel_academico) {
        this.nivel_academico = nivel_academico;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}