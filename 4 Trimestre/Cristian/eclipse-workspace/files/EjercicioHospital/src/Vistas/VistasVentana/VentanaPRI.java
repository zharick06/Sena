package Vistas.VistasVentana;
import Controlador.Relaciones;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;


import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaPRI extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JButton btnConsultar;
	private JButton btnRegistrar;
	private Coordinador miCoordinador;


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	public VentanaPRI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inicio();
	}
		private void inicio() {
		btnRegistrar = new JButton("Registro");
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setBounds(88, 128, 117, 52);
		contentPane.add(btnRegistrar);
		btnRegistrar.addActionListener(this);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnConsultar.setForeground(Color.BLACK);
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.setBounds(293, 128, 117, 52);
		contentPane.add(btnConsultar);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(155, 45, 187, 18);
		contentPane.add(lblNewLabel);
		btnConsultar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnConsultar) {
			miCoordinador.mostrarConsulta();
		}
		else if (e.getSource()==btnRegistrar) {
			miCoordinador.mostrarRegistro();
		}
		
	}

		
	

}
