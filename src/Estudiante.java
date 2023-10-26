package laboratorio.herencia;

public class Estudiante {

	    private String nombre;
	    private int edad;
	    private String carrera;


	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public String getCarrera() {
	        return carrera;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public void setCarrera(String carrera) {
	        this.carrera = carrera;
	    }

	    public static void main(String[] args) {
	        Estudiante estudiante = new Estudiante();

	        // Accediendo a la propiedad privada "nombre" a través del método getNombre()
	        String nombre = estudiante.getNombre();
	        System.out.println("Nombre: ");

	        // Modificando la propiedad privada "nombre" a través del método setNombre()
	        estudiante.setNombre(nombre);
	        System.out.println("cristian");

	        int edad = estudiante.getEdad();
	        System.out.println("edad: ");

	        estudiante.setEdad(edad);
	        System.out.println("25 años");

	        String carrera = estudiante.getCarrera();
	        System.out.println("carrera: ");

	        estudiante.setCarrera(carrera);
	        System.out.println("ingenieria de informatica");
	    }
	}
