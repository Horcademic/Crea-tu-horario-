package arreglos;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
public class Estudiante {
	public Estudiante() {
		super();
	}
	String nombre;
	int id;
	int CreditosAprobados;
	ArrayList<Materia> MateriasAprobadas;
	
	
	
	public Estudiante(String nombre, int id, int creditosAprobados, ArrayList<Materia> materiasAprobadas) {
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
	public ArrayList<Materia> getMateriasAprobadas() {
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
	public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
		MateriasAprobadas = materiasAprobadas;
	}
	

}
