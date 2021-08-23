
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaLarissa = new Conta();
		contaDaLarissa.deposita(150);
		System.out.println(contaDaLarissa.saldo);
		
		boolean conseguiuSacar = contaDaLarissa.saca(250);
		System.out.println(contaDaLarissa.saldo);
		System.out.println(conseguiuSacar);
	}
}
