package Vistas.VistasDialogo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Coordinador;
import Modelo.ModeloVo.MinerosVo;




import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaRegistro extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private Coordinador miCoordinador;
	private JButton btnRegistrar;
	private JTextField textEmpresa;
	private JLabel lbldocumento;
	private JTextField textPaciente;
	private JLabel lblNombre;
	private JTextField textNombre;
	private JLabel lblDireccion;
	private JTextField textDireccion;
	private JLabel lblTelefono;
	private JTextField textTelefono;
	private JLabel REGISTRO;
	private JRadioButton rdbtnOperario;
	private JLabel lblNewLabel;
	private JRadioButton groupbtn;
	private JComboBox comboBox;
	private JTextField hopitalizacion;
	private JTextField textField;


	public VentanaRegistro() {
		setBounds(100, 100, 627, 435);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textEmpresa = new JTextField();
			textEmpresa.setBounds(151, 86, 138, 19);
			contentPanel.add(textEmpresa);
			textEmpresa.setColumns(10);
		}
		
		JLabel lblempresa = new JLabel("Nombre de la empresa");
		lblempresa.setFont(new Font("Arial", Font.PLAIN, 12));
		lblempresa.setBounds(13, 86, 128, 19);
		contentPanel.add(lblempresa);
		{
			lbldocumento = new JLabel("Documento Paciente");
			lbldocumento.setFont(new Font("Arial", Font.PLAIN, 12));
			lbldocumento.setBounds(13, 115, 128, 19);
			contentPanel.add(lbldocumento);
		}
		{
			textPaciente = new JTextField();
			textPaciente.setColumns(10);
			textPaciente.setBounds(151, 115, 138, 19);
			contentPanel.add(textPaciente);
		}
		{
			lblNombre = new JLabel("Nombre Paciente");
			lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNombre.setBounds(313, 86, 128, 19);
			contentPanel.add(lblNombre);
		}
		{
			textNombre = new JTextField();
			textNombre.setColumns(10);
			textNombre.setBounds(427, 86, 138, 19);
			contentPanel.add(textNombre);
		}
		{
			lblDireccion = new JLabel("Direccion Paciente");
			lblDireccion.setFont(new Font("Arial", Font.PLAIN, 12));
			lblDireccion.setBounds(313, 115, 128, 19);
			contentPanel.add(lblDireccion);
		}
		{
			textDireccion = new JTextField();
			textDireccion.setColumns(10);
			textDireccion.setBounds(427, 115, 138, 19);
			contentPanel.add(textDireccion);
		}
		{
			lblTelefono = new JLabel("Telefono Paciente");
			lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
			lblTelefono.setBounds(13, 154, 128, 19);
			contentPanel.add(lblTelefono);
		}
		{
			textTelefono = new JTextField();
			textTelefono.setColumns(10);
			textTelefono.setBounds(151, 154, 138, 19);
			contentPanel.add(textTelefono);
		}
		
		rdbtnOperario = new JRadioButton("Operario");
		rdbtnOperario.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnOperario.setBounds(408, 153, 103, 21);
		contentPanel.add(rdbtnOperario);
		
		lblNewLabel = new JLabel("Tipo trabajador");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(320, 153, 178, 20);
		contentPanel.add(lblNewLabel);
		
		groupbtn = new JRadioButton("Minero");
		groupbtn.setFont(new Font("Arial", Font.PLAIN, 13));
		groupbtn.setBounds(504, 153, 103, 21);
		contentPanel.add(groupbtn);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox.setToolTipText("Tratamientos\r\n");
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(13, 193, 128, 24);
		contentPanel.add(comboBox);
		 String arregloItems[]=new String[]{"TRATAMIENTO","Neumoconiosis","Vértigo","problemas respiratorios"};
		 comboBox.setModel(new DefaultComboBoxModel<>(arregloItems));
		{
			REGISTRO = new JLabel("FORMULARIO REGISTRO");
			REGISTRO.setFont(new Font("Arial", Font.PLAIN, 18));
			REGISTRO.setHorizontalAlignment(SwingConstants.CENTER);
			REGISTRO.setBounds(156, 22, 285, 24);
			contentPanel.add(REGISTRO);
		}
		
		hopitalizacion = new JTextField();
		hopitalizacion.setBounds(271, 196, 96, 19);
		contentPanel.add(hopitalizacion);
		hopitalizacion.setColumns(10);
		
		JLabel dias = new JLabel("Dias hospitalizacion");
		dias.setFont(new Font("Arial", Font.PLAIN, 12));
		dias.setBounds(154, 196, 162, 18);
		contentPanel.add(dias);
		
		JLabel lblNewLabel_1 = new JLabel("Costo Medicamentos");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(378, 196, 133, 18);
		contentPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(496, 198, 96, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 13));
		btnRegistrar.setBounds(244, 282, 103, 45);
		contentPanel.add(btnRegistrar);
		btnRegistrar.addActionListener(this);
	}
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getSource()==btnRegistrar) {
			
	MinerosVo miMinerosVo = new MinerosVo();
			
	         miMinerosVo.setEmpresa(textEmpresa.getText());
	         miMinerosVo.setDocumento(textPaciente.getText());
	         miMinerosVo.setNombre(textNombre.getText());
	         miMinerosVo.setDireccion(textDireccion.getText());
	         miMinerosVo.setTelefono(textTelefono.getText());
			String tratamiento = (String) comboBox.getSelectedItem();
			 miMinerosVo.setTratamiento(tratamiento);
			 miMinerosVo.setDiasHospitalizacion(Integer.parseInt(hopitalizacion.getText()));
			 miMinerosVo.setMedicamentos(Double.parseDouble(textField.getText()));
			
			boolean registro = miCoordinador.registrarMineros( miMinerosVo);
			
			if (registro) {
				String imprimir = "Empresa: "+miMinerosVo.getEmpresa()+"\n";
				imprimir+="Nombre: "+ miMinerosVo.getNombre()+"\n";
				imprimir+="Documento: "+ miMinerosVo.getDocumento()+"\n";
				imprimir+="Direccion: "+ miMinerosVo.getDireccion()+"\n";
				imprimir+="Telefono: "+ miMinerosVo.getTelefono()+"\n";
				imprimir+="Tipo: "+ miMinerosVo.getTipo()+"\n";
				imprimir+="Tratamiento: "+ miMinerosVo.getTratamiento()+"\n";
				imprimir+="Costo Tratamiento: "+ miMinerosVo.getCostoTratamiento()+"\n";
				imprimir+="Dias Hospitalizado: "+ miMinerosVo.getDiasHospitalizacion()+"\n";
				imprimir+="Costo Hospitalizacion: "+ miMinerosVo.getCostoDiasHospitalizacion()+"\n";
				imprimir+="Costo Medicamentos: "+ miMinerosVo.getMedicamentos()+"\n";
				imprimir+="Descuento: "+ miMinerosVo.getDescuento()+"\n";
				imprimir+="\tTotal a Pagar: "+ miMinerosVo.getTotalPagar()+"\n";
				
			
			
			
			
			}
			}
		
		
	}
}
