package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

public class Hand {
	protected ArrayList<Card> myHand = new ArrayList<>();
	private UUID HandID;
	private boolean bScored;
	private int Hand_Strength;
	private int HiHand;
	private int LoHand;
	
	public Hand() {
		//HandScore hs = new HandScore();
		HandID = UUID.randomUUID();
		bScored = false;
		//this.Hand_Strength = hs.ScoreHand();
		//this.HiHand = hs.getHiHand();
		//this.LoHand = hs.getLoHand();

	}
	
	public int getHandStrength(){
		return Hand_Strength;
	}
	
	public static Comparator<Card> COMPARE_BY_RANK = new Comparator<Card>() {
	    public int compare(Card one, Card other) {
	    return Integer.valueOf(one.getCardRank()).compareTo(other.getCardRank()); //ascending sort
	    }
	};
	
	public static Comparator<Card> COMPARE_BY_SUIT = new Comparator<Card>() {
	    public int compare(Card one, Card other) {
	    return Integer.valueOf(one.getCardSuit()).compareTo(other.getCardSuit()); //ascending sort
	    }
	};	
	
		
public void SortHand() {
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		// print deck					
		//TODO delete print deck
		System.out.println("Printing Sorted Hand:");
		for (int i = 0; i <= myHand.size() - 1; i++) {
			System.out.println(myHand.get(i).getCardNbr());
		}
	}

	public Card GetCard(int i){
		return myHand.get(i);
	}
	
	public void AddCards(Deck deck){
		for (int i=0; i<5; i++){
			Card pick = deck.DrawCard();
			//TODO delete print card
			System.out.println("Card " + i + ": " + pick.getCardNbr());
			myHand.add(pick);
		}
	}
}
