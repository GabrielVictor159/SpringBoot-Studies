package ApiCadastro.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ApiCadastro.DTO.UsuariosDTO;
import ApiCadastro.Model.Usuarios;
import ApiCadastro.Service.UsuariosService;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value="/Usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "*", maxAge = 3600)
public class UsuariosController {
	 @Autowired
	 UsuariosService usuariosService;
	 
	 
	 @PostMapping("/Cadastrar")
	 public ResponseEntity<Object> cadastrar(@RequestBody @Valid UsuariosDTO usuariosDTO){
		 System.out.println("Acessou cadastrar");
		 try {
		 Usuarios usuario = new Usuarios();
		 System.out.println(usuariosDTO);
		 BeanUtils.copyProperties(usuariosDTO, usuario);
		 System.out.println(usuario);
		 return ResponseEntity.status(HttpStatus.CREATED).body(usuariosService.Cadastrar(usuario));
		 }
		 catch(Exception e) {System.out.println(e);
		 return ResponseEntity.status(HttpStatus.CONFLICT).body("Error");
		 }
	 }
	 
}
