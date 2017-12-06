package arreglos;


// Con esta clase se logro crear una lista para que esta almacene lo que el metodo del lector de archivo de horario leia.
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

