package NotaEstudiantes;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblPrimerTrimestre;
	private JLabel lblSegundoTrimestre;
	private JLabel lblTercerTrimestre;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel etiResultado;
	private JLabel etiNotaFinal;
	private JButton btnCalcular;


	public VentanaPrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,380);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Nota de estudiantes");
		iniciarComponentes();
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPrimerTrimestre = new JLabel("Primer Trimestre:");
		lblPrimerTrimestre.setForeground(Color.BLACK);
		lblPrimerTrimestre.setFont(new Font("DejaVu Serif", Font.ITALIC, 14));
		lblPrimerTrimestre.setBounds(39, 31, 136, 23);
		contentPane.add(lblPrimerTrimestre);
		
		lblSegundoTrimestre = new JLabel("Segundo Trimestre:");
		lblSegundoTrimestre.setForeground(Color.BLACK);
		lblSegundoTrimestre.setFont(new Font("DejaVu Serif", Font.ITALIC, 14));
		lblSegundoTrimestre.setBounds(39, 77, 149, 23);
		contentPane.add(lblSegundoTrimestre);
		
		lblTercerTrimestre = new JLabel("Tercer Trimestre:");
		lblTercerTrimestre.setForeground(Color.BLACK);
		lblTercerTrimestre.setFont(new Font("DejaVu Serif", Font.ITALIC, 14));
		lblTercerTrimestre.setBounds(39, 126, 136, 23);
		contentPane.add(lblTercerTrimestre);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(179, 22, 60, 32);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(189, 73, 60, 32);
		contentPane.add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(179, 122, 60, 32);
		contentPane.add(txtTercerTrimestre);
		
		etiResultado = new JLabel("Resultado:");
		etiResultado.setHorizontalAlignment(SwingConstants.LEFT);
		etiResultado.setForeground(Color.black);
		etiResultado.setBounds(39, 254, 231, 39);
		etiResultado.setFont(new Font("DejaVu Serif", Font.ITALIC, 14));
		contentPane.add(etiResultado);
		
		etiNotaFinal = new JLabel("Nota Final:");
		etiNotaFinal.setBounds(39, 218, 220, 28);
		etiNotaFinal.setForeground(Color.BLACK);
		etiNotaFinal.setFont(new Font("DejaVu Serif", Font.ITALIC, 14));
		contentPane.add(etiNotaFinal);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(255, 255, 204));
		btnCalcular.setBounds(106, 179, 91, 23);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCalcular) {
			calcualNota();
			txtPrimerTrimestre.setText("");
			txtSegundoTrimestre.setText("");
			txtTercerTrimestre.setText("");
		
		}
			
		}
		
	
	private void calcualNota() {
		
		try {
			double nota1=(Double.parseDouble(txtPrimerTrimestre.getText()));
			 double nota2=(Double.parseDouble(txtSegundoTrimestre.getText()));
			 double nota3=(Double.parseDouble(txtTercerTrimestre.getText()));
			 double prom=(nota1+ nota2+ nota3)/3;
			
			if (prom<5) {
				etiNotaFinal.setText("Nota Final: "+prom);
				etiResultado.setText("SUSPENSO");
				etiNotaFinal.setForeground(Color.RED);
				etiResultado.setForeground(Color.RED);	
			}
			else {
				etiNotaFinal.setText("Nota Final: "+Math.round(prom));
				etiResultado.setText("APROVADO");
				etiNotaFinal.setForeground(Color.BLACK);
				etiResultado.setForeground(Color.BLACK);	
			}
		} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Ingreso icorrecto de datos");
		}
		 
	}
}
