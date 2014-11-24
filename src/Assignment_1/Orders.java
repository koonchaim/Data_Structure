package Assignment_1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Orders {
	ArrayList<Item> orderList = new ArrayList<Item>();

	public void listOrders() throws IOException {
		Orders sc1 = new Orders();
		File file = new File("orders.txt");
		Scanner scanner = new Scanner(file);
		System.out.println("รหัสสินค้า" + "\t" + "ชื่อสินค้า" + "\t" + "ราคาสินค้า");
		while (scanner.hasNext()) {
			String text = scanner.nextLine();
			Scanner data = new Scanner(text);

			String id = data.next(); // บันทึกตัวอักษรวรรคที่ 1
			String name = data.next(); // บันทึกตัวอักษรวรรคที่ 2
			String price = data.next(); // บันทึกตัวอักษรวรรคที่ 3

			System.out.println(id + "\t" + name + "\t" + price);
		}
		scanner.close();
	}

	public ArrayList<Item> BuyItems() throws IOException {
		int num = 0;

		do {
			Scanner input = new Scanner(System.in);
			System.out.print("กรุณากรอกรหัสสินค้า  : ");
			String IdOrder = input.next();

			File file = new File("orders.txt");
			Scanner scanner = new Scanner(file);

			if (scanner.hasNext()) {
				while (scanner.hasNext()) {
					String data = scanner.nextLine();
					Scanner input1 = new Scanner(data);
					String id = input1.next();
					String name = input1.next();
					String price = input1.next();
					if (id.equals(IdOrder)) {
						Scanner inputQty = new Scanner(System.in);
						System.out.print("กรอกจำนวน : ");
						int qty = inputQty.nextInt();

						Item item = new Item(id, name, price, qty);
						orderList.add(item);
						System.out.println("====================================");
						System.out.println("รหัสสินค้า\tชื่อสิค้า\tราคา\tจำนวน\tรวม");
						System.out.println("====================================");
						int sum = 0;
						for (Item items : orderList) {
							System.out.println(items.getId()
									+ "\t"
									+ items.getName()
									+ "\t"
									+ items.getPrice()
									+ "\t"
									+ items.getQty()
									+ "\t"
									+ (Integer.parseInt(items.getPrice()) * items
											.getQty()));
							sum += (Integer.parseInt(items.getPrice()) * items.getQty());
						}
						System.out.println("====================================");
						System.out.println("Total : " + sum + " ฿");
						System.out.println("====================================");
					}
				}
			}
			Scanner inputExit = new Scanner(System.in);
			System.out.print("กด 1 เพื่อซื้อต่อ กด 2 เพื่อออกจากรายการ : ");
			num = inputExit.nextInt();

			scanner.close();
		} while (num != 2);
		return orderList;
	}

	public void SellItem(ArrayList<Item> buy) {
		int sum = 0, total = 0, count = 1;
		System.out.println("====================================");
		System.out.println("ลำดับ\tรหัสสินค้า\tชื่อสิค้า\tราคา\tจำนวน\tรวม");
		System.out.println("====================================");
		for (Item item : buy) {
			System.out.println(count + "\t" + item.getId() + "\t" + item.getName() + "\t"
					+ item.getPrice() + "\t" + item.getQty() + "\t"
					+ (Integer.parseInt(item.getPrice()) * item.getQty()));
			sum += (Integer.parseInt(item.getPrice()) * item.getQty());
			count++;
		}
		System.out.println("====================================");
		System.out.println("Total : " + sum + " ฿");
		System.out.println("====================================");

		Scanner inputRemove = new Scanner(System.in);
		System.out.print("กรอกลำดับที่ต้องการขาย : ");
		int num = inputRemove.nextInt();

		int remove = num - 1;

		buy.remove(remove);
		count = 1;
		System.out.println("====================================");
		System.out.println("ลำดับ\tรหัสสินค้า\tชื่อสิค้า\tราคา\tจำนวน\tรวม");
		System.out.println("====================================");
		for (Item item : buy) {
			System.out.println(count + "\t" + item.getId() + "\t" + item.getName() + "\t"
					+ item.getPrice() + "\t" + item.getQty() + "\t"
					+ (Integer.parseInt(item.getPrice()) * item.getQty()));
			total += (Integer.parseInt(item.getPrice()) * item.getQty());
			count++;
		}
		System.out.println("====================================");
		System.out.println("Total : " + total + " ฿");
		System.out.println("====================================");
	}
}
