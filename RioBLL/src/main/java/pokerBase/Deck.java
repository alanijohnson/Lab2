package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck  {
	public static void main(String[] args){
	//creates an array for the deck of cards
	int[] deck = new int[52];
	
	
	//create cards in the deck (0-51)
	for(int i=0; i<=51 ;i++){
		deck[i]=i;
	}
	
	//shuffle the cards
	for (int i=0; i <=51;i++){
		int newindex = (int)(Math.random()*51);
		int temp = deck[i];
		deck[i] = deck[newindex];
		deck[newindex] = temp;}
	
	/* print shuffled deck
		for(int i=0; i<=51 ;i++){
			System.out.println(deck[i]); */
		}
	public int getDeckSize(int Deck[]){
	//TODO look up return statements
		//return int Deck.length()
	}

	
	
}
