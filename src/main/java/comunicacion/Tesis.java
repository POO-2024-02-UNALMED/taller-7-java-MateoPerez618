package comunicacion;
import java.util.List;

public class Tesis extends Escrito {
	private String idea;
	private List<String> argumentos;
	private String conclusion;
	private String referencias;
	private String tipo;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, List<String> argumentos, String conclusion, String referencias, String tipo, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.tipo = tipo;
		this.interpretacion = interpretacion;
	}
	
	public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }
    
    public List<String> getArgumentos() {
        return argumentos;
    }
    
    public int getCantidadArgumentos() {
        return argumentos.size();
    }

    public void setArgumentos(List<String> argumentos) {
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
        return this.getPaginas() * 5;
    }
    
    public String toString() {
		String t = this.getOrigen() + "\n";
		t += this.idea + "\n";
		t += this.getCantidadArgumentos() + "\n";
		t += this.conclusion + "\n";
		t += this.referencias + "\n";
		t += this.tipo;
		return t;
	}

}
