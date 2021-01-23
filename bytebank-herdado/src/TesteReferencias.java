
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000);
		
		EditorVideo eVideo = new EditorVideo();
		eVideo.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(eVideo);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());

	}

}
