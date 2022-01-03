package JRadioButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Ventana10 extends JFrame implements ItemListener{
	
	private Container miContenerdor;
	private ButtonGroup pasatiempos;
	private JRadioButton deportes;
	private JRadioButton musica;
	private JRadioButton cine;
	private JLabel titulo;
	private JLabel salida;
	private JLabel ultimoCambio;
	private String selecionActual;
	
	public Ventana10() {
		titulo=new JLabel();
		pasatiempos =new ButtonGroup();
		deportes =new JRadioButton();
		musica=new JRadioButton();
		cine=new JRadioButton();
		salida=new JLabel();
		selecionActual=new String();
		
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setText("Elija lo nque mas le gusta");
		titulo.setBounds(10,20,310,30);
		
		deportes.setText("los deportes");
		deportes.setBounds(10,50,150,16);
		
		musica.setText("La musica");
		musica.setBounds(10,80,150,16);
		
		cine.setText("el cine");
		cine.setBounds(10,110,150,16);
		
		salida.setBounds(10,140,450,16);
		
		miContenerdor=getContentPane();
		miContenerdor.setLayout(null);
		
		miContenerdor.add(titulo);
		miContenerdor.add(deportes);
		miContenerdor.add(musica);
		miContenerdor.add(cine);
		miContenerdor.add(salida);
		
		pasatiempos.add(deportes);
		pasatiempos.add(musica);
		pasatiempos.add(cine);
		
		setTitle("JRadioButton");
		setSize(550,220);
		setResizable(false);
		
		show();
		
		deportes.addItemListener(this);
		musica.addItemListener(this);
		cine.addItemListener(this);
		
		}
	
	

	@Override
	public void itemStateChanged(ItemEvent evento) {
		
		String seleccion;
		JRadioButton temporal;
		
		temporal=(JRadioButton)evento.getItem();
		selecionActual=temporal.getText();
		seleccion="\nlos deportes: " + deportes.isSelected()+" , "+
				  "\nel cine: " + cine.isSelected()+", "+
				  "\nla musica: " + musica.isSelected()+","+
				  "seleccion"+selecionActual;
		
		salida.setText(seleccion);
	}
	

}
