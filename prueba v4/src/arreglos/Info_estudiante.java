package arreglos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.FileInputStream;
import acm.program.*;

public class Info_estudiante  {

	


	
	public static ArrayList<Materia> Lista_Materias;
	public static HashMap<Integer,Estudiante> BaseDatos;
	public static HashMap<Integer,Materia> BaseMaterias;
	public static HashMap<Integer,String> BaseUsuarios;
	
// Hashmaps
public static ArrayList<Materia> getLista_Materias() {
		return Lista_Materias;
	}
	public static HashMap<Integer, Estudiante> getBaseDatos() {
		return BaseDatos;
	}
	public static HashMap<Integer, Materia> getBaseMaterias() {
		return BaseMaterias;
	}
	public static HashMap<Integer, String> getBaseUsuarios() {
		return BaseUsuarios;
	}
	
// Con este metodo se busca definir si una materia que el estudiante aun no ha visto la puede cursar.
public static Materia EvaluarMateria(Materia Materia, ArrayList<Materia>listaMateriaAprobadas) {
	ArrayList<Integer> Prerrequisitos= Materia.getPrerrequisitos();
	Materia m=null;
	int suma=0;
	if (Prerrequisitos!=null) {
		for (int u=0;u<Prerrequisitos.size();u++) {
			Integer a1=Prerrequisitos.get(u);
			Materia a= BaseMaterias.get(a1);
			if(listaMateriaAprobadas.contains(a)) {
					suma++;
				
			}
		}
		if(suma==Prerrequisitos.size()) {
			m=Materia;
		}
		return m;}

	else {
		return Materia;
}
}
	

	
// Este metodo nos da una una lista la cual esta compuesta por materias que el estudiante puede llegar a ver
public static ArrayList<Materia> Lista_materias_cursar(Estudiante estudiante){
	ArrayList<Materia> listaCursar=new ArrayList<Materia>() ;
	ArrayList<Materia>listaMateriaAprobadas=estudiante.getMateriasAprobadas();
		for (int j=0;j<=Lista_Materias.size()-1;j++) {
			if (listaMateriaAprobadas.contains(Lista_Materias.get(j))) {
				
			}else {
				Materia w=EvaluarMateria(Lista_Materias.get(j),listaMateriaAprobadas);
				if(w!=null) {
				listaCursar.add(w);}
	}}
	return listaCursar;
	
}




//Con este metodo estamos leyendo el archivo baseEstudiantes
public static void LectorEstudiantes() throws Exception {
	BaseDatos=new HashMap<Integer,Estudiante>();
	BaseUsuarios=new  HashMap<Integer,String> ();
	String filename = "C:\\Users\\Julian\\Desktop\\prueba v4\\data\\baseEstudiantes.xlsx";
	FileInputStream fis = null;
	try {
		 fis = new FileInputStream(filename);      	
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);	
		 Iterator<Row> rows = sheet.rowIterator();
		 while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			String nombre = (cells.next()).getStringCellValue();
			if (nombre!=""){
				String contraseña = (cells.next()).getStringCellValue();
				Integer Id =  new Integer( (int) ((XSSFCell) cells.next()).getNumericCellValue() );
				int CreditosAprobados = (int)((XSSFCell) cells.next()).getNumericCellValue();
				
				ArrayList<Materia> MateriasAprobadas=new ArrayList<Materia> ();
				while (cells.hasNext()) {
					 XSSFCell MateriaVista = (XSSFCell) cells.next();
					 int codigos=(int) MateriaVista.getNumericCellValue();
					 Materia MateriaAprobada=BaseMaterias.get(codigos);	
					 MateriasAprobadas.add(MateriaAprobada);
					 } 
				Estudiante Codigo=new Estudiante(nombre,Id,CreditosAprobados,contraseña,MateriasAprobadas);
				//Añadimos la llave y el valor al hashmap BaseDatos y al BaseUsuarios
				BaseDatos.put(Id, Codigo);
				BaseUsuarios.put(Id, contraseña);
			}
		}
		workbook.close();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fis != null) {
				fis.close();
			}
		}
}

// Con este metodo leemos el archivo baseMaterias
public static void LectorMaterias() throws Exception {
	Lista_Materias=new ArrayList<Materia>();
	BaseMaterias= new HashMap<Integer,Materia>(); 
	String filename = "C:\\Users\\Julian\\Desktop\\prueba v4\\data\\baseMaterias.xlsx";
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filename);      	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);	
		Iterator<Row> rows = sheet.rowIterator();
		while (rows.hasNext()) {
			Materia i=new Materia();
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			Cell nombre = cells.next();
			i.setNombre(nombre.getStringCellValue());
			XSSFCell codigo1 = (XSSFCell) cells.next();
			int codigo=(int) codigo1.getNumericCellValue();
			i.setCodigo(codigo);
			XSSFCell creditos1 = (XSSFCell) cells.next();
			int creditos=(int) creditos1.getNumericCellValue();
			i.setCreditos(creditos);
			ArrayList<Integer> prerrequisitos=new ArrayList<Integer>();
			while (cells.hasNext()) {
			 XSSFCell  prerrequisito = (XSSFCell) cells.next();
			 prerrequisitos.add(new Integer((int)prerrequisito.getNumericCellValue()));
			 } 
			i.setPrerrequisitos(prerrequisitos);
			Lista_Materias.add(i);
			BaseMaterias.put(codigo, i);
			 }
		} catch (IOException e) {
			 e.printStackTrace();
		}finally {
		if (fis != null) {
		fis.close();
		}
		}
}

//Creamos un constructor de esta clase el cual utilizaremos en otras clases, ademas corremos los metodos de esta clase para crear los objetos con los que trabajaremos
public Info_estudiante() {
	super();
	try {
		LectorMaterias();
		LectorEstudiantes();
		LectorHorarios();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
//Leemos el archivo baseHorarios
public static void LectorHorarios() throws Exception {

	String filename = "C:\\Users\\Julian\\Desktop\\prueba v4\\data\\baseHorarios.xlsx";
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filename);      	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);	
		Iterator<Row> rows = sheet.rowIterator();
		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			XSSFCell codigo1 = (XSSFCell) cells.next();
			int codigo=(int) codigo1.getNumericCellValue();
			ArrayList<Horario_Materia> Horarios=new ArrayList<Horario_Materia>();
			while (cells.hasNext()) {
				Horario_Materia i=new Horario_Materia();
				Cell nombre = cells.next();
				i.setNombre(nombre.getStringCellValue());
				Cell Dia = cells.next();
				i.setDia(new Integer((int)Dia.getNumericCellValue()));
				XSSFCell Hora = (XSSFCell) cells.next();
				Integer Hora1=new Integer((int) Hora.getNumericCellValue());
				i.setHora(Hora1);
				Horarios.add(i);

			}
			Materia a=BaseMaterias.get(codigo);
			a.setHorarios(Horarios);
		}
		
		} catch (IOException e) {
			 e.printStackTrace();
		}finally {
		if (fis != null) {
		fis.close();
		}
		}
}




}  


