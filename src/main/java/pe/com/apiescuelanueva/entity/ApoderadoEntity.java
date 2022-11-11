package pe.com.apiescuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Data
@Entity(name="ApoderadoEntity")
@Table(name="apoderado")
public class ApoderadoEntity implements Serializable{
   private static final long serialVersionUID=1L;
   @Id
   @Column(name="codapo")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long codigo;
   @Column(name="nomapo")
   private String nombre;
   @Column(name="apepapo")
   private String apellidopaterno;
   @Column(name="apemapo")
   private String apellidomaterno;
   @Column(name="dniapo")
   private String dni;
   @Column(name="dirapo")
   private String direccion;
   @Column(name="telapo")
   private String telefono;
   @Column(name="celapo")
   private String celular;
   @Column(name="corapo")
   private String correo;
   @Column(name="sexapo")
   private String sexo;
   @Column(name="estapo")
   private boolean estado;
   @ManyToOne
   @JoinColumn(name="coddis",nullable = false)
   private DistritoEntity distrito;
   @ManyToOne
   @JoinColumn(name="codpar",nullable = false)
   private ParentescoEntity parentesco;
public long getCodigo() {
	return codigo;
}
public void setCodigo(long codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidopaterno() {
	return apellidopaterno;
}
public void setApellidopaterno(String apellidopaterno) {
	this.apellidopaterno = apellidopaterno;
}
public String getApellidomaterno() {
	return apellidomaterno;
}
public void setApellidomaterno(String apellidomaterno) {
	this.apellidomaterno = apellidomaterno;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
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
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public boolean isEstado() {
	return estado;
}
public void setEstado(boolean estado) {
	this.estado = estado;
}
public DistritoEntity getDistrito() {
	return distrito;
}
public void setDistrito(DistritoEntity distrito) {
	this.distrito = distrito;
}
public ParentescoEntity getParentesco() {
	return parentesco;
}
public void setParentesco(ParentescoEntity parentesco) {
	this.parentesco = parentesco;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
   
   
}
