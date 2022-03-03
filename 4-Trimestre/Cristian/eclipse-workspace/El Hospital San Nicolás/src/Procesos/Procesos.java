package Procesos;

import java.util.ArrayList;
import Procesos.vo.Paciente;

import javax.swing.JOptionPane;

import Controlador.Coordinador;



public class Procesos {


	ArrayList<Paciente> listaPacientes;
	private double tratamientos;
	private String tipo;
	private double costoF;
	private double dias;
	private Coordinador micoordinador;
	
	
	public void setCoordinador(Coordinador micoordinador) {
		this.micoordinador=micoordinador;
		
	}
	
	public  Procesos() {
		listaPacientes=new ArrayList<Paciente>();
				
		
	}




	public void guardarUsuario(Paciente miPaciente) {
		listaPacientes.add(miPaciente);
		JOptionPane.showMessageDialog(null, "Paciente agregado");
		
		
	}




	public Double calculaTotal(int tratamientos, String tipo, int dias, int costoF) {
		this.tratamientos=tratamientos;
		this.dias=dias;
		this.costoF=costoF;
		this.tipo=tipo;
		double descuento=Double.parseDouble( vDescuento());
		return calcular(descuento , +dias,vTratamient(),costoF);
		
		
	}
	private Double calcular(double descuento, int dias, Integer vTratamient, int costoF) {
		double result;
		if (descuento>=0.2) {
			result=((80000*dias)+vTratamient+costoF)*0.20;
			
			
		}
		else {
			result=((80000*dias)+vTratamient+costoF);
		}
		
		
		return (double) Math.round(result);
	}




	private Integer vTratamient() {

		int valorT = 0 ;
		if (tratamientos== 0) {valorT=500000;}
		else if (tratamientos== 1) {valorT=300000;}
		else if (tratamientos== 2) {valorT=250000;}
		return valorT;
		}
	
	private String vDescuento() {
		String valorT = "" ;
		if (tipo=="Operario") {
			valorT="0";
			} 
		else if (tipo=="Minero") {
			valorT="0.2";
			}
		return valorT;
		}

	public String imprimirDatos(String documento) {
		String imprimir="";
		
		if(listaPacientes == null || listaPacientes.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "No hay eventos que mostrar \n ", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else{
			for (Paciente paciente : listaPacientes) {
				if (paciente.equals(documento)) {
					imprimir=paciente+"";
					}
			}
		}
		return imprimir;

	}











}