
public class TestaCondicionaisBol {
	public static void main(String[] args) {
		int idade = 17;
		int quantidadePessoas = 1;
		
		//testando OU
		// if (idade >= 18 || quantidadePessoas >= 2) {
		// System.out.println("você é bem-vindo");
		// } else {
		// System.out.println("voce nao pode entrar");
		// }
		
		//Testando E
		//if (idade >= 18 && quantidadePessoas >= 2) {
		//	System.out.println("você é bem-vindo");
		//} else {
		//	System.out.println("voce nao pode entrar");
		//}
		boolean acompanhado = quantidadePessoas >= 1;
		
		if (idade >= 18 && acompanhado == true) {
			System.out.println("você é bem-vindo");
		} else {
			System.out.println("voce nao pode entrar");
		}
	}
}
