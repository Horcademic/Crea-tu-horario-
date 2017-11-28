package arreglos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

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


public class Ventana_Siar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Siar frame = new Ventana_Siar();
					frame.setAlwaysOnTop(true);
					frame.setResizable(true);
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
	public Ventana_Siar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel siar = new JPanel();
		siar.setBackground(new Color(153, 0, 51));
		siar.setBounds(10, 0, 1106, 102);
		contentPane.add(siar);
		siar.setLayout(new BorderLayout(0, 0));
		
		
		JLabel imagensiar = new JLabel("");
		imagensiar.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian Ramirez\\prueba\\imagenes\\logosiarUr.png"));
		siar.add(imagensiar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\prestamour\\Desktop\\Julian Ramirez\\prueba\\imagenes\\SIAR}.jpg"));
		label.setBounds(182, 99, 686, 400);
		contentPane.add(label);
	}
	
	}
	
		
	

