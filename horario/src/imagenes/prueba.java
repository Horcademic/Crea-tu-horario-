package imagenes;

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;


public class prueba extends GraphicsProgram{
	public void run() {
		GImage back= new GImage ("C:\\\\Users\\Julian\\Desktop\\IMAGENES PARA TRABAJO\\fondo.jpg");
		
		add(back,1,1);
		}
		
		public void init(){
			addMouseListeners();
		
	}

}
