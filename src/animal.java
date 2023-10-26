package laboratorio.herencia;

public class animal {
	public String mascota = " mascota";
	
	public class Main {
	    public static void main(String[] args) {
	        animal animal = new animal();
	        animal.hacerSonido();
	    }
	}
	
	public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void perro() {
    	System.out.println(" GUAUU ");
    }
    public void gato() {
    	System.out.println(" MIAUU ");
    }
    public void ave() {
    	System.out.println(" PUEDO VOLAR ");
    }
	    }
	    
