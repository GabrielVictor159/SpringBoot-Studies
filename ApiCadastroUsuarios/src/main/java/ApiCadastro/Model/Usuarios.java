package ApiCadastro.Model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Usuarios implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private long cpf;
	
	@Column(nullable = false, unique=true)
	private String nome;
	@Column(nullable = false, unique=true)
	private String email;
	
	@Column(nullable = false)
	private int telefone;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Usuarios [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
}

	