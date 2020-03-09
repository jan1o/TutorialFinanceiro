package bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteBean {
	private String nome;
	private int quantidadeCaracteres;

	public String transformar() {
		this.nome = this.nome.toUpperCase();
		this.quantidadeCaracteres = this.nome.length();
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeCaracteres() {
		return quantidadeCaracteres;
	}
}
