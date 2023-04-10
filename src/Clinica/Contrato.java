package Clinica;

public class Contrato {
	private String descripcion;
	
    public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private int sueldo;
    
    public Contrato(int sueldo) {
    	this.sueldo = sueldo;
    }

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
}
