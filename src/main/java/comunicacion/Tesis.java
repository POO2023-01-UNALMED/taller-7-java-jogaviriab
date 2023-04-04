package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private static String[] argumentos;
    private String conclusion;
   private String referencias;
   private String interpretacion;

   public Tesis(String origen, String titulo, String autor, int paginas,String idea,String[] argumentos,String conclusion,String referencias,String interpretacion){
       super(origen,titulo,autor,paginas);
       this.idea = idea;
       this.argumentos = argumentos;
       this.conclusion = conclusion;
       this.referencias = referencias;
       this.interpretacion = interpretacion;
   }



    public int palabrasTotales(int palabrasPagina) {
        return getPaginas()*5*palabrasPagina;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString() {
        String tense = super.resumen() +"\n"+idea+"\n"+argumentos.length+"\n"+conclusion+"\n"+referencias;
        return tense;
    }



    public String getInterpretacion() {
        return interpretacion;
    }

    public static String[] getArgumentos() {
        return argumentos;
    }

    public String getIdea() {
        return idea;
    }

    public String getReferencias() {
        return referencias;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public static void setArgumentos(String[] argumentos) {
        Tesis.argumentos = argumentos;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
