package arreglos;

import java.util.ArrayList;
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


public class Info_estudiante  {
	public static ArrayList<Materia> Lista_Materias=null;

public Materia EvaluarMateria(Materia Materia, ArrayList<Materia>listaMateriaAprobadas) {
	ArrayList<String> Prerrequisitos= Materia.getPrerrequisitos();
	Materia m=null;
	int suma=0;
	for (int u=0;u<=Prerrequisitos.size();u++) {
		String a=Prerrequisitos.get(u);
		for(int i=0;i<= listaMateriaAprobadas.size();i++) {
			if(listaMateriaAprobadas.contains(a)) {
			suma++;
		}
	}
	
	}
	if(suma==Prerrequisitos.size()+1) {
		m=Materia;
	}
	return m;
	
}
public ArrayList<Materia> Lista_materias_cursar(Estudiante estudiante){
	ArrayList<Materia> listaCursar=null;
	for (int i=0;i<=Lista_Materias.size();i++) {
		ArrayList<Materia>listaMateriaAprobadas=estudiante.getMateriasAprobadas();
		Materia w=EvaluarMateria(Lista_Materias.get(i),listaMateriaAprobadas);
		listaCursar.add(w);
	}
	return listaCursar;
	
}





public static void LectorEstudiantes(String[]args) throws Exception {
	String filename = "test.xls";
	FileInputStream fis = null;
	try {
		 fis = new FileInputStream(filename);      	
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);	
		 Iterator<Row> rows = sheet.rowIterator();
		 while (rows.hasNext()) {
			int numeroEstudiante=1;
			Estudiante i=new Estudiante();
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			Cell nombre = cells.next();
			i.setNombre(nombre.getStringCellValue());
			XSSFCell Id1 = (XSSFCell) cells.next();
			int Id=(int) Id1.getNumericCellValue();
			i.setId(Id);
			XSSFCell CreditosAprobados1 = (XSSFCell) cells.next();
			int CreditosAprobados=(int) CreditosAprobados1.getNumericCellValue();
			i.setCreditosAprobados(CreditosAprobados);
			ArrayList<Materia> MateriasAprobadas=null;
			while (cells.hasNext()) {
				 XSSFCell MateriaVista = (XSSFCell) cells.next();
				 MateriasAprobadas.add(MateriaVista);    	        	
				 } 
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		if (fis != null) {
		fis.close();
		}
		}
}


public static void LectorMaterias(String[]args) throws Exception {
	String filename = "test.xls";
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
			ArrayList<String> prerrequisitos=null;
			while (cells.hasNext()) {
			 XSSFCell  prerrequisito = (XSSFCell) cells.next();
			 prerrequisitos.add(prerrequisito.getStringCellValue());
			 } 
			Lista_Materias.add(i);
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
