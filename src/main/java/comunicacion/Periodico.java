package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	private String tipo;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String tipo, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.tipo = tipo;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
	public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
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
        return this.getPaginas() * 10;
    }
    
    public String toString() {
		String p = this.getOrigen() + "\n";
		p += this.fecha + "\n";
		p += this.primicia + "\n";
		p += this.tipo;
		return p;
	}

}