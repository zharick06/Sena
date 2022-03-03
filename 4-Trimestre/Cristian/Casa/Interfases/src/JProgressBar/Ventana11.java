package JProgressBar;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Ventana11 extends JFrame implements ChangeListener, ActionListener  {
	
	private  Container miContenedor;
	private JProgressBar barra;
	private JSlider deslizador;
	private JLabel titulo;
	private JLabel salida;
	private JSeparator separador;
	private JButton boton;
	
	public Ventana11() {
		titulo =new JLabel();
		barra =new JProgressBar();
		deslizador=new JSlider();
		salida=new JLabel();
		separador=new JSeparator();
		boton=new JButton("Salir");
		
		boton.setBounds(120,140,80,20);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setText("De3slice sobre la barra");
		titulo.setBounds(10,20,310,30);
		
		deslizador.setBounds(10,50,110,20);
		separador.setBounds(10,80,110,20);
		barra.setBounds(10,110,110,20);
		barra.setValue(70);
		salida.setBounds(10,140,320,16);
		salida.setText("el valor es: 50");
		
		miContenedor=getContentPane();
		miContenedor.setLayout(null);
		
		miContenedor.add(titulo);
		miContenedor.add(deslizador);
		miContenedor.add(salida);
		miContenedor.add(barra);
		miContenedor.add(separador);
		miContenedor.add(boton);
		
		setTitle("JProgressBar y JSlider");
		setSize(330,220);
		setResizable(false);
		
		show();
		
		deslizador.addChangeListener(this);
		boton.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		int valor;
		
		valor=deslizador.getValue();
		salida.setText("el valor es: "+valor);
		barra.setValue(valor);
		
	}

	@Override
	public void stateChanged(ChangeEvent evento) {
		System.exit(0);
		
	}
	

}
