package comunicacion;

import javax.management.loading.PrivateClassLoader;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas,String ensenaza,String interpretacion){
        super(origen,titulo,autor,paginas);
        this.interpretacion = interpretacion;
        this.ensenanza = ensenaza;
    }

    public int palabrasTotales(int palabrasPagina) {
        return getPaginas()*palabrasPagina;
    }



    public String interpretacion(){
        return interpretacion;
    }


    public String toString() {
        String tense = super.resumen() +"\n"+ensenanza;
        return tense;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }




}

