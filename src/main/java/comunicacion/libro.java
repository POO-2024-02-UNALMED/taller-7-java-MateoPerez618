package comunicacion;

public class libro extends Escrito {

    private String co_autor;
    private String editorial;
    private String edicion;
    private String tipo;
    private String interpretacion;

    public libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String tipo, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.tipo = tipo;
        this.interpretacion = interpretacion;
    }

    public String getCo_autor() {
        return co_autor;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public String interpretacion() {
        return this.interpretacion;
    }
    
    public int palabrasTotales(int factor) {
        return this.getPaginas() * 2;
    }
    
    public String toString() {
		String l = this.getOrigen() + "\n";
		l += this.co_autor + "\n";
		l += this.editorial + "\n";
		l += this.edicion + "\n";
		l += this.tipo;
		return  l;
	}
}

