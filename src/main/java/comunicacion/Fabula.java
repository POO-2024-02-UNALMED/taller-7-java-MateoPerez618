package comunicacion;

public class Fabula extends Escrito {
	private String ensenanzas;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas = ensenanzas;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
        return ensenanzas;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanzas = ensenanza;
    }
    
    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    @Override
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
		return f;
	}

}
