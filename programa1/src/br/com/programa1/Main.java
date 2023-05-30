package br.com.programa1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("João da Silva", "Rua A, 123", "(99) 9999-9999");

        cliente1.exibirInformacoes();

        cliente1.setEndereco("Avenida B, 456");

        cliente1.exibirInformacoes();
	}

}
