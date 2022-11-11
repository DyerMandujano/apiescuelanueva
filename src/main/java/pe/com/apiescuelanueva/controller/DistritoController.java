package pe.com.apiescuelanueva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.apiescuelanueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.service.DistritoService;

//@Controller --> indica que es un controlador de tipo Spring
//@ResponsiveBody --> cuando se agrega a esta anotacion se vuelve REST
//@RestController = @Controller + @ResponsiveBody
//@RestController aparece en la version 4 de Spring

//@RestController --> indica que es un controlador de tipo REST
@RestController

//@RequestMapping --> permite definir el nombre del ENDPOINT
@RequestMapping("/distrito")
public class DistritoController {
	
	@Autowired
	private DistritoService distritoservice;
	
	//@GetMapping sirve para obtener valores de la BD
	//SOLO PUEDE HABER UN @GetMapping SIN PARAMETROS
	@GetMapping
	public List<DistritoEntity>FindAll(){
		return distritoservice.findAll();
	}
	
	//OBTENER DATOS SI EL ESTADO ES IGUAL A 1
	@GetMapping("/custom")
	public List<DistritoEntity>FindAllCustom(){
		return distritoservice.findAllCustom();
	}
	
	//OBTENER DATOS DEPENDIENDO DEL ID
	//LA ANOTACION @PathVariable ES UNA RUTA QUE DEBE ESTAR VINCULADA JUNTO CON EL @GetMapping,
	//ES POR ELLO QUE TANTO EL PARAMETRO DEL @GetMapping COMO EL NOMBRE DE LA VARIABLE @PathVariable DEBEN SER IGUALES.
	@GetMapping("/{id}")
	public Optional<DistritoEntity> findById(@PathVariable Long id)
	{
		return distritoservice.findById(id);
	}
	
	//INGRESAR DATOS
	@PostMapping
	public DistritoEntity add(@RequestBody DistritoEntity d)
	{
		return distritoservice.add(d);
	}
	
	//LA ANOTACION @PathVariable ES UNA RUTA QUE DEBE ESTAR VINCULADA JUNTO CON EL @GetMapping,
	//ES POR ELLO QUE TANTO EL PARAMETRO DEL @GetMapping COMO EL NOMBRE DE LA VARIABLE @PathVariable DEBEN SER IGUALES.
	//ADEMAS EL @RequestBody TRAERA LOS DATOS O EL CONTENIDO DEPENDIENDO DEL ID QUE SE COLOQUE EN LA URL.
	//La anotación @RequestBody nos sirve para deserializar un objeto completo a partir del cuerpo de la petición.
	//ES DECIR QUE ESTE @RequestBody LO TRAERA COMO FORMATO JSON TODO EL CUERPO DEL MENSAJE Y LO TRANSFORMARA EN OBJETO QUE EN ESTE CASO
	//ES EL DE 'DistritoEntity'
	@PutMapping("/{id}")
	public DistritoEntity update(@PathVariable Long id,@RequestBody DistritoEntity d)
	{
		d.setCodigo(id);
		return distritoservice.update(d);
	}
	
	//EN ESTE CASO NO SE ESTA ELIMINANDO EL OBJETO POR COMPLETO, SOLO SE LE ESTA CAMBIANDO EL ESTADO A 'FALSE'
	@DeleteMapping("/{id}")
	public DistritoEntity delete(@PathVariable Long id)
	{

		DistritoEntity objdistrito = new DistritoEntity();
		objdistrito.setEstado(false);
		return distritoservice.delete(DistritoEntity.builder().codigo(id).build());
	}
	
	
	
	
	
	
	
	
	
	
}
