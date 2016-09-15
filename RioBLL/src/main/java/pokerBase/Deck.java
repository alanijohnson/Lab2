package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> mydeck; //my deck is only available to each instance

	/*public static void main(String[] args) {
					}*/
	
	public Deck() {
		//ArrayList<Integer> deckofcards = this.getDeckCards();
		//int decksize = this.getDeckSize()
		mydeck = getDeckCards();
		System.out.println("Deck Created");
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Card> getDeckCards(){
		// creates an array for the deck of cards
				ArrayList<Card> getdeck = new ArrayList<>();
				// deck = new ArrayList(52);

				// create cards in the deck (0-51)
				for (int i = 0; i <= 51; i++) {
					getdeck.add(new Card(i));
				}
				
				// shuffle the cards
				for (int i = 0; i <= getdeck.size()-1; i++) {
					int newindex = (int) (Math.random() * 51);
					Card temp = getdeck.get(i);
					getdeck.set(i, getdeck.get(newindex));
					getdeck.set(newindex, temp);
				}
				// print shuffled deck
				for (int i = 0; i <= getdeck.size()-1; i++) {
					System.out.println(getdeck.get(i).getCardNbr());
				}
				return getdeck;
	}

	public int getDeckSize() {
		return mydeck.size();
	}

	public Card DrawCard() {
		int cardindex = (int) (Math.random() * mydeck.size());
		Card card = mydeck.get(cardindex);
		mydeck.remove(cardindex);
		System.out.println("Print Card: " + card);
		System.out.println(" ");
		// print deck
		System.out.println("Printing Deck");
		for (int i = 0; i <= mydeck.size()-1; i++) {
			System.out.println(mydeck.get(i).getCardNbr());}
		return card;
	}
	
}
