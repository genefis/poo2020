
package Deber_seleccion;

public class Sueldo_triple {
    private Double cuotaxhora;
    private int nhoras;
    private String nombre;
    private Double sueldo;
    public Sueldo_triple (Double cuotaxhora,int nhoras,String nombre){
        this.cuotaxhora = cuotaxhora;
        this.nhoras = nhoras;
        this.nombre =nombre;
    }
    public Double getCuotaxhora() {
        return cuotaxhora;
    }
    public int getNhoras() {
        return nhoras;
    }

    public String getnombre() {
        return nombre;
    }

    /**
     * Este metodo sirve para calcular el sueldo y validar si es mayor a 40 horas o menor o igual a 40 horas
     * @return
     */
    public  Double calcular_sueldo(){
        if (nhoras<=40 ) {
            sueldo=nhoras * cuotaxhora;
        } else if(sueldo <= 50){
            sueldo = (40*cuotaxhora)+((nhoras-40)*(cuotaxhora*2));
        }else
            sueldo =(40*cuotaxhora)+(10*cuotaxhora*2)+((nhoras-50)*(cuotaxhora*3));
        return sueldo;
    }
}
