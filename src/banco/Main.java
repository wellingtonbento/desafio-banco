package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Cliente novoCliente;
		Conta contaC;
		Conta contaP;

		System.out.println("==Escolha uma das opções==");
		System.out.println("1 - Criar conta corrente");
		System.out.println("2 - Criar conta poupança");
		System.out.println("==========================");
		int opcaoSelecionada = scanner.nextInt();
		switch (opcaoSelecionada) {
		case 1: {
			System.out.print("Infomer seu nome para criar a conta corrente: ");
			String nome = scanner.next();
			novoCliente = new Cliente(nome);
			contaC = new ContaCorrente(novoCliente);
			System.out.print("Digite o saldo que deseja inserir: ");
			double valorParaConta = scanner.nextDouble();
			contaC.depositar(valorParaConta);
			contaC.imprimirExtrato();
			break;
		}
		case 2: {
			System.out.print("Infomer seu nome para criar a conta poupança: ");
			String nome = scanner.next();
			novoCliente = new Cliente(nome);
			contaP = new ContaPoupanca(novoCliente);
			System.out.print("Digite o saldo que deseja inserir: ");
			double valorParaConta = scanner.nextDouble();
			contaP.depositar(valorParaConta);
			contaP.imprimirExtrato();
			break;
		}

		}
		scanner.close();
	}
}