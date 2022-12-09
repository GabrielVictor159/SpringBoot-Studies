package ApiCadastro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ApiCadastro.Model.Usuarios;
import ApiCadastro.Repository.UsuariosRepository;

@Service
public class UsuariosService{
	@Autowired
	UsuariosRepository usuariosRepository;
	
	@Transactional
	public Usuarios Cadastrar(Usuarios usuario) {
		return usuariosRepository.save(usuario);
	}
	
	
	
}
