
public class ContaParaEmprestimo extends Cliente {

	private Cliente titular;
	private int score;
	private double renda;

	public ContaParaEmprestimo(String nome, String cpf, int idade) {
		
		if (idade < 18) {
			System.out.println("não podem receber nenhum tipo de empréstimo, pois e menor de 18 anos");
		}
		if (idade >= 18 && idade < 25 && this.score == 300) {
			System.out.println("voce tem direito a o Emprestimo!");
		}
		

	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getScore() {
		return score;
	}

	public int setScore(int score) {
		this.score = score;
		if (score >= 1000) {
			return score = 1000;
		}
		return score;
	}


	public double getRenda() {
		return renda;
	}
	

	public double setRenda(double renda) {
		if (renda < 0 ) {
			System.out.println("nao pode valor negativo!!!!");
			return this.renda = 0;
		}
		if (this.score < 100) {
			System.out.println("não podem receber nenhum tipo de empréstimo");
		}
		if (this.score >= 100 && this.score <= 500) {
			System.out.println("seu emprestimo e de: " + getRenda() * 6);
			return this.renda = this.renda * 6;

		}
		if (this.score > 500) {
			System.out.println("seu emprestimo e de: " + getRenda() * 12);
			return this.renda = this.renda * 12;

		}
		
		return this.renda = renda;
		
	}

}
