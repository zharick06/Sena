package PasarInformación;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JTextField etiTexto1;
	private JTextField etiTexto2;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pasar información entre componentes gráficos");
		setSize( 400, 352);
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setForeground(Color.BLACK);
		txtTexto.setFont(new Font("Dialog", Font.PLAIN, 17));
		txtTexto.setBounds(126, 32, 141, 32);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);

		
		etiTexto1 = new JTextField();
		etiTexto1.setBounds(10, 94, 151, 27);
		contentPane.add(etiTexto1);
		etiTexto1.setColumns(10);
		
		etiTexto2 = new JTextField();
		etiTexto2.setColumns(10);
		etiTexto2.setBounds(183, 94, 151, 27);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Transpasar 1");
		btnTraspasa1.setBounds(28, 147, 133, 27);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Transpasar 2");
		btnTraspasa2.setBounds(199, 147, 133, 27);
		btnTraspasa2.addActionListener(this);
		contentPane.add(btnTraspasa2);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTraspasa1) {
		    etiTexto1.setText(txtTexto.getText());
		    
		    
		}
		else if(e.getSource()==btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
		}
		
		
	}
}
