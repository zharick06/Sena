package Interfaces;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Procesos.Evento;
import Procesos.Procesos;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class VentanaEventos extends JFrame implements ActionListener {

	private JPanel panelPrincipal;
	private JTextField textnombre;
	private JTextField textcodigo;
	private JTextField textlugar;
	private JTextField textexpositores;
	private JTextField textparticipantes;
	private JTextField textrefrigerios;
	private JTextField texttemas;
	private JButton btnAgendar;
	
	 Procesos misProcesos;
	 private JButton btnVerEventos;
	 private JButton btnConsultarEvento;


	public VentanaEventos() {
		misProcesos= new Procesos();
		setSize( 520, 572);
		setTitle("EVENTOS");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
	}
	public void iniciarComponentes() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(UIManager.getColor("ComboBox.buttonShadow"));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblTitulo = new JLabel("AGENDAR EVENTO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(113, 12, 275, 48);
		panelPrincipal.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNombre.setBounds(105, 76, 84, 28);
		panelPrincipal.add(lblNombre);
		
		textnombre = new JTextField();
		textnombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		textnombre.setForeground(Color.WHITE);
		textnombre.setBounds(178, 76, 194, 28);
		panelPrincipal.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblCodigo.setBounds(105, 125, 84, 28);
		panelPrincipal.add(lblCodigo);
		
		textcodigo = new JTextField();
		textcodigo.setFont(new Font("Dialog", Font.PLAIN, 14));
		textcodigo.setColumns(10);
		textcodigo.setForeground(Color.WHITE);
		textcodigo.setBounds(178, 126, 194, 28);
		panelPrincipal.add(textcodigo);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setForeground(Color.WHITE);
		lblLugar.setFont(new Font("Dialog", Font.BOLD, 12));
		lblLugar.setBounds(105, 165, 84, 28);
		panelPrincipal.add(lblLugar);
		
		textlugar = new JTextField();
		textlugar.setFont(new Font("Dialog", Font.PLAIN, 14));
		textlugar.setForeground(Color.WHITE);
		textlugar.setColumns(10);
		textlugar.setBounds(178, 165, 194, 28);
		panelPrincipal.add(textlugar);
		
		JLabel lblExpositores = new JLabel("Numero de Expositores:");
		lblExpositores.setForeground(Color.WHITE);
		lblExpositores.setFont(new Font("Dialog", Font.BOLD, 12));
		lblExpositores.setBounds(105, 203, 180, 28);
		panelPrincipal.add(lblExpositores);
		
		textexpositores = new JTextField();
		textexpositores.setFont(new Font("Dialog", Font.PLAIN, 14));
		textexpositores.setForeground(Color.WHITE);
		textexpositores.setColumns(10);
		textexpositores.setBounds(289, 203, 89, 28);
		panelPrincipal.add(textexpositores);
		
		JLabel lblParticipantes = new JLabel("Numero de Participantes:");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblParticipantes.setBounds(105, 243, 207, 28);
		panelPrincipal.add(lblParticipantes);
		
		textparticipantes = new JTextField();
		textparticipantes.setFont(new Font("Dialog", Font.PLAIN, 14));
		textparticipantes.setForeground(Color.WHITE);
		textparticipantes.setColumns(10);
		textparticipantes.setBounds(299, 243, 89, 28);
		panelPrincipal.add(textparticipantes);
		
		JLabel lblRefrigerio = new JLabel("Refrigerios:");
		lblRefrigerio.setForeground(Color.WHITE);
		lblRefrigerio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblRefrigerio.setBounds(105, 282, 84, 28);
		panelPrincipal.add(lblRefrigerio);
		
		textrefrigerios = new JTextField();
		textrefrigerios.setFont(new Font("Dialog", Font.PLAIN, 14));
		textrefrigerios.setForeground(Color.WHITE);
		textrefrigerios.setColumns(10);
		textrefrigerios.setBounds(194, 283, 194, 28);
		panelPrincipal.add(textrefrigerios);
		
		JLabel lblTemas = new JLabel("Temas:");
		lblTemas.setForeground(Color.WHITE);
		lblTemas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTemas.setBounds(105, 326, 84, 28);
		panelPrincipal.add(lblTemas);
		
		texttemas = new JTextField();
		texttemas.setFont(new Font("Dialog", Font.PLAIN, 14));
		texttemas.setForeground(Color.WHITE);
		texttemas.setColumns(10);
		texttemas.setBounds(178, 327, 194, 28);
		panelPrincipal.add(texttemas);
		
		
		
		btnAgendar = new JButton("Agendar");
		btnAgendar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAgendar.setForeground(Color.BLACK);
		btnAgendar.setBounds(197, 386, 117, 25);
		btnAgendar.addActionListener(this);
		panelPrincipal.add(btnAgendar);
		
		btnVerEventos = new JButton("Ver eventos");
		btnVerEventos.setForeground(Color.BLACK);
		btnVerEventos.setFont(new Font("Dialog", Font.BOLD, 12));
		btnVerEventos.addActionListener(this);
		btnVerEventos.setBounds(101, 451, 146, 25);
		panelPrincipal.add(btnVerEventos);
		
		btnConsultarEvento = new JButton("Consultar Evento");
		btnConsultarEvento.setForeground(Color.BLACK);
		btnConsultarEvento.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConsultarEvento.addActionListener(this);
		btnConsultarEvento.setBounds(259, 451, 180, 25);
		panelPrincipal.add(btnConsultarEvento);
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAgendar) {
			guardarEvento();
			textexpositores.setText("");
			textlugar.setText("");
			textnombre.setText("");
			textparticipantes.setText("");
			textrefrigerios.setText("");
			texttemas.setText("");
			textcodigo.setText("");
			
			
		}
		else if (e.getSource()==btnVerEventos) {
			misProcesos.imprimirEventos();
			
		}
		else if(e.getSource()==btnConsultarEvento) {
			VentanaConsultar miVentanaConsulta=new VentanaConsultar();
			miVentanaConsulta.asignarProcesos(misProcesos);
			miVentanaConsulta.setVisible(true);
			
		}
		
		
	}
	private void guardarEvento() {
		Evento miEvento=new Evento();
		try {

			miEvento.setNombre(textnombre.getText());
			miEvento.setCodigo(textcodigo.getText());
			miEvento.setLugar(textlugar.getText());
			miEvento.setParticipantes(Integer.parseInt(textparticipantes.getText()));
			miEvento.setExpositores(Integer.parseInt(textexpositores.getText()));
			miEvento.setRefrigerios(textrefrigerios.getText());
			miEvento.setTemas(texttemas.getText());	
			
			misProcesos.registrarEvento(miEvento);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Campo vacio", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
}
