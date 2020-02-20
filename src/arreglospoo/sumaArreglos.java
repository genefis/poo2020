package arreglospoo;

public class sumaArreglos {
    private int [] Arreglo1 = new int[10];
    private int [] Arreglo2 = new int[10];
    private int [] suma = new int[10];

    public sumaArreglos(int []Arreglo1,int []Arreglo2){
        this.Arreglo1 =Arreglo1;
        this.Arreglo2 =Arreglo2;
    }

    /**
     * Sirve para acumular en un arrlego la suma de dos arreglos
     * @return
     */
    public int[] calculo (){
        for(int i=0;i<10;i++) {
           suma[i]=Arreglo1[i]+Arreglo2[i];
        }
        return suma;
    }

    public int[] getArreglo1() {
        return Arreglo1;
    }

    /**
     *
     * @return
     */

    public int[] getArreglo2() {
        return Arreglo2;
    }

    /**
     * Este arrgelo sirve para presentar los tres arrgelos trabajados
     */
    public void  presentar(){
        System.out.print("ARREGLO 1\tARREGLO2\tRESULTADO");
        System.out.println();
        for(int i=0;i<10;i++) {

            System.out.println(Arreglo1[i] + "\t\t\t" + Arreglo2[i] + "\t\t\t" + suma[i]);
        }
    }
}
