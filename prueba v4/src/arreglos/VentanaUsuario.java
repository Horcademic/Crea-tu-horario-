package arreglos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaUsuario extends JFrame {
	
	
	Info_estudiante IF=new Info_estudiante();
	private JPanel contentPane;
	private JTextField usuariotxt;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaUsuario frame = new VentanaUsuario();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					//frame.setUndecorated(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\prestamour\\Desktop\\Julian R\\prueba v4\\imagenes\\Daniela_Ramirez32.jpg"));
		this.setUndecorated(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 552);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscudour = new JLabel("EscudoUR");
		lblEscudour.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian R\\prueba\\imagenes\\logoUR.png"));
		lblEscudour.setBounds(57, 33, 257, 284);
		contentPane.add(lblEscudour);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsuario.setForeground(new Color(178, 34, 34));
		lblUsuario.setBounds(64, 357, 76, 26);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContrasea.setForeground(new Color(178, 34, 34));
		lblContrasea.setBounds(29, 394, 120, 26);
		contentPane.add(lblContrasea);
		
		usuariotxt = new JTextField();
		usuariotxt.setBackground(new Color(230, 230, 250));
		usuariotxt.setForeground(new Color(0, 0, 0));
		usuariotxt.setBounds(150, 357, 156, 26);
		contentPane.add(usuariotxt);
		usuariotxt.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(150, 394, 156, 26);
		contentPane.add(password);
		
		JButton btnE = new JButton("Iniciar Sesion");
		btnE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Integer usuario=Integer.valueOf(usuariotxt.getText())	;
			String Contraseņa=IF.getBaseUsuarios().get(usuario);
			Estudiante estudiante=IF.getBaseDatos().get(usuario);
			String pass= new String(password.getPassword());
			if(pass.equals(Contraseņa)) {
				Ventana_Siar S1=new Ventana_Siar(estudiante);
				S1.setVisible(true);
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "usurarios o contraseņa incorrecta");
			}
			}
		});
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnE.setBounds(133, 446, 113, 23);
		contentPane.add(btnE);
		
	
	}
}
