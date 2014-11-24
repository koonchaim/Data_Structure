package Assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunShop {

	public static void main(String[] args) {
		Orders orders = new Orders();
		int num = 0; // ตัวที่จะนำไปเปรียบเทียบค่าในเงื่อนไข
		Scanner input = new Scanner(System.in);
		// Menu menu = new Menu();
		ArrayList<Item> list = new ArrayList<Item>();
		do {
			try {

				System.out
						.println("\n*******************************************************************\n"
								+ "\tWelcome to the IT Shop House!\n\n"
								+ "\t\t1. ซื้อสินค้า (Buy Item)\n"
								+ "\t\t2. ขายสินค้า (Sell Item)\n"
								+ "\t\t3. จบการทำงาน (Exit)\n\n"
								+ "\tกรุณาเลือกหมายเลขเพื่อรับการบริการตั้งแต่1 - 3\n"
								+ "*******************************************************************\n");
				num = input.nextInt();

				if (num < 1 || num > 3) {
					throw new Exception("กรุณากรอกค่าตัวเลข 1-3 เท่านั้น \n");
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
				System.out.println("กรุณากรอกเฉพาะตัวเลข !!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (num != 3);
		System.out
				.println("******************************Exit*********************************");
	}
}
