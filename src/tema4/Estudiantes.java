package tema4;

public class Estudiantes {
	private String nombre;
	private int edad;
	private String dni;
	
	public Estudiantes(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	 public String getDni() {
	        return dni;
	    }

	    public void setDni(String newDni) {
	        this.dni = newDni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String newNombre) {
	        this.nombre = newNombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int newEdad) {
	        this.edad = newEdad;
	    }

}
