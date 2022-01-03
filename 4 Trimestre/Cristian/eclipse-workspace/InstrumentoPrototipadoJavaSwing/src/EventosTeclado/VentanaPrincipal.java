package EventosTeclado;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements KeyListener, ActionListener{

	private JPanel contentPane;
	private JTextField txtTexto;
	private JTextPane etiTexto;
	private JButton btnVaciar;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,355);
		setTitle("Eventos del teclado");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		contentPane.setFocusable(true);
		
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtTexto.setBounds(119, 44, 140, 37);
		txtTexto.addKeyListener (this);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto = new JTextPane();
		etiTexto.setFont(new Font("Dialog", Font.PLAIN, 16));
		etiTexto.setBounds(119, 108, 140, 37);
		contentPane.add(etiTexto);
		txtTexto.addKeyListener (this);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBounds(131, 180, 125, 31);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		etiTexto.setText(txtTexto.getText());
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnVaciar) {
			etiTexto.setText("");
			txtTexto.setText("");
			
		}
		
	}
}
