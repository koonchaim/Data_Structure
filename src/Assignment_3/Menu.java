package Assignment_3;

import java.util.ArrayList;

public class Menu {
	public void ListMeat() {
		ArrayList<String> meat = new Meat().listMeat();
		System.out.println("===== Meat =====");
		for (int i = 0; i < meat.size(); i++) {
			System.out.println(" - " + (i + 1) + ". " + meat.get(i));
		}
	}

	public void ListBread() {
		ArrayList<String> breads = new Bread().listBread();
		System.out.println("===== Bread =====");
		for (int i = 0; i < breads.size(); i++) {
			System.out.println(" - " + (i + 1) + ". " + breads.get(i));
		}
	}

	public void ListCheese() {
		ArrayList<String> cheese = new Cheese().listCheese();
		System.out.println("===== Cheese =====");
		for (int i = 0; i < cheese.size(); i++) {
			System.out.println(" - " + (i + 1) + ". " + cheese.get(i));
		}
	}

	public void ListSauce() {
		ArrayList<String> sauce = new Sauce().listSauce();
		System.out.println("===== Sauce =====");
		for (int i = 0; i < sauce.size(); i++) {
			System.out.println(" - " + (i + 1) + ". " + sauce.get(i));
		}
	}

	public void ListToppings() {
		ArrayList<String> toppings = new Toppings().listToppings();
		System.out.println("===== Toppings =====");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" - " + (i + 1) + ". " + toppings.get(i));
		}
	}

	public String getMeat(int meatID) {
		ArrayList<String> meat = new Meat().listMeat();
		meatID = meatID - 1;
		return meat.get(meatID);
	}

	public String getBread(int breadID) {
		ArrayList<String> breads = new Bread().listBread();
		breadID = breadID - 1;
		return breads.get(breadID);
	}

	public String getCheese(int cheeseID) {
		ArrayList<String> cheese = new Cheese().listCheese();
		cheeseID = cheeseID - 1;
		return cheese.get(cheeseID);
	}

	public String getSauce(int sauceID) {
		ArrayList<String> sauce = new Sauce().listSauce();
		sauceID = sauceID - 1;
		return sauce.get(sauceID);
	}

	public String getToppings(int toppingsID) {
		ArrayList<String> toppings = new Toppings().listToppings();
		toppingsID = toppingsID - 1;
		return toppings.get(toppingsID);
	}

}
