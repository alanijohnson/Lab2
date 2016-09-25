package pokerBase;

import java.util.ArrayList;
//import java.util.Collections;

public class Deck {
	private ArrayList<Card> mydeck; //my deck is only available to each instance

	public Deck() {
		mydeck = getDeckCards(); //calls get Deck cards to make the deck when an instance is created
	}

	private ArrayList<Card> getDeckCards(){
				// creates an array for the deck of cards
				ArrayList<Card> getdeck = new ArrayList<>();
				for (int i = 0; i <= 51; i++) {
					getdeck.add(new Card(i));
				}
				
				// shuffle the cards
				for (int i = 0; i <= getdeck.size()-1; i++) {
					int newindex = (int) (Math.random() * getdeck.size());
					Card temp = getdeck.get(i);
					getdeck.set(i, getdeck.get(newindex));
					getdeck.set(newindex, temp);
				}
				return getdeck;
	}

	public int getDeckSize() {
		return mydeck.size();
	}

	public Card DrawCard() {
		/*//Chooses random card from deck
		int cardindex = (int) (Math.random() * mydeck.size());
		Card card = mydeck.get(cardindex);
		mydeck.remove(cardindex);*/
		
		//draw first card in deck
		Card card = mydeck.get(0);
		mydeck.remove(0);
		
		return card;
	}
	
}
