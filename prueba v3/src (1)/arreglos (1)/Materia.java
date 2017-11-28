package arreglos;

import java.util.ArrayList;

public class Materia {
	String nombre;
	int codigo;
	int creditos;
	ArrayList<String>prerrequisitos;
// si los prerequisitos son string como los comparo con las materias vistas por estudiantes que son tipo Materia	
	
	
	public Materia() {
		super();
	}
	public Materia(String nombre, int codigo, int creditos, ArrayList<String> prerrequisitos) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		this.prerrequisitos = prerrequisitos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public ArrayList<String> getPrerrequisitos() {
		return prerrequisitos;
	}
	public void setPrerrequisitos(ArrayList<String> prerrequisitos) {
		this.prerrequisitos = prerrequisitos;
	}
	
}
	
	
	