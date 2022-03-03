package Interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Procesos.Procesos;
import Procesos.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaRegistroUsuario extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextPane textTelefono;
	private JLabel lblTelefono;
	private JTextPane textGenero;
	private JLabel lblGenero;
	private JTextPane textDocumento;
	private JLabel lblDocumento;
	private JTextPane textNombre;
	private JLabel lblNombre;
	private JLabel lblDireccion;
	private JTextPane textDireccion;
	private JTextPane textCorreo;
	private JLabel lblCorreo;
	private JLabel lblRegistrar;
	private JButton btnRegistrar;
	Procesos misProcesos;
	private JButton btnEditarUsuario;
	private JButton btnVerUsuarios;

	public VentanaRegistroUsuario() {
		misProcesos=new Procesos();
		setSize(450,450);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Registrar usuario");
		iniciarComponentes();
		
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(UIManager.getColor("ComboBox.buttonShadow"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(49, 68, 70, 24);
		contentPane.add(lblNombre);
		
		textNombre = new JTextPane();
		textNombre.setBounds(113, 71, 249, 21);
		contentPane.add(textNombre);
		
		lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(49, 104, 85, 24);
		contentPane.add(lblDocumento);
		
		textDocumento = new JTextPane();
		textDocumento.setBounds(141, 107, 221, 21);
		contentPane.add(textDocumento);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(49, 140, 70, 24);
		contentPane.add(lblGenero);
		
		textGenero = new JTextPane();
		textGenero.setBounds(113, 143, 249, 21);
		contentPane.add(textGenero);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(49, 176, 70, 24);
		contentPane.add(lblTelefono);
		
		textTelefono = new JTextPane();
		textTelefono.setBounds(123, 176, 239, 21);
		contentPane.add(textTelefono);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(49, 212, 70, 24);
		contentPane.add(lblDireccion);
		
		textDireccion = new JTextPane();
		textDireccion.setBounds(133, 215, 229, 21);
		contentPane.add(textDireccion);
		
		textCorreo = new JTextPane();
		textCorreo.setBounds(113, 251, 249, 21);
		contentPane.add(textCorreo);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(49, 248, 70, 24);
		contentPane.add(lblCorreo);
		
		lblRegistrar = new JLabel("Registrar");
		lblRegistrar.setForeground(Color.BLACK);
		lblRegistrar.setFont(new Font("DejaVu Serif", Font.ITALIC, 19));
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setBounds(141, 22, 141, 33);
		contentPane.add(lblRegistrar);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(157, 307, 117, 25);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		btnVerUsuarios = new JButton("Ver Usuarios ");
		btnVerUsuarios.setBounds(49, 364, 141, 25);
		btnVerUsuarios.addActionListener(this);
		contentPane.add(btnVerUsuarios);
		
		btnEditarUsuario = new JButton("Editar Usuario");
		btnEditarUsuario.setBounds(224, 364, 148, 24);
		btnEditarUsuario.addActionListener(this);
		contentPane.add(btnEditarUsuario);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRegistrar) {
			guardarUsuario();
			textNombre.setText("");
			textDocumento.setText("");
			textTelefono.setText("");
			textCorreo.setText("");
			textDireccion.setText("");
			textGenero.setText("");
			
		}
		else if (e.getSource()==btnVerUsuarios) {
			misProcesos.imprimirUsuarios();
			
		}
		else if (e.getSource()==btnEditarUsuario) {
		
			
		}
		
	}
	
	
	
	private void guardarUsuario() {
		Usuario miUsuario = new Usuario();
		
		if (textNombre.getText().length()>0 || textTelefono.getText().length()>0 || textCorreo.getText().length()>0 || textDireccion.getText().length()>0 
				|| textDocumento.getText().length()>0 || textCorreo.getText().length()>0) {
			miUsuario.setNombre(textNombre.getText());
			miUsuario.setTelefono(textTelefono.getText());
			miUsuario.setGenero(textGenero.getText());
			miUsuario.setDocumento(textDocumento.getText());
			miUsuario.setDireccion(textDireccion.getText());
			miUsuario.setCorreo(textCorreo.getText());
			misProcesos.registrarUsuario(miUsuario);
		}
		else {
			JOptionPane.showMessageDialog(null, "Campo vacio", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
}
