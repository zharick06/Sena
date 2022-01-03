package Ventanas;



import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Procesos.vo.Paciente;
import Procesos.Procesos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class VentanaRegistro extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextPane txtpnNombreempre;
	private JButton btnCostoTotal;
	private JLabel lblTotal;
	private JTextPane txtpnCostom;
	private JTextPane txtpnDiash;
	private JComboBox tratamiento;
	private JRadioButton rdbtnMinero;
	private JRadioButton rdbtnOperario;
	private JTextPane txtpnTelefono;
	private JTextPane txtpnDireccion;
	private JTextPane txtpnNombrepaci;
	private JTextPane txtpnDocumento;
	private ButtonGroup radios;
	Procesos misProcesos;
	private JButton okButton;
	private JButton cancelButton;
	Coordinador micoordinador;

	public VentanaRegistro() {
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setTitle("Registrarse");
		misProcesos=new Procesos();
		micoordinador=new Coordinador();
		setBounds(100, 100, 565, 472);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(Color.WHITE);
		contentPanel.setBackground(SystemColor.desktop);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombreEmp = new JLabel("Nombre de la Empresa:");
		lblNombreEmp.setForeground(Color.WHITE);
		lblNombreEmp.setBounds(23, 29, 278, 21);
		contentPanel.add(lblNombreEmp);
		
		txtpnNombreempre = new JTextPane();
		txtpnNombreempre.setBackground(Color.BLACK);
		txtpnNombreempre.setForeground(Color.WHITE);
		txtpnNombreempre.setBounds(200, 29, 278, 21);
		contentPanel.add(txtpnNombreempre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setForeground(Color.WHITE);
		lblDocumento.setBounds(23, 62, 139, 21);
		contentPanel.add(lblDocumento);
		
		txtpnDocumento = new JTextPane();
		txtpnDocumento.setBackground(Color.BLACK);
		txtpnDocumento.setForeground(Color.WHITE);
		txtpnDocumento.setBounds(119, 62, 164, 21);
		contentPanel.add(txtpnDocumento);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo:");
		lblNombreCompleto.setForeground(Color.WHITE);
		lblNombreCompleto.setBounds(23, 95, 149, 15);
		contentPanel.add(lblNombreCompleto);
		
		txtpnNombrepaci = new JTextPane();
		txtpnNombrepaci.setForeground(Color.WHITE);
		txtpnNombrepaci.setBackground(Color.BLACK);
		txtpnNombrepaci.setBounds(162, 89, 340, 21);
		contentPanel.add(txtpnNombrepaci);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(23, 128, 70, 15);
		contentPanel.add(lblDireccion);
		
		txtpnDireccion = new JTextPane();
		txtpnDireccion.setBackground(Color.BLACK);
		txtpnDireccion.setForeground(Color.WHITE);
		txtpnDireccion.setBounds(100, 122, 224, 21);
		contentPanel.add(txtpnDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(23, 155, 70, 15);
		contentPanel.add(lblTelefono);
		
		txtpnTelefono = new JTextPane();
		txtpnTelefono.setForeground(Color.WHITE);
		txtpnTelefono.setBackground(Color.BLACK);
		txtpnTelefono.setBounds(98, 155, 139, 21);
		contentPanel.add(txtpnTelefono);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setBounds(23, 189, 70, 15);
		contentPanel.add(lblTipo);
		
		radios=new ButtonGroup();
		
		rdbtnOperario = new JRadioButton("Operario");
		rdbtnOperario.setForeground(Color.WHITE);
		rdbtnOperario.setBackground(SystemColor.desktop);
		rdbtnOperario.setBounds(70, 184, 149, 23);
		contentPanel.add(rdbtnOperario);
		
		rdbtnMinero = new JRadioButton("Minero");
		rdbtnMinero.setBackground(SystemColor.desktop);
		rdbtnMinero.setForeground(Color.WHITE);
		rdbtnMinero.setBounds(70, 206, 149, 23);
		contentPanel.add(rdbtnMinero);
		
		radios.add(rdbtnOperario);
		radios.add(rdbtnMinero);
		
		String arreglo[]=new String[] {"neumoconiosis","Vértigo", "Problemas respiratorios"};
		tratamiento = new JComboBox<String>();
		tratamiento.setBackground(Color.BLACK);
		tratamiento.setForeground(Color.WHITE);
		tratamiento.setBounds(125, 237, 200, 24);
		tratamiento.setModel(new DefaultComboBoxModel<>(arreglo));
		tratamiento.addActionListener(this);
		contentPanel.add(tratamiento);
		
		JLabel lblTratamiento = new JLabel("Tratamiento:");
		lblTratamiento.setForeground(Color.WHITE);
		lblTratamiento.setBounds(23, 233, 101, 19);
		contentPanel.add(lblTratamiento);
		
		JLabel lblDiasHospitalizacion = new JLabel("Dias de Hospitalizacion:");
		lblDiasHospitalizacion.setForeground(Color.WHITE);
		lblDiasHospitalizacion.setBounds(23, 291, 186, 15);
		contentPanel.add(lblDiasHospitalizacion);
		
		txtpnDiash = new JTextPane();
		txtpnDiash.setBackground(Color.BLACK);
		txtpnDiash.setForeground(Color.WHITE);
		txtpnDiash.setBounds(200, 291, 124, 21);
		contentPanel.add(txtpnDiash);
		
		JLabel lblCostoDeLos = new JLabel("Costo de los Medicamentos:");
		lblCostoDeLos.setForeground(Color.WHITE);
		lblCostoDeLos.setBounds(23, 327, 214, 15);
		contentPanel.add(lblCostoDeLos);
		
		 txtpnCostom = new JTextPane();
		 txtpnCostom.setForeground(Color.WHITE);
		 txtpnCostom.setBackground(Color.BLACK);
		txtpnCostom.setBounds(234, 321, 115, 21);
		contentPanel.add(txtpnCostom);
		
		btnCostoTotal = new JButton("Costo Total");
		btnCostoTotal.setBackground(new Color(60, 179, 113));
		btnCostoTotal.setForeground(Color.WHITE);
		btnCostoTotal.setHorizontalAlignment(SwingConstants.LEFT);
		btnCostoTotal.setBounds(23, 354, 115, 25);
		btnCostoTotal.addActionListener(this);
		contentPanel.add(btnCostoTotal);
		
		lblTotal = new JLabel("");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblTotal.setBounds(162, 354, 224, 25);
		contentPanel.add(lblTotal);
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
	
	public void setCoordinador(Coordinador micoordinador) {
		this.micoordinador=micoordinador;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if (e.getSource()==okButton) {
			Guardardatos();
			txtpnCostom.setText("");
			txtpnDiash.setText("");
			txtpnDireccion.setText("");
			txtpnDocumento.setText("");
			txtpnNombreempre.setText("");
			txtpnTelefono.setText("");
			txtpnNombrepaci.setText("");
		}
		else if (e.getSource()==btnCostoTotal) {
		   procesos();	
			
		}
		
		else if (e.getSource()==cancelButton) {
			this.dispose();
			
		}
	}

	private void procesos() {
		try {
			int tratamientos=tratamiento.getSelectedIndex();
			String tipo=vDescuento();
			int dias=Integer.parseInt(txtpnDiash.getText());
			int costoF=Integer.parseInt(txtpnCostom.getText());
			double result= micoordinador.calculaTotal(tratamientos, tipo, dias, costoF);
			lblTotal.setText("Total a pagar: "+ result);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Falta de datos", "ERROR",JOptionPane.ERROR_MESSAGE);
			
		} 
		
		
		
	}

	private void Guardardatos() {
		Paciente miPaciente=new Paciente();
		miPaciente.setNombreE(txtpnNombreempre.getText());
		miPaciente.setNombreP(txtpnNombrepaci.getText());
		miPaciente.setDireccion(txtpnDireccion.getText());
		miPaciente.setTelefono(txtpnTelefono.getText());
		miPaciente.setTipo(vDescuento());
		try {
			
			miPaciente.setTratamiento((String) tratamiento.getSelectedItem());
	        miPaciente.setDocumento(txtpnDocumento.getText());
			miPaciente.setDiaH(Double.parseDouble(txtpnDiash.getText()));
			miPaciente.setCostoM(Double.parseDouble(txtpnCostom.getText()));
			 micoordinador.guardarUsuario(miPaciente);
           
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ingreso de texto", "ERROR",JOptionPane.ERROR_MESSAGE);
			
		} 
	}
		
	private String vDescuento() {
		String valorT = "" ;
		if (rdbtnOperario.isSelected()) {
			valorT="Operario";
			} 
		else if (rdbtnMinero.isSelected()) {
			valorT="Minero";
			}
		return valorT;
		}




	




	
}
