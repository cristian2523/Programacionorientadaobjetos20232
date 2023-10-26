package laboratorio.herencia;

public class perro extends animal{
	public String raza = "Soy un perro";
    public void huskysiberiano() {
    	       System.out.println(" Raza huskysiberiano  ");
    	    }
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
    	    public static void main(String[] args) {
    	        perro perro = new perro();

    	        perro.perro();
    	        perro.huskysiberiano();

    	        System.out.println(perro.raza);
    	        System.out.println(perro.mascota + " canina ");
    	    
    }
    
}

