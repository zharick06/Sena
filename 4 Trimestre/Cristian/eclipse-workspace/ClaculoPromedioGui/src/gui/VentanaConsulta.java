package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Procesos.Persona;
import Procesos.Procesos;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class VentanaConsulta extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JButton btnConsultar;
	private Procesos misProcesos;
	private JLabel lblDoc;
	private JTextPane textNombre;
	private JTextPane textnota1;
	private JTextPane textnota2;
	private JTextPane textnota3;
	private JTextPane textDoc;

	public VentanaConsulta() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 620, 372);
		setTitle("CONSULTAR");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
	}

	public void iniciarComponentes(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(null);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setBackground(Color.BLACK);
		panelPrincipal.setBounds(0, 12, 620, 335);
		contentPane.add(panelPrincipal);
		
		JLabel lblTitulo = new JLabel("CALCULAR PROMEDIO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("NanumSquare Bold", Font.BOLD | Font.ITALIC, 25));
		lblTitulo.setBounds(12, 12, 596, 24);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(25, 111, 70, 15);
		contentPane.add(lblNombre);
		
		textNombre = new JTextPane();
		textNombre.setForeground(Color.BLACK);
		textNombre.setBounds(95, 111, 348, 30);
		contentPane.add(textNombre);
		
		JLabel lblNota1 = new JLabel("Nota1:");
		lblNota1.setForeground(Color.WHITE);
		lblNota1.setBounds(25, 164, 70, 15);
		contentPane.add(lblNota1);
		
		textnota1 = new JTextPane();
		textnota1.setForeground(Color.BLACK);
		textnota1.setBounds(83, 158, 70, 30);
		contentPane.add(textnota1);
		
		JLabel lblNota2 = new JLabel("Nota2:");
		lblNota2.setForeground(Color.WHITE);
		lblNota2.setBounds(185, 164, 70, 15);
		contentPane.add(lblNota2);
		
		textnota2 = new JTextPane();
		textnota2.setForeground(Color.BLACK);
		textnota2.setBounds(244, 158, 70, 30);
		contentPane.add(textnota2);
		
		JLabel lblNota3 = new JLabel("Nota3:");
		lblNota3.setForeground(Color.WHITE);
		lblNota3.setBounds(332, 164, 70, 15);
		contentPane.add(lblNota3);
		
		textnota3 = new JTextPane();
		textnota3.setForeground(Color.BLACK);
		textnota3.setBounds(392, 158, 70, 30);
		contentPane.add(textnota3);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setHorizontalAlignment(SwingConstants.LEFT);
		lblPromedio.setForeground(Color.WHITE);
		lblPromedio.setFont(new Font("Dialog", Font.BOLD, 19));
		lblPromedio.setBounds(23, 200, 128, 30);
		contentPane.add(lblPromedio);
		
		JLabel lblrespromedio = new JLabel("");
		lblrespromedio.setForeground(Color.WHITE);
		lblrespromedio.setFont(new Font("Dialog", Font.BOLD, 16));
		lblrespromedio.setBounds(150, 200, 280, 30);
		contentPane.add(lblrespromedio);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setFont(new Font("Dialog", Font.BOLD, 19));
		lblResultado.setBounds(23, 242, 553, 30);
		contentPane.add(lblResultado);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.BLACK);
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(373, 205, 117, 25);
		contentPane.add(btnConsultar);
		
		lblDoc = new JLabel("Documento:");
		lblDoc.setForeground(Color.WHITE);
		lblDoc.setBounds(330, 49, 85, 15);
		contentPane.add(lblDoc);
		
		textDoc = new JTextPane();
		textDoc.setForeground(Color.BLACK);
		textDoc.setBounds(425, 44, 70, 30);
		contentPane.add(textDoc);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConsultar) { 
			Persona miEstudiante=misProcesos.obtenerEstudiantes(textDoc.getText());
			if (miEstudiante!=null) {
				textNombre.setText(miEstudiante.getNombre());
				textnota1.setText(miEstudiante.getNota1()+"");
				textnota2.setText(miEstudiante.getNota2()+"");
				textnota3.setText(miEstudiante.getNota3()+"");
				
			}else {
				JOptionPane.showMessageDialog(null, "Usuario no existe");
			}
			
		}
		
	}
	public void asignarProcesos(Procesos misProcesos) {
		this.misProcesos=misProcesos;
		
	}
}
