package arreglos;

public class Horario_Materia extends Materia{
	public Horario_Materia() {
		super();
	}
	public Horario_Materia(int hora, Integer dia, String nombre) {
		super();
		Hora = hora;
		Dia = dia;
		Nombre=nombre;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	String Nombre;
	Integer Hora;
	Integer Dia;
	public int getHora() {
		return Hora;
	}
	public void setHora(Integer hora) {
		Hora = hora;
	}
	public Integer getDia() {
		return Dia;
	}
	public void setDia(Integer dia) {
		Dia = dia;
	
}
}

