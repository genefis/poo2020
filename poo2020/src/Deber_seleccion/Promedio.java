package Deber_seleccion;
public class Promedio {
 private String nombre;
 private Double calificacion1;
 private Double calificacion2;
 private Double calificacion3;
 private Double calificacion4;
 private Double media;
 public Promedio (String nombre,Double calificacion1,Double calificacion2,Double calificaion3,Double calificaion4) {
     this.calificacion1 = calificacion1;
     this.calificacion2 = calificacion2;
     this.calificacion3 = calificaion3;
     this.calificacion4 = calificaion4;
 }
 public double  media() {
     media = (calificacion1+calificacion2+calificacion3+calificacion4)/4;
   return media;

 }
 public String validacion(){
     String mensaje="";
     if(media>=60) {
       mensaje ="APROBADO";
     }else{
         mensaje ="REPROBADO";
     }
     return mensaje;
 }


}
