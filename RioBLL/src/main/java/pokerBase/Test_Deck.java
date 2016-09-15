package pokerBase;

import java.util.ArrayList;

public class Test_Deck {
	public static void main(String[] args){
		Deck deck1 = new Deck();
		System.out.println(" ");
		System.out.println(deck1.getDeckSize());
		Card card = deck1.DrawCard();
		System.out.println("Print var card: "+card.getCardNbr());
		System.out.println("Print card rank: "+card.getCardRank());
		System.out.println("Print card suit: " +card.getCardSuit());
		System.out.println("New Size: " + deck1.getDeckSize());
		}
	}

