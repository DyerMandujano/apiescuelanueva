package pe.com.apiescuelanueva.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Esta anotacion permite producir automáticamente el código requerido para que su clase sea instanciable.
@Builder
//Con esta anotacion creamos un metodo constructor con parametros
@AllArgsConstructor
//Con esta anotacion creamos un metodo constructor sin parametros
@NoArgsConstructor
//Esta notacion siver para generar los 'getters and setters'
@Data

//En la anotacion 'Entity' tenemos que colocar el nombre de la clase de JAVA que hemos creado
@Entity(name="DistritoEntity")
//En la anotacion 'Table' tenemos que colocar el nombre la tabla que hemos creado en la BD
@Table(name="distrito")
//La finalidad de la Serializacion es poder relacionarlo con la BASE DE DATOS
public class DistritoEntity implements Serializable {
    private static final long serialVersionUID=1L;
    
    //ATRIBUTOS
    //CON LA ANOTACION '@ID' LE INDICAMOS QUE ES LLAVE PRIMARIA 
    @Id
    //DENTRO DE LA ANOTACION '@Column' , ENTRE PARENTESIS, COLOCAMOS EL NOMBRE('name') DE LA COLUMNA QUE SE ENCUENTRA EN LA BD
    @Column(name="coddis")
  //Esta notacion es para el auto-incremento del codigo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name="nomdis")
    private String nombre;
    @Column(name="estdis")
    private boolean estado;
    
    /*
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
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    */
    
}