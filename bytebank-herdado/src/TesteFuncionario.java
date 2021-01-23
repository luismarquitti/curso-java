
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente luis = new Gerente();
		
		luis.setNome("Luís Eduardo");
		luis.setCpf("374.672.318-3");
		luis.setSalario(3000);
		
		System.out.println(luis.getNome());
		System.out.println(luis.getBonificacao());
		

	}

}
