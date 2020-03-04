package taller1;

public class Computadora {
    private String tipoComputadora;
    private String sistemaOperativo;
    private String almacenamiento;
    private String ram;

    /**
     *
     * @return
     */
    public String getTipoComputadora() {
        return tipoComputadora;
    }

    /**
     *
     * @return
     */
    public String getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     *
     * @return
     */
    public String getRam() {
        return ram;
    }

    /**
     *
     * @return
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     *
     * @param almacenamiento
     */
    public void setAlmacenamiento(String almacenamiento) {

    }

    /**
     *
     * @param ram
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     *
     * @param sistemaOperativo
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     *
     * @param tipoComputadora
     */
    public void setTipoComputadora(String tipoComputadora) {
        this.tipoComputadora = tipoComputadora;
    }

}
