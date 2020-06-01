package account;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int n = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금  | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();
			sc.nextLine();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;

			default:
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		String ano;
		String owner;
		int balance;

		System.out.print("계좌번호 : ");
		ano = sc.nextLine();
		System.out.print("계좌주 : ");
		owner = sc.nextLine();
		System.out.print("초기입금액 : ");
		balance = sc.nextInt();

		accountArray[n] = new Account(ano, owner, balance);
		n++;

		System.out.println("결과 : 계좌가 생성되었습니다.");

	}

	private static void accountList() {
		System.out.println("---------------------");
		System.out.println("계좌번호\t계좌주\t예금액");
		System.out.println("---------------------");
		for (int i = 0; i < n; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		String ano;
		int money;

		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		ano = sc.nextLine();

		System.out.print("예금액 : ");
		money = sc.nextInt();
		findAccount(ano).setBalance(money + findAccount(ano).getBalance());

		System.out.println("예금이 성공되었습니다.");
	}

	private static void withdraw() {
		String ano;
		int money;

		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		ano = sc.nextLine();

		System.out.print("출금액 : ");
		money = sc.nextInt();
		if (findAccount(ano).getBalance() > money) {
			findAccount(ano).setBalance(findAccount(ano).getBalance() - money);
			System.out.println("출금이 성공되었습니다.");
		}
		else
			System.out.println("잔액이 부족합니다.");
	}

	private static Account findAccount(String ano) {
		Account result = null;
		for (int i = 0; i < n; i++) {
			if (accountArray[i].getAno().equals(ano))
				result = accountArray[i];
			else
				System.out.println("존재하지 않는 계좌 입니다.");
		}
		return result;
	}
}
