package arreglos;

public class Horario_Materia extends Materia{
	public Horario_Materia() {
		super();
	}
	public Horario_Materia(int hora, String dia) {
		super();
		Hora = hora;
		Dia = dia;
	}
	int Hora;
	String Dia;
	public int getHora() {
		return Hora;
	}
	public void setHora(int hora) {
		Hora = hora;
	}
	public String getDia() {
		return Dia;
	}
	public void setDia(String dia) {
		Dia = dia;
	
}
}

