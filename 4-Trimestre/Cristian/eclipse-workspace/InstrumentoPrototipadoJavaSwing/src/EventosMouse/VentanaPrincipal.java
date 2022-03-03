package EventosMouse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

public class VentanaPrincipal extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JLabel lblOcultar2;
	private JLabel lblOcultar3;
	private JLabel lblOcultar4;
	private JTextPane etiOcultar;
	private JLabel lblOcultar1;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,370);
		setTitle("Eventos del Mouse");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponenetes();
		
	}
	public void iniciarComponenetes() {
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(UIManager.getColor("RadioButtonMenuItem.acceleratorForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblOcultar1 = new JLabel("J");
		lblOcultar1.setForeground(Color.WHITE);
		lblOcultar1.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		lblOcultar1.setBounds(127, 49, 60, 31);
		contentPane.add(lblOcultar1);
		
		lblOcultar2 = new JLabel("A");
		lblOcultar2.setForeground(Color.WHITE);
		lblOcultar2.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblOcultar1.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		lblOcultar2.setBounds(159, 49, 60, 31);
		contentPane.add(lblOcultar2);
		
		lblOcultar3 = new JLabel("V");
		lblOcultar3.setForeground(Color.WHITE);
		lblOcultar3.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblOcultar1.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		lblOcultar3.setBounds(199, 49, 60, 31);
		contentPane.add(lblOcultar3);
		
		lblOcultar4 = new JLabel("A");
		lblOcultar4.setForeground(Color.WHITE);
		lblOcultar4.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblOcultar1.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		lblOcultar4.setBounds(240, 49, 60, 31);
		contentPane.add(lblOcultar4);
		
		etiOcultar = new JTextPane();
		etiOcultar.setBackground(UIManager.getColor("TabbedPane.unselectedBackground"));
		etiOcultar.setForeground(Color.BLACK);
		etiOcultar.setText("Ocultar");
		etiOcultar.setBounds(135, 129, 113, 37);
		etiOcultar.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
	    etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			lblOcultar1.setVisible(false);
			lblOcultar2.setVisible(false);
			lblOcultar3.setVisible(false);
			lblOcultar4.setVisible(false);
			
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			lblOcultar1.setVisible(true);
			lblOcultar2.setVisible(true);
			lblOcultar3.setVisible(true);
			lblOcultar4.setVisible(true);
			
		}
		
	}
}
