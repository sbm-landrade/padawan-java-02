package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
		contaDoLucas.deposita(50);
		System.out.println(contaDoLucas.saldo);
		
		boolean conseguiuRetirar = contaDoLucas.saca(20);
		System.out.println(contaDoLucas.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDoLucas);
		if (sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLucas.saldo);
	}
}
