package atv1;

public class Limpeza extends Pessoa implements Interface{
	private String MEI;

	public Limpeza(String cpf, String nome, String data, String endereco,String mEI) {
		super(cpf, nome, data, endereco);
		MEI = mEI;
	}

	public String getMEI() {
		return MEI;
	}

	public void setMEI(String mEI) {
		MEI = mEI;
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
