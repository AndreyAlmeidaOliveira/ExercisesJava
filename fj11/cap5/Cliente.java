package fj11.cap5;

public class Cliente {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getEndereco () {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}
	public void validaCPF(String cpf) {
		
	}
}
