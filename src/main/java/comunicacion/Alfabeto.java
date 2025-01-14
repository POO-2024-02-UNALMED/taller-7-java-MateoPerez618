package comunicacion;

import java.util.List;

public abstract class Alfabeto extends Pictograma {
    private static List<String> letras;
    private String tipo;
    private String interpretacion;

    public Alfabeto(String origen, String tipo, String interpretacion) {
        super(origen);
        this.tipo = tipo;
        this.interpretacion = interpretacion;
    }

    public static List<String> getLetras() {
        return letras;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int cantidadLetras() {
        return letras.size();
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

    public String toString() {
    	String a = this.getOrigen() + "\n";
        a += this.cantidadLetras() + "\n";
		a += this.tipo;
		
		return  a;
	}
}
