package EventosMouseAsignaciónValores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener, MouseListener{

	private JPanel contentPane;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JLabel etiDiez;
	private JTextPane txtNumero;
	private JButton btnBorar;
	String resultado="";

	public VentanaPrincipal() {
		getContentPane().setBackground(new Color(255, 192, 203));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(460,380);
		setTitle("Eventos del mouse y asignación de valores");
		setLocationRelativeTo(null);
		setResizable(false);		
		getContentPane().setLayout(null);
		iniciarComponentes();
	}
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiUno = new JLabel("0");
		etiUno.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setBounds(23, 28, 30, 30);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("1");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiDos.setBounds(65, 28, 30, 30);
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("2");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiTres.setBounds(107, 28, 30, 30);
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("3");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiCuatro.setBounds(149, 28, 30, 30);
		etiCuatro.addMouseListener(this);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("4");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiCinco.setBounds(191, 28, 30, 30);
	    etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("5");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiSeis.setBounds(233, 28, 30, 30);
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("6");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiSiete.setBounds(275, 28, 30, 30);
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("7");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiOcho.setBounds(317, 28, 30, 30);
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("8");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiNueve.setBounds(359, 28, 30, 30);
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
		etiDiez = new JLabel("9");
		etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
		etiDiez.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 20));
		etiDiez.setBounds(401, 28, 30, 30);
		etiDiez.addMouseListener(this);
		contentPane.add(etiDiez);
		
		txtNumero = new JTextPane();
		txtNumero.setBounds(52, 124, 353, 41);
		contentPane.add(txtNumero);
		
		btnBorar = new JButton("Borar");
		btnBorar.setBackground(new Color(255, 228, 225));
		btnBorar.setBounds(146, 205, 117, 25);
		btnBorar.addActionListener(this);
		contentPane.add(btnBorar);
		
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
		if (e.getSource()==etiUno) {
			resultado+=etiUno.getText();
		}
		else if(e.getSource()==etiDos) {
			resultado+=etiDos.getText();
		}
		else if(e.getSource()==etiTres) {
			resultado+=etiTres.getText();
		}
		else if(e.getSource()==etiCuatro) {
			resultado+=etiCuatro.getText();
		}
		else if(e.getSource()==etiCinco) {
			resultado+=etiCinco.getText();
		}
		else if(e.getSource()==etiSeis) {
			resultado+=etiSeis.getText();
		}
		else if(e.getSource()==etiSiete) {
			resultado+=etiSiete.getText();
		}
		else if(e.getSource()==etiOcho) {
			resultado+=etiOcho.getText();
		}
		else if(e.getSource()==etiNueve) {
			resultado+=etiNueve.getText();
		}
		else if(e.getSource()==etiDiez) {
			resultado+=etiDiez.getText();
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==etiUno) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiDos) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiTres) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiCuatro) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiCinco) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiSeis) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiSiete) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiOcho) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiNueve) {
			txtNumero.setText(resultado);
		}
		else if(e.getSource()==etiDiez) {
			txtNumero.setText(resultado);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBorar) {
			resultado="";
			txtNumero.setText(resultado);
			
		}
		
	}

}
