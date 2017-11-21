package arreglos;

import java.util.ArrayList;

public class Info_estudiante  {

public Materia EvaluarMateria(Materia Materia, ArrayList<Materia>listaMateriaAprobadas) {
	String[] Prerrequisitos= Materia.getPrerrequisitos();
	Materia m=null;
	int suma=0;
	for (int u=0;u<=Prerrequisitos.length;u++) {
		String a=Prerrequisitos[u];
		for(int i=0;i<= listaMateriaAprobadas.size();i++) {
			if(listaMateriaAprobadas.contains(a)) {
			suma++;
		}
	}
	
	}
	if(suma==Prerrequisitos.length+1) {
		m=Materia;
	}
	return m;
	
}
public ArrayList<Materia> Lista_materias_cursar(Estudiante estudiante){
	ArrayList<Materia> listaCursar=null;
	for (Lista_Materias Materia1:Lista_Materias.values()) {
		
		ArrayList<Lista_Materias>listaMateriaAprobadas=estudiante.getMateriasAprobadas();
		Materia w=EvaluarMateria(Materia1,listaMateriaAprobadas);
		listaCursar.add(w);
	}
	return listaCursar;
	
}

}
