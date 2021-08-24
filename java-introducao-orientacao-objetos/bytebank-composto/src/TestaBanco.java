
public class TestaBanco {
	public static void main(String[] args) {
		Cliente larissa = new Cliente();
		larissa.nome = "Larissa Pereira";
		larissa.cpf = "123.456.789-10";
		larissa.profissao = "Programadora";

		Conta contaDaLarissa = new Conta();
		contaDaLarissa.titular = larissa;
		System.out.println(contaDaLarissa.titular.profissao);
		
	}
}