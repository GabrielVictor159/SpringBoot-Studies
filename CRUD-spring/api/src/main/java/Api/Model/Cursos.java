package Api.Model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name = "cursos")
public class Cursos implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type="uuid-char")
    private UUID idCurso;
    @Column
    private String nomeDoCurso;
    @Column
    private String valorDoCurso;
	public UUID getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(UUID idCurso) {
		this.idCurso = idCurso;
	}
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
	@Override
	public String toString() {
		return "Cursos [idCurso=" + idCurso + ", nomeDoCurso=" + nomeDoCurso + ", valorDoCurso=" + valorDoCurso + "]";
	}

}
