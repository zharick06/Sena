package JCheckbox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Ventana9 extends JFrame implements ItemListener{
	
	private Container micontenedor;
	private JCheckBox deportes;
	private JCheckBox cine;
	private JCheckBox musica;
	private JLabel titulo;
	private JLabel salida;
	
	public Ventana9() {
		titulo=new JLabel();
		deportes=new JCheckBox();
		cine=new JCheckBox();
		musica=new JCheckBox();
		salida=new JLabel();
		
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setText("Elija cual le gusta mas");
		titulo.setBounds(10,10,310,30);
		
		deportes.setText("Los deportes");
		deportes.setBounds(10,50,150,16);
		
		cine.setText("El cine");
		cine.setBounds(10,80,150,16);
		
		musica.setText("La musica");
		musica.setBounds(10,110,150,16);
		
		salida.setBounds(10,140,310,16);
		
		micontenedor=getContentPane();
		micontenedor.setLayout(null);
		
		micontenedor.add(titulo);
		micontenedor.add(deportes);
		micontenedor.add(cine);
		micontenedor.add(musica);
		micontenedor.add(salida);
		
		setTitle("JCheckBox");
		setSize(330,200);
		setResizable(false);
		
		show();
		
		deportes.addItemListener(this);
		cine.addItemListener(this);
		musica.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent evento) {
		String seleccion;
		
		seleccion="\nlos deportes: " + deportes.isSelected()+" \n "+
				  "\nel cine: " + cine.isSelected()+"\n  "+
				  "\nla musica: " + musica.isSelected();
		
		salida.setText("\n"+seleccion);
		
	}

}

