package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String tipo;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String tipo) {
        super(origen);
        this.letras = letras;
        this.tipo = tipo;
    }

    public String[] getLetras() {
        return letras;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int cantidadLetras() {
        return (letras != null) ? letras.length : 0;
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
    
    @Override

    public String toString() {
    	String a = this.getOrigen() + "\n";
        a += this.cantidadLetras() + "\n";
		a += this.tipo;		
		return  a;
	}
}
