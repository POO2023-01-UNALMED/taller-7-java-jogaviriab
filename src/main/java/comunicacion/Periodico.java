package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;

    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas,String fecha, String primicia, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return getPaginas()*10*palabrasPagina;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString() {
        String tense = super.resumen() +"\n"+fecha+"\n"+primicia;
        return tense;
    }


    public String getInterpretacion() {
        return interpretacion;
    }

    public String getPrimicia() {
        return primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

}
