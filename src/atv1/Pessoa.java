package atv1;

public abstract class  Pessoa  {
	private  String cpf;
	private String nome;
	private String data;
	private String endereco;
	public Pessoa(String cpf, String nome, String data, String endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.data = data;
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
