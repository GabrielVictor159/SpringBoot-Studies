package Api.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Api.Model.Cursos;
import Api.Repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

//    @Transactional apenas quando precisamos de uma transação jpa
    @Transactional
    public Cursos save(Cursos cursos){
        return cursoRepository.save(cursos);
    }
    public Optional<Cursos> FindById(UUID id){
        return cursoRepository.findById(id);
    }
    public List<Cursos> ListAll(){
        return cursoRepository.findAll();
    }
    @Transactional
    public void Delete(Cursos curso){
       cursoRepository.delete(curso);
    }
   
    
    public boolean existsByNomeDoCurso(String nomeDoCurso) {
    	return cursoRepository.existsByNomeDoCurso(nomeDoCurso);
    }

}
