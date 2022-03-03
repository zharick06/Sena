package ConcatenarDatos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JTextPane etiTexto;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,380);
		setTitle("Concatenar Datos");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
		
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("RadioButton.select"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(45, 71, 130, 30);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(201, 71, 130, 30);
		contentPane.add(txtPalabra2);
		
		JLabel lblIngresePalabras = new JLabel("Ingrese 2 palabras");
		lblIngresePalabras.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresePalabras.setBounds(110, 12, 184, 30);
		contentPane.add(lblIngresePalabras);
		
		btnConcatena = new JButton("Concatena");
		btnConcatena.setBackground(new Color(102, 153, 204));
		btnConcatena.setBounds(121, 141, 117, 25);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		etiTexto = new JTextPane();
		etiTexto.setBounds(45, 198, 292, 30);
		contentPane.add(etiTexto);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText() +" "+ txtPalabra2.getText());
			txtPalabra1.setText("");
			txtPalabra2.setText("");
		}
		
	}
}
