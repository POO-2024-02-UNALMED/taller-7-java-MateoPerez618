package comunicacion;

public class Fabula extends Escrito {
	private String ensenanzas;
	private String tipo;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String tipo, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas = ensenanzas;
		this.tipo = tipo;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanza) {
        this.ensenanzas = ensenanza;
    }
    
	public String getTipo() {
        return ensenanzas;
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
        return this.getPaginas() * 1;
    }
    
    @Override
    public String toString() {
		String f = this.getOrigen() + "\n";
		f += this.getTitulo() + "\n";
		f += this.getAutor() + "\n";
		f += this.getPaginas() + "\n";
		f += this.ensenanzas + "\n";
		f += this.tipo + "\n";
		f += this.interpretacion;
		return f;
	}

}
