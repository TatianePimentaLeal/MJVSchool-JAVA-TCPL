package class_diagram_TCPL;

public class CadastroSistema {

	public static void main(String[] args) {
		
	Cadastro cadastro1 = new Cadastro (1, "334.576.928-07", "Tatiane", "tatyplummer07@gmail.com", "16/11/1985", "FotoTaty");
		System.out.println(cadastro1);
		System.out.println(cadastro1.getCpf());

	}

}
