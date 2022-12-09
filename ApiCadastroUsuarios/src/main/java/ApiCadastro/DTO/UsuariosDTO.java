package ApiCadastro.DTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class UsuariosDTO {
	@NotBlank
	private long cpf;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private int telefone;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
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
		return "UsuariosDTO [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

	public UsuariosDTO(@NotBlank long cpf, @NotBlank String nome, @NotBlank String email, @NotBlank int telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	
}
