package taller1;

public class Vehiculo {
    private String marca;
    private String asientos;
    private String color;
    private String modelo;
    private String placas;
    private String tipo_modelo;

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
    public String getColor() {
        return color;
    }

    /**
     *
     * @return
     */
    public String getAsientos() {
        return asientos;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @return
     */
    public String getPlacas() {
        return placas;
    }

    /**
     *
     * @return
     */
    public String getTipo_modelo() {
        return tipo_modelo;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @param asientos
     */
    public void setAsientos(String asientos) {
        this.asientos = asientos;
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
     * @param placas
     */
    public void setPlacas(String placas) {
        this.placas = placas;
    }

    /**
     *
     * @param tipo_modelo
     */
    public void setTipo_modelo(String tipo_modelo) {
        this.tipo_modelo = tipo_modelo;
    }
}
