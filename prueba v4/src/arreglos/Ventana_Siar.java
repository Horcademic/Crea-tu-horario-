package arreglos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTree;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Panel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JInternalFrame;


public class Ventana_Siar extends JFrame {

	private JPanel contentPane;
	private Estudiante estudiante;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estudiante estudiante=new Estudiante();
					Ventana_Siar frame = new Ventana_Siar(estudiante);
					frame.setAlwaysOnTop(true);
					frame.setResizable(true);
					frame.setVisible(true);
					Toolkit tk= Toolkit.getDefaultToolkit();
						int xsize= (int) tk.getScreenSize().getWidth();
						int ysize= (int) tk.getScreenSize().getHeight();
					frame.setSize(xsize, ysize);
					frame.setPreferredSize(new Dimension(xsize, ysize));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Siar(Estudiante estudiante) {

		this.estudiante=estudiante;
		setAlwaysOnTop(true);
		setVisible(true);
		Toolkit tk= Toolkit.getDefaultToolkit();
		int xsize= (int) tk.getScreenSize().getWidth();
		int ysize= (int) tk.getScreenSize().getHeight();
		this.setBounds(0, 0, 1460, 1000);
		setSize(xsize, ysize);
		setPreferredSize(new Dimension(xsize, ysize));
		
		
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel foto = new JLabel("");
		foto.setBounds(343, 140, xsize-343, ysize-140);
		foto.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian R\\prueba v4\\imagenes\\SiarGrande.png"));
		contentPane.add(foto);
		
		JPanel panelrojosuperior = new JPanel();
		panelrojosuperior.setBounds(0, 0, 1387, 120);
		panelrojosuperior.setSize(xsize, 120);
		panelrojosuperior.setPreferredSize(new Dimension(xsize, 120));
		contentPane.add(panelrojosuperior);
		panelrojosuperior.setBackground(new Color(153, 0, 51));
		panelrojosuperior.setLayout(null);
		
		JLabel logosiar = new JLabel("");
		logosiar.setBounds(1, 0, 250, 102);
		panelrojosuperior.add(logosiar);
		logosiar.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian R\\prueba\\imagenes\\logosiarUr.png"));
		logosiar.setBackground(new Color(165, 42, 42));
		
		JPanel panelmenu = new JPanel();
		panelmenu.setBounds(0, 122, 342, 698);
		contentPane.add(panelmenu);
		panelmenu.setLayout(new GridLayout(16, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Datos personales");
		panelmenu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Datos academicos");
		panelmenu.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_2 = new JButton("Matricula");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Ventana_horario S1=new Ventana_horario(estudiante);
				S1.setVisible(true);
				dispose();
			}
		});
		panelmenu.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Gestion economica");
		panelmenu.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("calificaciones");
		panelmenu.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Horarios");
		panelmenu.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Certificados y Otros pagos");
		panelmenu.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Educaci\u00F3n continuada");
		panelmenu.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Catalogo de Asignaturas");
		panelmenu.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Conoce tu nivel de ingl\u00E9s");
		panelmenu.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Links externos");
		panelmenu.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Ayuda");
		panelmenu.add(btnNewButton_12);
		
		//
		



	}
	}
	
		
	

