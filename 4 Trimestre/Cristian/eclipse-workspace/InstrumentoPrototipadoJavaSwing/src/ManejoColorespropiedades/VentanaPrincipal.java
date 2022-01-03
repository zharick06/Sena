package ManejoColorespropiedades;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.Font;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnTransparente;
	private JButton btnOpaca;
	private JButton btnFondoVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnVerde;
	private JButton btnAzul;
	private JButton btnRojo;
	private JTextPane etiTexto;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,380);
		setTitle("Manejo de Colores y propiedades de las etiquetas");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ProgressBar.foreground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBackground(new Color(153, 0, 51));
		btnRojo.setForeground(Color.WHITE);
		btnRojo.addActionListener(this);
		btnRojo.setBounds(194, 163, 73, 25);
		contentPane.add(btnRojo);
		
		btnAzul = new JButton("Azul");
		btnAzul.setForeground(Color.WHITE);
		btnAzul.addActionListener(this);
		btnAzul.setBackground(new Color(0, 0, 102));
		btnAzul.setBounds(118, 161, 64, 28);
		contentPane.add(btnAzul);
		
		btnVerde = new JButton("Verde");
		btnVerde.setForeground(Color.WHITE);
		btnVerde.addActionListener(this);
		btnVerde.setBackground(new Color(0, 102, 0));
		btnVerde.setBounds(279, 163, 85, 25);
		contentPane.add(btnVerde);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setForeground(Color.WHITE);
		btnFondoRojo.addActionListener(this);
		btnFondoRojo.setBackground(new Color(153, 0, 51));
		btnFondoRojo.setBounds(150, 200, 117, 21);
		contentPane.add(btnFondoRojo);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setForeground(Color.WHITE);
		btnFondoAzul.addActionListener(this);
		btnFondoAzul.setBackground(new Color(0, 153, 255));
		btnFondoAzul.setBounds(279, 200, 112, 21);
		contentPane.add(btnFondoAzul);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setForeground(Color.WHITE);
		btnFondoVerde.addActionListener(this);
		btnFondoVerde.setBackground(new Color(0, 153, 102));
		btnFondoVerde.setBounds(12, 201, 131, 21);
		contentPane.add(btnFondoVerde);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(118, 233, 131, 21);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(24, 161, 85, 26);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
		
		etiTexto = new JTextPane();
		etiTexto.setForeground(Color.BLACK);
		etiTexto.setFont(new Font("DejaVu Serif", Font.ITALIC, 15));
		etiTexto.setText("       JAVA");
		etiTexto.setBounds(150, 62, 117, 28);
		contentPane.add(etiTexto);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRojo) {
			etiTexto.setForeground(Color.RED);
		}
		else if(e.getSource()==btnAzul) {
			etiTexto.setForeground(Color.BLUE);
		}
		else if(e.getSource()==btnVerde) {
			etiTexto.setForeground(Color.GREEN);	
		}
		else if(e.getSource()==btnFondoRojo) {
			etiTexto.setBackground(Color.RED);
		}
		else if(e.getSource()==btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);
		}
		else if(e.getSource()==btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);
		}
		else if(e.getSource()==btnTransparente) {
			etiTexto.setOpaque(false);
		}
		else if(e.getSource()==btnOpaca) {
			etiTexto.setOpaque(true);
		}
		
		
		
			
		
	}
}
