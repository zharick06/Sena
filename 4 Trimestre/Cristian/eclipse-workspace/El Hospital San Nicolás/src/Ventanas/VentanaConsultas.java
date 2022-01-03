package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Procesos.vo.Paciente;

import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.SystemColor;

public class VentanaConsultas extends JDialog implements ActionListener{
	private final JPanel contentPanel = new JPanel();
	private Coordinador miCoordinador;
	private JTextField documento;
	private JButton btnConsultar ;
	private JTextArea textArea;
	private Paciente miPaciente;
	private JButton okButton;
	private JButton cancelButton;

	
	public VentanaConsultas() {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setTitle("Consultar");
		setBounds(100, 100, 473, 404);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.desktop);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel consulta = new JLabel("CONSULTAR ");
			consulta.setForeground(Color.WHITE);
			consulta.setBounds(130, 19, 168, 24);
			consulta.setHorizontalAlignment(SwingConstants.CENTER);
			consulta.setFont(new Font("Dialog", Font.PLAIN, 22));
			contentPanel.add(consulta);
		}
		{
			JLabel lblNewLabel = new JLabel("Ingrese el Documento:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(120, 74, 198, 24);
			lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
			contentPanel.add(lblNewLabel);
		}
		{
			documento = new JTextField();
			documento.setHorizontalAlignment(SwingConstants.LEFT);
			documento.setForeground(Color.WHITE);
			documento.setBackground(Color.BLACK);
			documento.setBounds(130, 100, 168, 21);
			contentPanel.add(documento);

		}
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(Color.BLACK);
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBounds(163, 154, 113, 21);
		btnConsultar.addActionListener(this);
		contentPanel.add(btnConsultar);
		{
			textArea = new JTextArea();
			textArea.setForeground(Color.WHITE);
			textArea.setBackground(Color.BLACK);
			textArea.setBounds(12, 187, 452, 112);
			contentPanel.add(textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setForeground(Color.BLACK);
				okButton.setBackground(new Color(0, 128, 0));
				okButton.setActionCommand("OK");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
			    cancelButton = new JButton("Cancel");
			    cancelButton.setBackground(new Color(165, 42, 42));
			    cancelButton.setForeground(Color.WHITE);
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(this);
				buttonPane.add(cancelButton);
			}
		}
		
	}
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}
	public void setPaciente(Paciente miPaciente) {
		this.miPaciente=miPaciente;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConsultar) {
			
			String result=miCoordinador.imprimirDatos(documento.getText() );
			textArea.setText(result+"");	
		}
		
		else if (e.getSource()==okButton) {
			this.dispose();
			
		}
		else if (e.getSource()==cancelButton) {
			textArea.setText("");
			documento.setText("");
			
		}
		
	}
}

