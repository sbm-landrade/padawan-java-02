
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente lucas = new Cliente();
		//conta.titular = lucas;
		lucas.setNome("Lucas Andrade");
		
		conta.setTitular(lucas);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("estágiario");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("estágiario");
		
		System.out.println(titularDaConta);
		System.out.println(lucas);
		System.out.println(conta.getTitular());
	}
}
