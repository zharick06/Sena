package Vistas.VistasDialogo;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.Color;

public class VentanaConsulta extends JDialog  implements ActionListener{
	private final JPanel contentPanel = new JPanel();
	private Coordinador miCoordinador;
	private JTextField docuemtno;
	private JButton btnconsul ;
	private JTextArea textArea;

	
	public VentanaConsulta() {
		setBounds(100, 100, 476, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel consulta = new JLabel("CONSULTAR ");
			consulta.setBounds(130, 31, 168, 24);
			consulta.setHorizontalAlignment(SwingConstants.CENTER);
			consulta.setFont(new Font("Arial", Font.PLAIN, 20));
			contentPanel.add(consulta);
		}
		{
			JLabel lblNewLabel = new JLabel("Ingrese el Documento");
			lblNewLabel.setBounds(34, 105, 135, 24);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
			contentPanel.add(lblNewLabel);
		}
		{
			docuemtno = new JTextField();
			docuemtno.setBounds(190, 107, 168, 21);
			contentPanel.add(docuemtno);
			docuemtno.setColumns(10);
		}
		
		btnconsul = new JButton("consultar");
		btnconsul.setBounds(163, 154, 113, 21);
		btnconsul.addActionListener(this);
		contentPanel.add(btnconsul);
		{
			textArea = new JTextArea();
			textArea.setBounds(12, 194, 452, 57);
			contentPanel.add(textArea);
		}
		
			
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnconsul) {
			textArea.setText("");
			
		}
		
	}
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}
}