package Ventanas;

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
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextArea areaResultado;
	private JTextPane txtdocumento;
	private JTextPane txtNombre;
	private JTextPane txtEdad;
	private JTextPane txtPeso;
	private JTextPane txtTalla;
	private JButton btnCalcularimc;
	private JButton btnCalcularpromedio;
	private JButton btnRegistrar;
	private JButton btnListapersonas;
	Procesos misProcesos;

	public VentanaPrincipal() {
		misProcesos=new Procesos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(401,648);
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiTitulo = new JLabel("Registrar");
		etiTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		etiTitulo.setForeground(Color.BLACK);
		etiTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiTitulo.setBounds(106, 0, 189, 35);
		contentPane.add(etiTitulo);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(26, 87, 108, 15);
		contentPane.add(lblDocumento);
		
		txtdocumento = new JTextPane();
		txtdocumento.setBounds(118, 81, 230, 21);
		contentPane.add(txtdocumento);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(26, 120, 70, 15);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextPane();
		txtNombre.setBounds(94, 114, 230, 21);
		contentPane.add(txtNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(26, 157, 70, 15);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextPane();
		txtEdad.setBounds(72, 151, 98, 21);
		contentPane.add(txtEdad);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(26, 201, 70, 15);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextPane();
		txtPeso.setBounds(72, 195, 134, 21);
		contentPane.add(txtPeso);
		
		JLabel lblTalla = new JLabel("Talla:");
		lblTalla.setBounds(26, 243, 53, 15);
		contentPane.add(lblTalla);
		
		txtTalla = new JTextPane();
		txtTalla.setBounds(72, 237, 114, 21);
		contentPane.add(txtTalla);
		
		 btnCalcularimc = new JButton("CalcularIMC");
		btnCalcularimc.setBounds(12, 312, 117, 25);
		btnCalcularimc.addActionListener(this);
		contentPane.add(btnCalcularimc);
		
		btnCalcularpromedio = new JButton("CalcularPromedio");
		btnCalcularpromedio.setBounds(167, 312, 168, 25);
        btnCalcularpromedio.addActionListener(this);
		contentPane.add(btnCalcularpromedio);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(12, 363, 117, 25);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		btnListapersonas = new JButton("ListaPersonas");
		btnListapersonas.setBounds(181, 363, 155, 25);
		btnListapersonas.addActionListener(this);
		contentPane.add(btnListapersonas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 414, 304, 160);
		contentPane.add(scrollPane);
		
		areaResultado = new JTextArea();
		scrollPane.setViewportView(areaResultado);
		

	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnCalcularimc) {
			try {
				double talla=Double.parseDouble(txtTalla.getText());
				double peso=Double.parseDouble(txtPeso.getText());
				double MIC=peso/talla*talla;
				areaResultado.setText("su MIC es: "+MIC);
				
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Ingreso de texto", "ERROR",JOptionPane.ERROR_MESSAGE);
				
			} 
			
			
			
		}
		
		else if (e.getSource()==btnCalcularpromedio) {
			areaResultado.setText("El promedio de los MIC son: "+imprimirMIC());
			
			
			
		}
		
		else if (e.getSource()==btnListapersonas) {
			areaResultado.setText(imprimir());
			
		}

		
	    else if (e.getSource()==btnRegistrar) {		  
			Persona miPersona=new Persona();
			try {
				double talla=Double.parseDouble(txtTalla.getText());
				   double peso=Double.parseDouble(txtPeso.getText());
				    double MIC=peso/talla*talla;
				miPersona.setDocumento(txtdocumento.getText());
				miPersona.setNombre(txtNombre.getText());
				miPersona.setEdad(txtEdad.getText());
				miPersona.setPeso(Double.parseDouble(txtPeso.getText()));
				miPersona.setTalla(Double.parseDouble(txtTalla.getText()));
				miPersona.setMIC(MIC);
				misProcesos.guardarUsuario(miPersona);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Falta de datos", "ERROR",JOptionPane.ERROR_MESSAGE);
				
			} 
			
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Campo vacio", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		txtdocumento.setText("");
		txtEdad.setText("");
		txtNombre.setText("");
		txtPeso.setText("");
		txtTalla.setText("");
		
	}

	private Double imprimirMIC() {
		
		return misProcesos.imprimirPromedio() ;
	}


	private String imprimir() {
		return misProcesos.imprimirUsuario() ;
	}
	
	
}