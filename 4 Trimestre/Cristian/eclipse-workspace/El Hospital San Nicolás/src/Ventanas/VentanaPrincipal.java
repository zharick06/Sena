package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnRegistrar;
	private JButton btnConsultar;
	private Coordinador micoordinador;


	public VentanaPrincipal() {
		setFont(new Font("DialogInput", Font.BOLD, 14));
		setForeground(SystemColor.text);
		setBackground(SystemColor.activeCaptionText);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,303);
		setTitle("Hospital San Nicolas");
		setLocationRelativeTo(null);
		setResizable(false);
		componentes();
	}

	private void componentes() {
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRegistrar = new JButton("Registrar Persona");
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(Color.BLACK);
		btnRegistrar.setBounds(61, 54, 176, 35);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		
		btnConsultar = new JButton("Consultar persona");
		btnConsultar.setBackground(Color.BLACK);
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBounds(61, 128, 176, 35);
		btnConsultar.addActionListener(this);
		contentPane.add(btnConsultar);
		
	}

	public void setCoordinador(Coordinador micoordinador) {
		this.micoordinador=micoordinador;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnRegistrar) {
			micoordinador.mostrarVentanaRegistro();
			
		
			
		}
		else if (e.getSource()==btnConsultar) {
			micoordinador.mostrarVentanaConsulta();
			
			
		}
		
		
	}


}
