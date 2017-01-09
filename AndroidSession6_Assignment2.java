package prapul;

import java.util.Scanner;

public class AndroidSession6_Assignment2 {

	public static void main(String[] args) {
		Scanner InputNumber = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = InputNumber.nextInt();
		Prime Prime1 = new Prime(n);
		Thread thread1 = new Thread(Prime1);
		thread1.start();
		InputNumber.close();
	}

}

class Prime implements Runnable {
	int n;

	public Prime(int n) {
		super();
		this.n = n;
	}

	void FindingPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("The entered number is a prime number ");
		} else {
			System.out.println("The entered number is not a prime number");
		}
	}

	@Override
	public void run() {
		FindingPrime(n);
	}

}