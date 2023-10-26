package laboratorio.herencia;

public class gato extends animal {
	public String raza = " Soy un gato";
    public void siames() {
            System.out.println(" Raza es siames ");
        }
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
        public static void main(String[] args) {
            gato gato = new gato();
            gato.gato();
            gato.siames();

            System.out.println(gato.raza);
            System.out.println(gato.mascota + " felino ");
        }
    
}

