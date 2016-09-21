package pokerBase;

import java.util.ArrayList;

public class Test_Deck {
	public static void main(String[] args){
		System.out.println("Start Testing \nMake New Deck");
		Deck deck1 = new Deck();
		System.out.println(" ");
		System.out.println("Deck Size: "+ deck1.getDeckSize());
		System.out.println("\nDraw Card");
		Card card = deck1.DrawCard();
		System.out.println("Print var card: "+card.getCardNbr());
		System.out.println("Print card rank: "+card.getCardRank());
		System.out.println("Print card suit: " +card.getCardSuit());
		System.out.println("New Size: " + deck1.getDeckSize());
		deck1.DrawCard();
		System.out.println("New Size: " + deck1.getDeckSize());
		
		/*ArrayList<Card> cardstack = new ArrayList<>();
		//cardstack.add(new Card((int)(Math.random()*51)));
		Card pick = deck1.DrawCard();
		cardstack.add(pick);
		System.out.println("Pick " + pick +" added");
		System.out.println(cardstack.get(0).getCardNbr());
		System.out.println(cardstack.get(0).getCardSuit());
		System.out.println(cardstack.get(0).getCardRank()); */
		
		System.out.println("Hand Testing: ");
		Hand hand = new Hand();
		hand.AddCards(deck1);
		System.out.println("New Size: " + deck1.getDeckSize());
		hand.SortHand();
		
		//hand score testing
		System.out.println("\nHandScore");
		HandScore hs = new HandScore();
		}
	}

