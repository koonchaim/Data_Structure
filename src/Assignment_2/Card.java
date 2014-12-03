package Assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Card {

	public static <E> List<E> dealHand(List<E> deck, int n) {
		int deckSize = deck.size();
		List<E> handView = deck.subList(deckSize - n, deckSize);
		List<E> hand = new ArrayList<E>(handView);
		handView.clear();
		return hand;
	}

	public static void main(String[] args) throws Exception {
		int exit = 1;
		while (exit == 1) {
			String[] suit = new String[] { "โพธิ์ดำ", "หัวใจ", "ข้าวหลามตัด", "ดอกจิก" };
			String[] rank = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9",
					"10", "J", "Q", "K" };

			LinkedList<String> deck = new LinkedList<String>();
			for (int i = 0; i < suit.length; i++) {
				for (int j = 0; j < rank.length; j++) {
					deck.add(rank[j] + suit[i]);
				}
			}
			Collections.shuffle(deck);

			Scanner input1 = new Scanner(System.in);
			System.out.print("กรุณากรอกจำนวนไพ่ที่จะแจก  : ");
			int card = input1.nextInt();
			if (card < 2 || card > 5) {
				throw new Exception("กรุณากรอกจำนวนไพ่ที่จะแจกตัวเลข 2-5 เท่านั้น \n");
			}

			Scanner input2 = new Scanner(System.in);
			System.out.print("กรุณากรอกจำนวนผู้เล่น  : ");
			int peple = input2.nextInt();
			if (peple < 2 || peple > 4) {
				throw new Exception("กรุณากรอกจำนวนผู้เล่นตัวเลข 2-4 เท่านั้น \n");
			}
			int count = 1;

			for (int i = 0; i < peple; i++) {
				System.out.println("คนที่ " + count + " : " + dealHand(deck, card));
				count++;
			}

			Scanner input3 = new Scanner(System.in);
			System.out.print("\nกด 1 เพื่อเล่นต่อ หรือ กดตัวเลขใดๆเพื่อออกจากโปรแกรม : ");
			exit = input3.nextInt();

		}
		System.out
				.print("=============================== EXIT ===============================");
	}

}
