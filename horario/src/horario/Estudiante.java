package horario;


// Informacion del estudiante

public class Estudiante {
	
	
	private String nombre;
	
	private int numDocumento;
	
	private float creditosAprobados;
	
	private enum materiasAprobadas{
		MICROECONOMÍA_I, MICROECONOMÍA_II, MICROECONOMÍA_III, MACROECONOMÍA_I, MACROECONOMÍA_II, MACROECONOMÍA_III,
		ECONOMÍA_MATEMÁTICA, ÁLEGBRA_LINEAL, ESTADÍSTICA, PROBABILIDAD, CÁCULO_I, CÁLCULO_II;
		
	}
	
	private String correo;
	
	public Estudiante(String nombre, int numDoc, float creditos, String correo){
			this.nombre = nombre;
			numDocumento = numDoc;
			creditosAprobados= creditos;
			this.correo=correo;
	}
	
	public Estudiante(String c) {
		correo=c;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}

	public float getCreditosAprobados() {
		return creditosAprobados;
	}

	public void setCreditosAprobados(float creditosAprobados) {
		this.creditosAprobados = creditosAprobados;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
