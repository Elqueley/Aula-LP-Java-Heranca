package atv1;

public class Advogado extends Pessoa implements Interface {
	private String oab;

	public Advogado(String cpf, String nome, String data, String endereco, String oab) {
		super(cpf, nome, data, endereco);
		this.oab = oab;
	}

	public String getOab() {
		return oab;
	}

	public void setOab(String oab) {
		this.oab = oab;
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
