package taller1;

public class Celular {
    private String marca;
    private String modelo;
    private String Ram;
    private String almacenamiento;

    private String sistemaOperativo;

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


    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    public String getRam() {
        return Ram;
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
        this.almacenamiento = almacenamiento;
    }

    /**
     *
     * @param color
     */

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @param Ram
     */
    public void setMumero(String Ram) {
        this.Ram = Ram;
    }

    /**
     *
     * @param sistemaOperativo
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
