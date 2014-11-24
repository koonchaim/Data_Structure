package Assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunShop {

	public static void main(String[] args) {
		Orders orders = new Orders();
		int num = 0; // ��Ƿ��й�����º��º�������͹�
		Scanner input = new Scanner(System.in);
		// Menu menu = new Menu();
		ArrayList<Item> list = new ArrayList<Item>();
		do {
			try {

				System.out
						.println("\n*******************************************************************\n"
								+ "\tWelcome to the IT Shop House!\n\n"
								+ "\t\t1. �����Թ��� (Buy Item)\n"
								+ "\t\t2. ����Թ��� (Sell Item)\n"
								+ "\t\t3. ����÷ӧҹ (Exit)\n\n"
								+ "\t��س����͡�����Ţ�����Ѻ��ú�ԡ�õ����1 - 3\n"
								+ "*******************************************************************\n");
				num = input.nextInt();

				if (num < 1 || num > 3) {
					throw new Exception("��سҡ�͡��ҵ���Ţ 1-3 ��ҹ�� \n");
				}

				switch (num) {
				case (1):
					orders.listOrders();
					list = orders.BuyItems();
					break;
				case (2):
					orders.SellItem(list);
					break;

				default:
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("��سҡ�͡੾�е���Ţ !!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (num != 3);
		System.out
				.println("******************************Exit*********************************");
	}
}
