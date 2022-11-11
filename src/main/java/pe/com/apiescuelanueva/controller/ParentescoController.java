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


import pe.com.apiescuelanueva.entity.ParentescoEntity;
import pe.com.apiescuelanueva.service.ParentescoService;

@RestController
@RequestMapping("/parentesco")
public class ParentescoController {

	@Autowired
	private ParentescoService parentescoservice;
	
	//@GetMapping sirve para obtener valores de la BD
	@GetMapping
	public List<ParentescoEntity>FindAll(){
		return parentescoservice.findAll();
	}
	
	//OBTENER DATOS SI EL ESTADO ES IGUAL A 1
	@GetMapping("/custom")
	public List<ParentescoEntity>FindAllCustom(){
		return parentescoservice.findAllCustom();
	}
	
	//OBTENER DATOS DEPENDIENDO DEL ID
	@GetMapping("/{id}")
	public Optional<ParentescoEntity> findById(@PathVariable Long id)
	{
		return parentescoservice.findById(id);
	}
	
	//INGRESAR DATOS
	@PostMapping
	public ParentescoEntity add(@RequestBody ParentescoEntity p)
	{
		return parentescoservice.add(p);
	}
	
	@PutMapping("/{id}")
	public ParentescoEntity update(@PathVariable Long id,@RequestBody ParentescoEntity p)
	{
		p.setCodigo(id);
		return parentescoservice.update(p);
	}
	
	@DeleteMapping("/{id}")
	public ParentescoEntity delete(@PathVariable Long id)
	{
		ParentescoEntity objparentesco = new ParentescoEntity();
		objparentesco.setEstado(false);
		return parentescoservice.delete(ParentescoEntity.builder().codigo(id).build());
	}
}
