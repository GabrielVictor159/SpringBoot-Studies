package Api.DTO;

import javax.validation.constraints.NotBlank;
public class CursoDTO {
    @NotBlank
    private String nomeDoCurso;
    @NotBlank
    private String valorDoCurso;
    
	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	public String getValorDoCurso() {
		return valorDoCurso;
	}
	public void setValorDoCurso(String valorDoCurso) {
		this.valorDoCurso = valorDoCurso;
	}
    
}
