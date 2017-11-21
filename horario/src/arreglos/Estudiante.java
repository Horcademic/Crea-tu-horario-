package arreglos;
import java.util.ArrayList;
public class Estudiante extends java.util.ArrayList {
	String nombre;
	int id;
	int CreditosAprobados;
	ArrayList<Lista_Materias> MateriasAprobadas;
	
	
	
	public Estudiante(String nombre, int id, int creditosAprobados, ArrayList<Lista_Materias> materiasAprobadas) {
		super();
		this.nombre = nombre;
		this.id = id;
		CreditosAprobados = creditosAprobados;
		MateriasAprobadas = materiasAprobadas;
	}
	public Estudiante(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getId() {
		return id;
	}
	public int getCreditosAprobados() {
		return CreditosAprobados;
	}
	public ArrayList<Lista_Materias> getMateriasAprobadas() {
		return MateriasAprobadas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCreditosAprobados(int creditosAprobados) {
		CreditosAprobados = creditosAprobados;
	}
	public void setMateriasAprobadas(ArrayList<Lista_Materias> materiasAprobadas) {
		MateriasAprobadas = materiasAprobadas;
	}
	

}
