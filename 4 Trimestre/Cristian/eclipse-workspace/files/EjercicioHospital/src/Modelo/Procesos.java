package Modelo;

import java.util.ArrayList;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import Controlador.Coordinador;
import Modelo.ModeloVo.MinerosVo;



public class Procesos {
private Coordinador miCoordinador;
	
	ArrayList<MinerosVo> minerosList;
	
	public Procesos( ) {
		minerosList = new ArrayList<MinerosVo>();
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

	public boolean registrarMineros(MinerosVo miMinerosVo) {
		try {
			if (miMinerosVo.getTratamiento().equals("Neumoconiosis")) {
				double costoTratamiento = 500000*miMinerosVo.getDescuento();
				miMinerosVo.setCostoTratamiento(500000-costoTratamiento);
			}else if (miMinerosVo.getTratamiento().equals("Vértigo")) {
				double costoTratamiento = 300000*miMinerosVo.getDescuento();
				miMinerosVo.setCostoTratamiento(300000-costoTratamiento);
			}else if (miMinerosVo.getTratamiento().equals("Problemas respiratorios")) {
				double costoTratamiento = 250000*miMinerosVo.getDescuento();
				miMinerosVo.setCostoTratamiento(250000-costoTratamiento);
			}
			double descuento = 80000*miMinerosVo.getDescuento();
			double costoHospitalizado=miMinerosVo.getDiasHospitalizacion()*(80000-descuento);
			miMinerosVo.setCostoDiasHospitalizacion(costoHospitalizado);
			
			double total = miMinerosVo.getCostoTratamiento()+miMinerosVo.getCostoDiasHospitalizacion()+miMinerosVo.getMedicamentos();
			miMinerosVo.setTotalPagar(total);
			
			minerosList.add(miMinerosVo);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public MinerosVo consultarPaciente(String documento) {
	MinerosVo paciente = null;
		for(MinerosVo pacienteVO : minerosList) {
			if (pacienteVO.getDocumento().equals(documento)) {
				paciente=pacienteVO;
				break;
			}
		}
		return paciente;
	}

	public ArrayList<MinerosVo> llenarTable() {
	
		return minerosList;
	}

	
	}




