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
		System.out.println(hand.getHandStrength());;
		System.out.println(hand.getHiHand());
		System.out.println(hand.getLoHand());
		
		//multiple hands
		System.out.println("\n\n\n\n\n\n\nScoreTesting");
		Hand hand2 = new Hand();
		hand2.AddCards(deck1);
		ArrayList<Hand> hands1 = new ArrayList<>();
		
		Hand hand01= new Hand(new Card(0, 2), new Card(1,7 ), new Card(2,9), new Card(1, 0), new Card(4,3));
		Hand hand02= new Hand(new Card(0, 2), new Card(1,7), new Card(2,10), new Card(1, 0), new Card(4,3));
		Hand hand03= new Hand(new Card(0, 2), new Card(1,2 ), new Card(2,3), new Card(1, 3), new Card(4,9));
		Hand hand04= new Hand(new Card(0, 1), new Card(1,1 ), new Card(2,3), new Card(1, 3), new Card(4,9));
			
		hands1.add(hand03);
		hands1.add(hand02);
		hands1.add(hand04);
		hands1.add(hand01);
		
		
		HandScore hs2 = new HandScore();
		hs2.ScoreHand(hands1);
		}
	
	
	}

