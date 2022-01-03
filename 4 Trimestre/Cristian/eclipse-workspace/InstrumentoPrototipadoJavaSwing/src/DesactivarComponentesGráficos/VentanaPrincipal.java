package DesactivarComponentesGráficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.UIManager;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JTextPane txtFrase;
	private JButton btnAceptar;
	private JButton btnActivar;
	private JButton btnDesactivar;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,370);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Desactivar componentes Gráficos");
		iniciarComponentes();
		
		
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtNombre.setBounds(172, 13, 131, 32);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNombre.setBounds(82, 18, 84, 27);
		contentPane.add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCiudad.setBounds(92, 62, 84, 27);
		contentPane.add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(172, 57, 131, 32);
		contentPane.add(txtCiudad);
		
		txtFrase = new JTextPane();
		txtFrase.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtFrase.setBounds(30, 113, 358, 32);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(138, 165, 117, 25);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(49, 248, 117, 25);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(206, 248, 117, 25);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAceptar) {
			txtFrase.setText("Su nombre es "+txtNombre.getText()+ " y vive en " + txtCiudad.getText()+". ");
			txtNombre.setText("");
			txtCiudad.setText("");
		}
		else if(e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);			
		}
		else if(e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);	
		}
		
		
	}
}
