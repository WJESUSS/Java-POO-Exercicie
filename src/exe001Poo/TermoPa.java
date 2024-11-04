package exe001Poo;

public class TermoPa {

	private int primeiroTermo;
	private int razao;
	private int termaAtual;
	
	public int proximoTermo() {
		int termoAnterior = this.termaAtual;
		this.termaAtual+=this.razao;
		return termoAnterior;
	}
	public int getPrimeiroTermo() {
		return primeiroTermo;
	}

	public void setPrimeiroTermo(int primeiroTermo) {
		this.primeiroTermo = primeiroTermo;
	}

	public int getRazao() {
		return razao;
	}

	public void setRazao(int razao) {
		this.razao = razao;
	}

	public int getTermaAtual() {
		return termaAtual;
	}

	public void setTermaAtual(int termaAtual) {
		this.termaAtual = termaAtual;
	}

	public TermoPa(int primeiroTermo, int razao, int termaAtual) {
		super();
		this.primeiroTermo = primeiroTermo;
		this.razao = razao;
		this.termaAtual = termaAtual;
	}
	
	


}
