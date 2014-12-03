package Assignment_3;

import java.util.Scanner;
import java.util.Stack;

public class RunBurger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		Stack<String> hamburger = new Stack<String>();

		// ===== Meat =====
		menu.ListMeat();
		Scanner input1 = new Scanner(System.in);
		System.out.print("กรุณากรอกรหัสประเภทของเนื้อ  : ");
		int meat = input1.nextInt();
		String menu1 = "Meat - " + menu.getMeat(meat);
		hamburger.push(menu1);

		// ===== Bread =====
		menu.ListBread();
		Scanner input2 = new Scanner(System.in);
		System.out.print("กรุณากรอกรหัสประเภทของขนมปัง  : ");
		int bread = input2.nextInt();
		String menu2 = "Bread - " + menu.getBread(bread);
		hamburger.push(menu2);

		// ===== Cheese =====
		menu.ListCheese();
		Scanner input3 = new Scanner(System.in);
		System.out.print("กรุณากรอกรหัสประเภทของซีส  : ");
		int cheese = input3.nextInt();
		String menu3 = "Cheese - " + menu.getCheese(bread);
		hamburger.push(menu3);

		// ===== Sauce =====
		menu.ListSauce();
		Scanner input4 = new Scanner(System.in);
		System.out.print("กรุณากรอกรหัสประเภทของซอส : ");
		int sauce = input4.nextInt();
		String menu4 = "Sauce - " + menu.getSauce(sauce);
		hamburger.push(menu4);

		// ===== Toppings =====
		Scanner top = new Scanner(System.in);
		System.out.print("กรุณากรอกจำนวน Toppings ที่ต้องการเพิ่ม : ");
		int tops = top.nextInt();
		for (int i = 0; i < tops; i++) {
			menu.ListToppings();
			Scanner input5 = new Scanner(System.in);
			System.out.print("กรุณากรอกรหัสประเภทของส่วนผสม : ");
			int toppings = input5.nextInt();
			String menu5 = "Toppings - " + menu.getToppings(toppings);
			hamburger.push(menu5);
		}

		System.out.println("Raw material Hamburger");
		for (int i = 0; i < hamburger.size(); i++) {
			System.out.println(hamburger.get(i));
		}

	}
}
