package Procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ArrayList<Persona>listaPersona;
	
	public Procesos() {

		listaPersona=new ArrayList<Persona>();
				
	
	}

	public void guardarUsuario(Persona miPersona) {
		listaPersona.add(miPersona);
		for (Persona persona : listaPersona) {
			if (persona.getMIC()<18) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal muestra que usted tiene Anorexia ");
				
			}
			else if (persona.getMIC() >=18 && persona.getMIC()<20) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal muestra que usted tiene Delgadez ");
				
			}
			else if (persona.getMIC() >=20 && persona.getMIC()<27) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal es normal ");
				
			}
			else if (persona.getMIC() >=27 && persona.getMIC()<30) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal muestra que usted tiene Obesidad (grado 1) ");
				
			}
			else if (persona.getMIC() >=30 && persona.getMIC()<35) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal muestra que usted tiene Obesidad (grado 2) ");
				
			}
			else if (persona.getMIC() >=35 && persona.getMIC()<40) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal muestra que usted tiene Obesidad (grado 3) ");
				
			}
			else if (persona.getMIC() >=40) {
				JOptionPane.showMessageDialog(null,"Su indice de masa corporal muestra que usted tiene Obesidad mordida ");
				
			}
			
		}
		JOptionPane.showMessageDialog(null,"Se registro correctamente la persona ✔","",JOptionPane.PLAIN_MESSAGE);
		
		
	}

	public String imprimirUsuario() {
		String imp="";
		if(listaPersona == null || listaPersona.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "No hay personas que mostrar \n ", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			
			for (Persona persona : listaPersona) {
				imp+=persona+"\n";
				
				
			}
			
		}
		
		return imp;
	}

	public Double imprimirPromedio() {
		double promedio = 0;
		
		if(listaPersona == null || listaPersona.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "No hay Promedio que mostrar \n ", "ERROR",JOptionPane.ERROR_MESSAGE);
		}else {
			for(Persona persona : listaPersona) {
				promedio += persona.getMIC(); 
			}
			
		}

		
		return (promedio)/listaPersona.size();
	}

}