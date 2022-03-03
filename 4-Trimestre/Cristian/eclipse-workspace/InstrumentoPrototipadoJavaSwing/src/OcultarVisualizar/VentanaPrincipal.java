package OcultarVisualizar;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton btnOcultarNombre;
	private JButton btnVisuNombre;
	private JButton btnVisuCiudad;
	private JButton btnOcultarCiudad;


	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 400, 352);
		setTitle("Ocultar y Visulizar");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarcontenido();
		
	}
	public void iniciarcontenido() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ComboBox.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Zharick Martinez R.");
		etiNombre.setFont(new Font("Dialog", Font.BOLD, 17));
		etiNombre.setBounds(132, 50, 193, 25);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Circasia Quindio");
		etiCiudad.setFont(new Font("Dialog", Font.BOLD, 17));
		etiCiudad.setBounds(131, 69, 193, 51);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(193, 158, 145, 25);
		btnOcultarNombre.setBackground(UIManager.getColor("List.dropLineColor"));
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		btnVisuNombre = new JButton("Mostrar Nombre");
		btnVisuNombre.setBackground(UIManager.getColor("List.dropLineColor"));
		btnVisuNombre.setBounds(26, 158,154,25);
		btnVisuNombre.addActionListener(this);
		contentPane.add(btnVisuNombre);
		
		btnVisuCiudad = new JButton("Mostrar Ciudad");
		btnVisuCiudad.setBackground(UIManager.getColor("List.dropLineColor"));
		btnVisuCiudad.setBounds(24, 195, 156, 25);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
		
		btnOcultarCiudad = new JButton("Ocultar Nombre");
		btnOcultarCiudad.setBackground(UIManager.getColor("List.dropLineColor"));
		btnOcultarCiudad.setBounds(193, 195, 145, 25);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);		
		}
		else if(e.getSource()==btnVisuNombre){
			etiNombre.setVisible(true);
		}
		else if(e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}
		else if(e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
	
		
	}
	
}
