package test;

public class Calendar {
	public static void main(String[] args) {
		int[] Month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int InitDay = 2;

		for (int i = 0; i < 12; i++) {
			System.out.println(i + 1 + "�� �޷�");
			System.out.println("��    ��    ȭ    ��    ��    ��    ��");
			for (int j = 0; j < InitDay; j++) {
				System.out.print("   ");
			}

			for (int j = 0; j < Month[i]; j++) {
				System.out.printf("%2d ", j + 1);
				if ((InitDay + j) % 7 == 6) {
					System.out.println();
				}
			}

			InitDay = (InitDay + Month[i]) % 7;
			System.out.println("\n");
		}
	}
}
