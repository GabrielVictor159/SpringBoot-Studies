package Api.Repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Api.Model.Cursos;
@Repository
public interface CursoRepository extends JpaRepository<Cursos, UUID>{
	
	boolean existsByNomeDoCurso(String nomeDoCurso);
}
