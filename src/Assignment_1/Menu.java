package Assignment_1;

import java.io.IOException;

public class Menu {
	public void BuyItems() throws IOException {
		Orders cof = new Orders();
		System.out.println("-- รายชื่อสินค้าทั้งหมด --");
		cof.BuyItems();
	}
}
