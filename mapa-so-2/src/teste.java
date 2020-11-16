
public class teste {

	public static void main(String[] args) {
		ContaParaEmprestimo c = new ContaParaEmprestimo("murilo", "2222222222", 50);
		
		c.setRenda(10000);
		c.setScore(500);
		System.out.println(c.getScore());
		

	}

}
