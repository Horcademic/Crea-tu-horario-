package arreglos;

public class Materia {
	String nombre;
	Lista_Materias Materia;
	int codigo;
	int creditos;
	String[] prerrequisitos;
	
	
	public Materia(String nombre, Lista_Materias materia, int codigo, int creditos, String[] prerrequisitos) {
		super();
		this.nombre = nombre;
		Materia = materia;
		this.codigo = codigo;
		this.creditos = creditos;
		this.prerrequisitos = prerrequisitos;
	}


	public String getNombre() {
		return nombre;
	}


	public Lista_Materias getMateria() {
		return Materia;
	}


	public int getCodigo() {
		return codigo;
	}


	public int getCreditos() {
		return creditos;
	}


	public String[] getPrerrequisitos() {
		return prerrequisitos;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setMateria(Lista_Materias materia) {
		Materia = materia;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}


	public void setPrerrequisitos(String[] prerrequisitos) {
		this.prerrequisitos = prerrequisitos;
	}


	}
	
	
	
	


