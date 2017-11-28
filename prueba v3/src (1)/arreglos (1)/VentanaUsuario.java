package arreglos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
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
					frame.setUndecorated(false);
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscudour = new JLabel("EscudoUR");
		lblEscudour.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian Ramirez\\prueba\\imagenes\\logoUR.png"));
		lblEscudour.setBounds(57, 33, 257, 284);
		contentPane.add(lblEscudour);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUsuario.setForeground(new Color(178, 34, 34));
		lblUsuario.setBounds(37, 352, 75, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblContrasea.setForeground(new Color(178, 34, 34));
		lblContrasea.setBounds(36, 394, 113, 14);
		contentPane.add(lblContrasea);
		
		usuario = new JTextField();
		usuario.setBackground(new Color(230, 230, 250));
		usuario.setForeground(new Color(0, 0, 0));
		usuario.setBounds(150, 352, 156, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(150, 394, 156, 20);
		contentPane.add(password);
		
		JButton btnE = new JButton("Iniciar Sesion");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnE.setBounds(133, 446, 113, 23);
		contentPane.add(btnE);
	}
}
