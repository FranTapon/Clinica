package Clinica;

public abstract class Empleado {
	private String nombre;
	private String domicilio;
	int documento;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int i) {
		this.documento = i;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Empleado(String nombre, int documento2, String domicilio) {
		super();
		this.nombre = nombre;
		this.documento = documento2;
		this.domicilio = domicilio;
	}

	public abstract double calcularSueldo();
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", documento=" + documento + ", domicilio=" + domicilio +  "]";
	}

	

	
	

}


