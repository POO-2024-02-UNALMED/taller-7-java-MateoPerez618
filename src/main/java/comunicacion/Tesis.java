package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }
    
    public String[] getArgumentos() {
        return argumentos;
    }
    
    public int getCantidadArgumentos() {
        return (argumentos != null) ? argumentos.length : 0;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }
	
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    
    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
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
        return this.getPaginas() * 5;
    }
    
    
    @Override
    public String toString() {
		String t = this.getOrigen() + "\n";
		t += this.getTitulo() + "\n";
		t += this.getAutor() + "\n";
		t += this.getPaginas() + "\n";
		t += this.idea + "\n";
		t += this.getCantidadArgumentos() + "\n";
		t += this.conclusion + "\n";
		t += this.referencias + "\n";
		return t;
	}

}
