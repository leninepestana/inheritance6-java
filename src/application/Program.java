package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Can not instantiate abstract class Account
		// Account acc1 = new Account(1001, "Maria", 1000.00);
		/*
		 * Account acc2 = new SavingsAccount(1002, "Alex", 1000.0, 0.01); Account acc3 =
		 * new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		 */

		// Supor que queremos somar o saldo de todas as contas
		// Supor que queremos depositar 10.00 em todas as contas
		// Isso é + fácil de implementar se tivermos uma classe genérica Account
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 300.00, 0.01));
		list.add(new SavingsAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1003, "Bob", 1000.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 700.00, 300.00));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();

		}

		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account cc : list) {
			cc.deposit(10.00);
		}
		
		System.out.println("Updated value:");
		
		for (Account cc : list) {
			System.out.printf("Account: %d, Holder: %s, Balance: %.2f%n", cc.getNumber(), cc.getHolder(), cc.getBalance());
		}

		sc.close();
	}
}
