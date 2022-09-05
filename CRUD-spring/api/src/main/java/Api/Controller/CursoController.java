package Api.Controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Api.DTO.CursoDTO;
import Api.Model.Cursos;
import Api.service.CursoService;

@RestController
@RequestMapping(value="/Api", produces = {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping("/Cursos/{id}")
    public ResponseEntity<Object> findCurso(@PathVariable(value = "id") UUID id){
        Optional <Cursos> cursosOptional = cursoService.FindById(id);
        if(!cursosOptional.isPresent()) {
        	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cursosOptional.get());
    }

    @GetMapping("/Cursos")
        public ResponseEntity<List<Cursos>> listAllCursos(){
            System.out.println("acessou GetAll");
            return ResponseEntity.status(HttpStatus.OK).body(cursoService.ListAll());
            }

    @PostMapping("/Cursos")   
    public ResponseEntity<Object> saveCurso(@RequestBody @Valid CursoDTO cursoDTO){
    	if(cursoService.existsByNomeDoCurso(cursoDTO.getNomeDoCurso())) {
    		return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Nome do curso is already in use!");
    	}
        System.out.println("acessou save");
        Cursos curso = new Cursos();
        BeanUtils.copyProperties(cursoDTO, curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.save(curso));
     }
    @RequestMapping(value="/Cursos/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> UpdateCurso(@PathVariable(value = "id") UUID id , @RequestBody @Valid CursoDTO cursoDTO){
        Optional <Cursos> cursosOptional = cursoService.FindById(id);
        if(!cursosOptional.isPresent()) {
        	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso não encontrado");
        }
        var curso = new Cursos();
        BeanUtils.copyProperties(cursoDTO , curso);
        curso.setIdCurso(cursosOptional.get().getIdCurso());
        
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.save(curso));
    }
     
     @DeleteMapping("/Cursos/{id}")
     public ResponseEntity<Object> DeleteCurso(@PathVariable(value = "id") UUID id){
         Optional <Cursos> cursosOptional = cursoService.FindById(id);
         if(!cursosOptional.isPresent()) {
         	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso não encontrado");
         }
         cursoService.Delete(cursosOptional.get());
         return ResponseEntity.status(HttpStatus.OK).body("Curso deletado com sucesso");
     }
     }


