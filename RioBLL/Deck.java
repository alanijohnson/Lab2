package pokerBase;

import java.util.ArrayList;
//import java.util.Collections;

public class Deck {
	private ArrayList<Card> mydeck; //my deck is only available to each instance

	/*public static void main(String[] args) {
					}*/
	
	public Deck() {
		mydeck = getDeckCards();
		//TODO delete println
		System.out.println("Deck Created");
	}

	private ArrayList<Card> getDeckCards(){
		// creates an array for the deck of cards
				ArrayList<Card> getdeck = new ArrayList<>();
				// deck = new ArrayList(52);

				// create cards in the deck (0-51)
				for (int i = 0; i <= 10; i++) {
					getdeck.add(new Card(i));
				}
				//Collections.shuffle(getdeck);
				// shuffle the cards
				for (int i = 0; i <= getdeck.size()-1; i++) {
					int newindex = (int) (Math.random() * 51);
					Card temp = getdeck.get(i);
					getdeck.set(i, getdeck.get(newindex));
					getdeck.set(newindex, temp);
				}
				//TODO delete println
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
		/*//Chooses random card from deck
		int cardindex = (int) (Math.random() * mydeck.size());
		Card card = mydeck.get(cardindex);
		mydeck.remove(cardindex);*/
		
		//draw first card in deck
		Card card = mydeck.get(0);
		mydeck.remove(0);
		
		//TODO delete print line
		System.out.println("Print Card: " + card);
		System.out.println(" ");
		// print deck
		System.out.println("Printing Deck");
		for (int i = 0; i <= mydeck.size()-1; i++) {
			System.out.println(mydeck.get(i).getCardNbr());}
		return card;
	}
	
}
