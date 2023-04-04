package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen,String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    //    Metodos
    public int cantidadLetras() {
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String toString() {
        String conca ="";
        for(int i=0;i<letras.length;i++){
            if(i<letras.length-1) {
                conca += letras[i] + ", ";
            }else{
                conca +=letras[i];
            }
        }
        return conca;
    }

    //    Gets
        public String[] getLetras(){
            return  this.letras;
        }

        public String getInterpretacion(){
            return  this.interpretacion;
        }
//    Sets

        public void  setInterpretacion(String interpretacion){
            this.interpretacion = interpretacion;
        }




}