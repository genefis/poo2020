package taller1;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private int num_alumnos;
    private String tipo;
    private String carreras;
    private String oficinas;

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public int getNum_alumnos() {
        return num_alumnos;
    }

    /**
     *
     * @return
     */
    public String getCarreras() {
        return carreras;
    }

    /**
     *
     * @return
     */
    public String getOficinas() {
        return oficinas;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @return
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param carreras
     */
    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    /**
     *
     * @param num_alumnos
     */
    public void setNum_alumnos(int num_alumnos) {
        this.num_alumnos = num_alumnos;
    }

    /**
     *
     * @param oficinas
     */
    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @param ubicacion
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
