
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaLarissa = new Conta();
		contaDaLarissa.deposita(150);
		System.out.println(contaDaLarissa.saldo);

		boolean conseguiuSacar = contaDaLarissa.saca(250);
		System.out.println(contaDaLarissa.saldo);
		System.out.println(conseguiuSacar);

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(2000);
		if (contaDoPaulo.transfere(350, contaDaLarissa)) {
			System.out.println("transferencia efetuada com sucesso");
		} else {
			System.out.println("transferencia nao efetuada");
		}
		System.out.println("Saldo da conta de Larissa é " + contaDaLarissa.saldo);
		System.out.println("Saldo da conta de Paulo é " + contaDoPaulo.saldo);
	}
}
