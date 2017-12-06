package arreglos;

import java.util.ArrayList;

public class Materia {
	String nombre;
	int codigo;
	int creditos;
	ArrayList<Integer>prerrequisitos;
	ArrayList<Horario_Materia> Horarios;
// si los prerequisitos son string como los comparo con las materias vistas por estudiantes que son tipo Materia	
	
	
	public ArrayList<Horario_Materia> getHorarios() {
		return Horarios;
	}
	public void setHorarios(ArrayList<Horario_Materia> horarios) {
		Horarios = horarios;
	}
	public Materia() {
		super();
	}
	public Materia(String nombre, int codigo, int creditos, ArrayList<Integer> prerrequisitos) {
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
	public ArrayList<Integer> getPrerrequisitos() {
		return prerrequisitos;
	}
	public void setPrerrequisitos(ArrayList<Integer> prerrequisitos) {
		this.prerrequisitos = prerrequisitos;
	}
	
}
	
	
	