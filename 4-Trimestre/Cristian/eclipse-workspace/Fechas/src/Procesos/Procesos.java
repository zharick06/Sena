package Procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
ArrayList<Usuarios>listaUsuarios;
	
	public Procesos() {

		listaUsuarios=new ArrayList<Usuarios>();
	}

	public void guardarUsuario(Usuarios miUsuario) {
		listaUsuarios.add(miUsuario);
		JOptionPane.showMessageDialog(null, "Usuario agregado");
		System.out.println(listaUsuarios);
	}

	public String imprimirUsuarios() {
		String imp="";
		if(listaUsuarios == null || listaUsuarios.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "No hay personas que mostrar \n ", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			
			for (Usuarios usuarios : listaUsuarios) {
				imp+=usuarios+"\n";
			}	
		}
		return imp;
	
	}




	public String mayor(int años, int meses, int dias) {
		String imp="";
		if (años>18 || meses<0 || dias>=0) {
			imp="1";
		}
		else {
			imp="2";
		}
		return imp;
	}
	


}
