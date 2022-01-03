package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Procesos.Persona;
import Procesos.Procesos;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

public class VentanaOperaciones extends JFrame implements ActionListener  {

	private JPanel panelPrincipal;
	private JButton btnCalcular;
	private JTextPane textnota3;
	private JTextPane textnota2;
	private JTextPane textNombre;
	private JTextPane textnota1;
	private JLabel lblrespromedio;
	private JLabel lblResultado;
	private JButton btnImprimirTotal;
	private JButton btnConsultar;

	
	Procesos misProcesos;
	private JLabel lblDocumento;
	private JTextPane textdocumento;


	public VentanaOperaciones() {
		misProcesos= new Procesos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 620, 372);
		setTitle("CALCULAR PROMEDIO");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
		
	}
	private void iniciarComponentes() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(0, 0, 0));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(null);
		setContentPane(panelPrincipal);
		
		JLabel lblTitulo = new JLabel("CALCULAR PROMEDIO");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("NanumSquare Bold", Font.BOLD | Font.ITALIC, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(23, 0, 596, 24);
		panelPrincipal.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(23, 73, 70, 15);
		panelPrincipal.add(lblNombre);
		
		textNombre = new JTextPane();
		textNombre.setForeground(Color.black);
		textNombre.setBounds(93, 73, 248, 30);
		panelPrincipal.add(textNombre);
		
		JLabel lblNota1 = new JLabel("Nota1:");
		lblNota1.setForeground(new Color(255, 255, 255));
		lblNota1.setBounds(23, 126, 70, 15);
		panelPrincipal.add(lblNota1);
		
		textnota1 = new JTextPane();
		textnota1.setForeground(Color.BLACK);
		textnota1.setBounds(81, 120, 70, 30);
		panelPrincipal.add(textnota1);
		
		JLabel lblNota2 = new JLabel("Nota2:");
		lblNota2.setForeground(new Color(255, 255, 255));
		lblNota2.setBounds(183, 126, 70, 15);
		panelPrincipal.add(lblNota2);
		
		textnota2 = new JTextPane();
		textnota2.setForeground(Color.BLACK);
		textnota2.setBounds(242, 120, 70, 30);
		panelPrincipal.add(textnota2);
		
		JLabel lblNota3 = new JLabel("Nota3:");
		lblNota3.setForeground(new Color(255, 255, 255));
		lblNota3.setBounds(330, 126, 70, 15);
		panelPrincipal.add(lblNota3);
		
	    textnota3 = new JTextPane();
		textnota3.setForeground(Color.BLACK);
		textnota3.setBounds(390, 120, 70, 30);
		panelPrincipal.add(textnota3);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setHorizontalAlignment(SwingConstants.LEFT);
		lblPromedio.setForeground(new Color(255, 255, 255));
		lblPromedio.setFont(new Font("Dialog", Font.BOLD, 19));
		lblPromedio.setBounds(23, 200, 128, 30);
		panelPrincipal.add(lblPromedio);
		
	    lblrespromedio = new JLabel("");
	    lblrespromedio.setFont(new Font("Dialog", Font.BOLD, 16));
		lblrespromedio.setForeground(Color.white);
		lblrespromedio.setBounds(150, 200, 280, 30);
		panelPrincipal.add(lblrespromedio);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setFont(new Font("Dialog", Font.BOLD, 19));
		lblResultado.setBounds(23, 242, 553, 30);
		panelPrincipal.add(lblResultado);
		
	    btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(Color.WHITE);
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setBounds(400, 162, 117, 25);
		btnCalcular.addActionListener(this);
		panelPrincipal.add(btnCalcular);
		
		btnImprimirTotal = new JButton("Imprimir total");
		btnImprimirTotal.setBackground(Color.WHITE);
		btnImprimirTotal.addActionListener(this);
		btnImprimirTotal.setBounds(312, 280, 129, 30);
		panelPrincipal.add(btnImprimirTotal);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.setBounds(462, 280, 129, 30);
		btnConsultar.addActionListener(this);
		panelPrincipal.add(btnConsultar);
		
		lblDocumento = new JLabel("Documento:");
		lblDocumento.setForeground(Color.WHITE);
		lblDocumento.setBounds(374, 79, 103, 15);
		panelPrincipal.add(lblDocumento);
		
		textdocumento = new JTextPane();
		textdocumento.setForeground(Color.BLACK);
		textdocumento.setBounds(465, 73, 70, 30);
		panelPrincipal.add(textdocumento);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnCalcular) {
			calcularPromedio();
		}
		else if (e.getSource()== btnImprimirTotal) {
			misProcesos.imprimirListaEstudiantes();
		}
		else if (e.getSource()== btnConsultar) {
			VentanaConsulta miVentanaConsulta = new VentanaConsulta();
			miVentanaConsulta.asignarProcesos(misProcesos);
			miVentanaConsulta.setVisible(true);
		}
		
		
	}
	private void calcularPromedio() {
		
		Persona estudiante=new Persona();
		estudiante.setNombre(textNombre.getText());
		estudiante.setDocumento(textdocumento.getText());
		
		try {
			
			estudiante.setNota1(Double.parseDouble(textnota1.getText()));
			estudiante.setNota2(Double.parseDouble(textnota2.getText()));
			estudiante.setNota3(Double.parseDouble(textnota3.getText()));
						
			//double prom=misProcesos.calculaPromedio(estudiante);
			estudiante.setPromedio(misProcesos.calculaPromedio(estudiante));
			
			lblrespromedio.setText(estudiante.getPromedio() + "");
			String resultado=misProcesos.calcularDefinitiva(estudiante.getPromedio());
			
			misProcesos.registrarEnBD(estudiante);
			
			
			if (resultado.equals("Gana")) {
				lblResultado.setText("Gana la materia");
				lblResultado.setForeground(Color.GREEN);
				
			}
			else {
				lblResultado.setText("Pierde la materia");
				lblResultado.setForeground(Color.RED);
				
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ingreso de texto", "ERROR",JOptionPane.ERROR_MESSAGE);
			
		} 
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Verifique los datos", "ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		
		
	}
}
