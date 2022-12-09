package ApiCadastro.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ApiCadastro.Model.Usuarios;
@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	
	
}
