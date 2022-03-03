package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnUsuarios;
	private JButton btnFondos;
	private JButton btnEventos;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setTitle("Fundación Alexander Von Cáceres");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarProcesos();
		
	
	}
	public void iniciarProcesos() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setBounds(98, 44, 117, 25);
		btnUsuarios.addActionListener(this);
		contentPane.add(btnUsuarios);
		
		btnFondos = new JButton("Fondos");
		btnFondos.setBounds(98, 108, 117, 25);
		btnFondos.addActionListener(this);
		contentPane.add(btnFondos);
		
		btnEventos = new JButton("Eventos");
		btnEventos.setBounds(98, 175, 117, 25);
		btnEventos.addActionListener(this);
		contentPane.add(btnEventos);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnEventos) {
			VentanaEventos miVentanaE = new VentanaEventos();
			miVentanaE.setVisible(true);
			
		}
		
		else if (e.getSource()==btnUsuarios) {
			VentanaRegistroUsuario miVentanaU=new VentanaRegistroUsuario();
			miVentanaU.setVisible(true);
			
		}
		
	}
}
