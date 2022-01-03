package EventosMouseposicionamiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;
	private JLabel lblNombre;
	private int tamaño=12;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,350);
		setTitle("Eventos del Mouse y posicionamiento");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
		
	}
	
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(210, 241, 90, 25);
		btnEsquina.addActionListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(210, 204, 90, 25);
		btnCentro.addActionListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(71, 204, 100, 25);
		btnAgrandar.addActionListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(71, 241, 100, 25);
		btnAchicar.addActionListener(this);
		contentPane.add(btnAchicar);
		
		lblNombre = new JLabel("Zharick ^w^");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Century Schoolbook L", Font.BOLD, 17));
		lblNombre.setBounds(136, 92, 136, 34);
		lblNombre.setPreferredSize(new Dimension(92, 136) );
		contentPane.add(lblNombre);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCentro) {
			lblNombre.setLocation(145,86);
			
		}
		else if (e.getSource()==btnEsquina) {
			lblNombre.setLocation(250 ,30);
			
		}
		else if (e.getSource()==btnAgrandar) {
			lblNombre.setSize(tamaño++, tamaño++);
			
			
		}
		else if (e.getSource()==btnAchicar) {
			lblNombre.setSize(tamaño--, tamaño--);
			
		}
		 
		
	}
}
