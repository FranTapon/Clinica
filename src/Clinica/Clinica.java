package Clinica;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

	public Clinica() {
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void agregarContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}

	public String reporteSueldos() {
		double total = 0;
		String cartelito = "";
		for (int i = 0; i < this.empleados.size(); i++) {
			cartelito = cartelito + "Nombre: " + this.empleados.get(i).getNombre() + " Suedo: "
					+ this.empleados.get(i).calcularSueldo() + "\n";
			total += this.empleados.get(i).calcularSueldo();
		}
		cartelito += "Total: " + total;
		return cartelito;
	}
//	compocision 
//	agregacion

}
