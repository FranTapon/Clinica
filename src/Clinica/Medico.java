package Clinica;

public class Medico extends Empleado{
private Contrato contrato;
	public Medico(String nombre, int documento, String domicilio,Contrato contrato) {
		super(nombre, documento, domicilio);
		this.contrato=contrato;
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return this.contrato.getSueldo();
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	

}
