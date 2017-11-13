package horario;


// Informacion del estudiante

public class Estudiante {
	
	
	private String nombre;
	
	private int numDocumento;
	
	private float creditosAprobados;
	
	private enum materiasAprobadas{
		MICROECONOM�A_I, MICROECONOM�A_II, MICROECONOM�A_III, MACROECONOM�A_I, MACROECONOM�A_II, MACROECONOM�A_III,
		ECONOM�A_MATEM�TICA, �LEGBRA_LINEAL, ESTAD�STICA, PROBABILIDAD, C�CULO_I, C�LCULO_II;
		
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
