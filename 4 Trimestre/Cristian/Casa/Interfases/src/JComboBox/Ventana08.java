package JComboBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ventana08 extends JFrame implements ItemListener{
	
	private Container miContenedor;
	private JComboBox pasatiempos;
	private JLabel titulo;
	private JLabel salida;
	
	public Ventana08() {
		titulo=new JLabel();
		pasatiempos=new JComboBox();
		salida=new JLabel();
		
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setText("Elija lo que mas le gusta");
		titulo.setBounds(10,10,310,30);
		
		pasatiempos.setBounds(10,50,150,20);
		pasatiempos.removeAllItems();
		pasatiempos.addItem("Los depostes");
		pasatiempos.addItem("La musica");
		pasatiempos.addItem("El cine");
		pasatiempos.setSelectedIndex(1);
		
		
		salida.setBounds(170,50,310,16);
		
		miContenedor=getContentPane();
		miContenedor.setLayout(null);
		miContenedor.add(titulo);
		miContenedor.add(pasatiempos);
		miContenedor.add(salida);
		
		setTitle("JComboBox");
		setSize(330,170);
		setResizable(false);
		
		
		show();
		
		pasatiempos.addItemListener(this);
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent evento) {
		String seleccion;
		seleccion=(String) pasatiempos.getSelectedItem();
		salida.setText("selecciono: "+seleccion);
	}

	
	
	
	

	
	
}


