package arreglos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Ventana_horario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Estudiante estudiante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estudiante estudiante=new Estudiante();
					Ventana_horario frame = new Ventana_horario(estudiante);
					frame.setVisible(true);
					Toolkit tk= Toolkit.getDefaultToolkit();
					int xsize= (int) tk.getScreenSize().getWidth();
					int ysize= (int) tk.getScreenSize().getHeight();
				frame.setSize(xsize, ysize);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		

	/**
	 * Create the frame.
	 */
public Ventana_horario(Estudiante estudiante) {
	this.estudiante=estudiante;
		setAlwaysOnTop(true);
		setVisible(true);
		Toolkit tk= Toolkit.getDefaultToolkit();
		int xsize= (int) tk.getScreenSize().getWidth();
		int ysize= (int) tk.getScreenSize().getHeight();
		setSize(1424, 831);
		setPreferredSize(new Dimension(xsize, ysize));
		
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, xsize, ysize);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelrojo = new JPanel();
		panelrojo.setLayout(null);
		panelrojo.setBackground(new Color(153, 0, 51));
		panelrojo.setBounds(0,0, 1418, 120);
		panelrojo.setSize(xsize, 120);
		contentPane.add(panelrojo);
		
		JLabel logosiar = new JLabel("");
		logosiar.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian R\\prueba v4\\imagenes\\logosiarUr.png"));
		logosiar.setBackground(new Color(165, 42, 42));
		logosiar.setBounds(1, 0, 250, 102);
		panelrojo.add(logosiar);
		
		JPanel paneBotones = new JPanel();
		paneBotones.setBounds(0, 120, 251, 630);
		contentPane.add(paneBotones);
		paneBotones.setLayout(new GridLayout(16, 1, 0, 0));
		
		JButton button = new JButton("Datos personales");
		paneBotones.add(button);
		
		JButton button_1 = new JButton("Datos academicos");
		paneBotones.add(button_1);
		
		JButton button_2 = new JButton("Matricula");
		paneBotones.add(button_2);
		
		JButton button_3 = new JButton("Gestion economica");
		paneBotones.add(button_3);
		
		JButton button_4 = new JButton("calificaciones");
		paneBotones.add(button_4);
		
		JButton button_5 = new JButton("Horarios");
		paneBotones.add(button_5);
		
		JButton button_6 = new JButton("Certificados y Otros pagos");
		paneBotones.add(button_6);
		
		JButton button_7 = new JButton("Educaci\u00F3n continuada");
		paneBotones.add(button_7);
		
		JButton button_8 = new JButton("Catalogo de Asignaturas");
		paneBotones.add(button_8);
		
		JButton button_9 = new JButton("Conoce tu nivel de ingl\u00E9s");
		paneBotones.add(button_9);
		
		JButton button_10 = new JButton("Links externos");
		paneBotones.add(button_10);
		
		JButton button_11 = new JButton("Ayuda");
		paneBotones.add(button_11);
		
		JPanel panelTabla = new JPanel();
		panelTabla.setBounds(249, 393, 1169, 423);
		contentPane.add(panelTabla);
		panelTabla.setLayout(null);
		
		table = new JTable();
		table.setRowHeight(30);
		table.setAlignmentY(Component.CENTER_ALIGNMENT);
		table.setEnabled(false);
		table.setBounds(243, 63, 807, 349);
		table.setRowSelectionAllowed(false);
		table.setSurrendersFocusOnKeystroke(false);
		panelTabla.add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"},
				{"7:00-9:00", null, null, null, null, null},
				{"9:00-11:00", null, null, null, null, null},
				{"11:00-13:00", null, null, null, null, null},
				{"13:00-15:00", null, null, null, null, null},
				{"15:00-17:00", null, null, null, null, null},
				{"17:00-19:00", null, null, null, null, null},

			},
			new String[] {
				"Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setMinWidth(12);
		table.setRowHeight(40);
		
		JPanel panel = new JPanel();
		panel.setBounds(274, 135, 1170, 247);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		ArrayList<Materia> listaMaterias=Info_estudiante.Lista_materias_cursar(estudiante);
		String [] arreglo= new String[listaMaterias.size()];
		for (int i=0;i<=listaMaterias.size()-1;i++) {
			arreglo[i] = listaMaterias.get(i).getNombre();
		}
		

		JComboBox Horario = new JComboBox();
		Horario.setBounds(441, 107, 135, 23);
		
		JComboBox materias = new JComboBox();
		materias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

						if(e.getStateChange()==ItemEvent.SELECTED) {
						Materia [] arreglo2= new Materia [listaMaterias.size()];
						
						String materiacombo=e.getItem().toString();
						Materia materiaSelec=new Materia();
						for(int i=0; i<=listaMaterias.size()-1;i++) {
							if(listaMaterias.get(i).getNombre()==materiacombo) {
								materiaSelec=listaMaterias.get(i);
							}
						}
						ArrayList<Horario_Materia> comHorario= materiaSelec.getHorarios();
						String[] comboHorario= new String[comHorario.size()];
						for(int i=0;i<=comHorario.size()-1;i++) {
							comboHorario[i]=comHorario.get(i).getNombre();
						}
						Horario.setModel(new DefaultComboBoxModel(comboHorario));
						}
		
			}
		});
		materias.setModel(new DefaultComboBoxModel(arreglo));
		
		
		materias.setBounds(195, 107, 116, 23);
		panel.add(materias);
		
		JButton btnNewButton = new JButton("Agregar Materia");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String mateSelec=materias.getSelectedItem().toString();
				Materia mate=new Materia();
				for(int i=0; i<=listaMaterias.size()-1;i++) {
					if(listaMaterias.get(i).getNombre()==mateSelec) {
						mate=listaMaterias.get(i);
					}
				
			}
				String horaSelec=Horario.getSelectedItem().toString();
				ArrayList<Horario_Materia> Horari= mate.getHorarios();
				Horario_Materia que= new Horario_Materia();
				for(int i=0; i<=Horari.size()-1;i++) {
					if(Horari.get(i).getNombre()==horaSelec) {
						que=Horari.get(i);
					}
					
					}

				
				table.getModel().setValueAt(mate.getNombre(),que.getHora(),que.getDia());
				
				}
		});
		btnNewButton.setBounds(585, 181, 146, 23);
		panel.add(btnNewButton);
		
		
		

		panel.add(Horario);
		
		JLabel lblMateria = new JLabel("Materia:");
		lblMateria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMateria.setBounds(124, 107, 80, 23);
		panel.add(lblMateria);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHorario.setBounds(371, 108, 73, 22);
		panel.add(lblHorario);
		
		JLabel lblAsignaturasMatriculables = new JLabel("Asignaturas Matriculables");
		lblAsignaturasMatriculables.setForeground(new Color(139, 0, 0));
		lblAsignaturasMatriculables.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAsignaturasMatriculables.setBounds(26, 23, 371, 37);
		panel.add(lblAsignaturasMatriculables);

		
	  
	   
	   
		
		
		
	}
}
