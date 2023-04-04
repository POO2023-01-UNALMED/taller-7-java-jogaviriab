package comunicacion;

import javax.management.loading.PrivateClassLoader;

public  class Libro extends Escrito {
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas,String co_autor, String editorial, String edicion, String interpretacion){
        super(origen,titulo,autor,paginas);
        this.co_autor = co_autor;
        this.edicion = edicion;
        this.editorial = editorial;
        this.interpretacion = interpretacion;

    }


    public int palabrasTotales(int palabrasPagina){
        return getPaginas()*2*palabrasPagina;
    }

    public String interpretacion(){
        return interpretacion;
    }


    public String toString() {
        String tense = super.resumen() +"\n"+co_autor+"\n"+editorial+"\n"+edicion;
        return tense;
    }

    public String getCo_autor() {
        return co_autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getInterpretacion() {
        return interpretacion;
    }


    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

}
