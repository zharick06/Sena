package Procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ArrayList<Evento>listaEvento;
	ArrayList<Usuario>listaUsuario;
	
	public Procesos() {
		listaEvento=new ArrayList<Evento>();
		listaUsuario=new ArrayList<Usuario>();
				
	}

	//*************************Eventos*********************************
	public void registrarEvento(Evento miEvento) {
		JOptionPane.showMessageDialog(null,"Se registro correctamente el usuario ✔","",JOptionPane.PLAIN_MESSAGE);
		listaEvento.add(miEvento);
	
		
		
	}

	public void imprimirEventos() {
		if(listaEvento == null || listaEvento.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "No hay eventos que mostrar \n ", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else{
			for (Evento evento : listaEvento) {
				
				System.out.println(evento);
				
			}
		}
		
		
		
	}

	public Evento consultarEvento(String co) {
		Evento bus=null;
		for (Evento evento : listaEvento) {
			if (evento.getCodigo().equals(co)) {
				bus=evento;
				
			}
			
		}
		return bus;
	}

	//*************************Usuario*********************************
	public void registrarUsuario(Usuario miUsuario) {
			listaUsuario.add(miUsuario);
			JOptionPane.showMessageDialog(null,"Se registro correctamente el usuario ✔","",JOptionPane.PLAIN_MESSAGE);
		
		
		
		
	}

	public void imprimirUsuarios() {
		if(listaUsuario == null || listaUsuario.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "No hay Usuarios que mostrar \n ", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else{
			for (Usuario user : listaUsuario) {
				
				System.out.println(user);
				
			}
		}
		
		
	}


	}



	


