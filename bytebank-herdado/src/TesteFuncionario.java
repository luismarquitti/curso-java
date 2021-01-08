
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario luis = new Funcionario();
		
		luis.setNome("Luís Eduardo");
		luis.setCpf("374.672.318-3");
		luis.setSalario(3000);
		
		System.out.println(luis.getNome());
		System.out.println(luis.getBonificacao());
		

	}

}
