package Modelo.ModeloVo;

import java.util.ArrayList;

public class MinerosVo {
private String empresa;
private String documento;
private String nombre;
private String direccion;
private String telefono;
private String tipo;
private String tratamiento;
private double costoTratamiento;
private int diasHospitalizacion;
private double costoDiasHospitalizacion;
private double medicamentos; 
private double descuento;
private double totalPagar;

public double getCostoTratamiento() {
	return costoTratamiento;
}
public double  setCostoTratamiento(double costoTratamiento) {
	return this.costoTratamiento = costoTratamiento;
}
public double getCostoDiasHospitalizacion() {
	return costoDiasHospitalizacion;
}
public void setCostoDiasHospitalizacion(double costoDiasHospitalizacion) {
	this.costoDiasHospitalizacion = costoDiasHospitalizacion;
}
public String getEmpresa() {
	return empresa;
}
public void setEmpresa(String empresa) {
	this.empresa = empresa;
}
public String getDocumento() {
	return documento;
}
public void setDocumento(String documento) {
	this.documento = documento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getTratamiento() {
	return tratamiento;
}
public void setTratamiento(String tratamiento) {
	this.tratamiento = tratamiento;
}
public int getDiasHospitalizacion() {
	return diasHospitalizacion;
}
public void setDiasHospitalizacion(int diasHospitalizacion) {
	this.diasHospitalizacion = diasHospitalizacion;
}
public double getMedicamentos() {
	return medicamentos;
}
public void setMedicamentos(double medicamentos) {
	this.medicamentos = medicamentos;
}
public double getDescuento() {
	return descuento;
}
public void setDescuento(double descuento) {
	this.descuento = descuento;
}
public double getTotalPagar() {
	return totalPagar;
}
public void setTotalPagar(double totalPagar) {
	this.totalPagar = totalPagar;
}



	

	

}
