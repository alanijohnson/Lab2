package pokerBase;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class HandScore {
	private ArrayList<Card> Kickers = new ArrayList<>();
	private ArrayList<Hand> AllHands = new ArrayList<>();
	private int HandStrength;
	private int HiHand;
	private int LoHand;
	
	
	public HandScore(){
		
	}
		
	public HandScore(ArrayList<Hand> Hands){
		for (int i=0; i<Hands.size()-1;i++){
			Hand Singlehand = Hands.get(i);
			for (int d=0;d<=4;d++){
				Singlehand.GetCard(d);
			}
		}
		
	}
	
	public int HighCard(){
		for (int d=0;d<=4;d++){
			Singlehand.GetCard(d);}
		
	}
	public int LoCard(){
		
	}
	public int Run(){
		for (int i=0; i<=3;i++){
			if ((hand.GetCard(i).getCardRank + 1) == hand.GetCard(i+1).getCardRank()){
				
			}
	}

	public int Set(Hand hand, int SetOf){
		//TODO Fix this whole method
		//create a list to store location of duplicates
		ArrayList<Integer> duplicates = new ArrayList<>();
		//ensure that hand is sorted
		hand.SortHand();
		boolean setofExists = false;
		int pairPos;
		//go through loop and check two adjacent cards. If same add to duplicates list
		for (int i=0; i<=3;i++){
		if (hand.GetCard(i).getCardRank == hand.GetCard(i+1).getCardRank()){
			duplicates.add(i)
		}
		
		}
	}
	
	
	public int SameSuit(){
		
	}
	public ArrayList<Card> Kickers(){
	
	}

	public int setHandStrength(Hand Hand){
		
	}

	public int 

	
/* 1. Royal Flush - Must be AKQJ10 of same suit
 * 					High Card = 13 Low Card = 9
 * 2. Straight Flush - Must be Run of 5, same suit
 * 					   High Card - Low Card = 4
 * 3. Four of a Kind - Must be a Set of 4
 * 4. Full house - Set of 2 (low) + Set of 4 (high)
 * 				   Set of 2 (high) + Set of 2 (low)
 * 5. Flush - Same suit for all cards
 * 6. Straight - Run of 5
 * 7. Three of a Kind - Set of 3
 * 8. Pair - Set of 2 + Set of 2
 * 9. No Pair - use high card
 */
}

