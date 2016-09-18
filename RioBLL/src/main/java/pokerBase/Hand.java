package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

public class Hand {
	private ArrayList<Card> myHand = new ArrayList<>();
	private UUID HandID;
	private boolean bScored;

	public Hand() {
		HandID = UUID.randomUUID();
		bScored = false;

	}
	public static Comparator<Card> COMPARE_BY_RANK = new Comparator<Card>() {
	    public int compare(Card one, Card other) {
	    return Integer.valueOf(one.getCardRank()).compareTo(other.getCardRank()); //ascending sort
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
