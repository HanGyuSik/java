package BackJun03;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.printf("Case #%d : %d + %d = %d\n", i, a, b, a + b);
		}
		sc.close();
	}
}
