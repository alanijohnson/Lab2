package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.UUID;

public class Hand {
	protected ArrayList<Card> myHand = new ArrayList<>();
	//private UUID HandID;
	//private boolean bScored;
	private int Hand_Strength;
	private int HiHand;
	private int LoHand;
	
	//constructor
	public Hand() {
		//HandID = UUID.randomUUID();
		//bScored = false;

	}
	public Hand(Card card1, Card card2, Card card3, Card card4, Card card5){
		myHand.add(card1);
		myHand.add(card2);
		myHand.add(card3);
		myHand.add(card4);
		myHand.add(card5);
	}
	
	
	//hand score
	public int getHandStrength(){
		HandScore hs = new HandScore(myHand);
		Hand_Strength = hs.getHandStrength();
		return Hand_Strength;
	}
	
	public int getHiHand(){
		HandScore hs = new HandScore(myHand);
		HiHand = hs.getHiHand();
		return HiHand;
	}
	
	public int getLoHand(){
		HandScore hs = new HandScore(myHand);
		LoHand = hs.getLoHand();
		return LoHand;
	}
	
	//comparators
	public static Comparator<Card> COMPARE_BY_RANK = new Comparator<Card>() {
		public int compare(Card one, Card other) {
			return Integer.valueOf(one.getCardRank()).compareTo(other.getCardRank()); // ascending
																						// sort
		}
	};

	public static Comparator<Card> COMPARE_BY_SUIT = new Comparator<Card>() {
		public int compare(Card one, Card other) {
			return Integer.valueOf(one.getCardSuit()).compareTo(other.getCardSuit()); // ascending
																						// sort
		}
	};
	
	//other hand methods
	public void SortHand() {
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
	}

	
	public Card GetCard(int i) {
		return myHand.get(i);
	}

	public void AddCards(Deck deck) {
		//Deck returnedDeck = deck;
		//if (deck.getDeckSize()>=5){
			for (int i = 0; i < 5; i++) {
				Card pick = deck.DrawCard();
				myHand.add(pick);
			}
		//}
		/*else{
			Deck deck2 = new Deck();
			System.out.println("New Deck was required");
			deck = deck2;
			this.AddCards(deck);
			
			}*/
		}
			
			
	}

