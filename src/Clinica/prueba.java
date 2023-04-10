package Clinica;

public class prueba {

	public static void main(String[] args) {

		Clinica clinica = new Clinica();
		Contrato c1 = new Contrato(10000);

		Medico medico = new Medico("emilio fernandez", 462367446,"juan b justo2345", c1);
		clinica.agregarEmpleado(medico);
		System.out.println(clinica.reporteSueldos());

	}

}
