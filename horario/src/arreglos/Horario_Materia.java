package arreglos;

public class Horario_Materia extends Materia{
	int Hora;
	String Dia;
	public Horario_Materia(String nombre, Lista_Materias materia, int codigo, int creditos, String[] prerrequisitos) {
		super(nombre, materia, codigo, creditos, prerrequisitos);
	}
	public Horario_Materia(String nombre, Lista_Materias materia, int codigo, int creditos, String[] prerrequisitos,
			int hora, String dia) {
		super(nombre, materia, codigo, creditos, prerrequisitos);
		Hora = hora;
		Dia = dia;
	}
	public int getHora() {
		return Hora;
	}
	public String getDia() {
		return Dia;
	}
	public void setHora(int hora) {
		Hora = hora;
	}
	public void setDia(String dia) {
		Dia = dia;
	}
	
	
	
	

}
