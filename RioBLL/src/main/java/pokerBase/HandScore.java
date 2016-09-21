package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class HandScore{
	private int Hand_Strength;
	public int HiHand;
	private int LoHand;
	private ArrayList<Card> Kickers = new ArrayList<>();
	private ArrayList<Card> myHand;
	
	//constructorss
	public HandScore(){
	}
	
	public HandScore(ArrayList<Card> myHand) {
		this.myHand = myHand;
	}
	
	public Hand ScoreHand(ArrayList<Hand> Hands){
		Collections.sort(Hands, HandScore.COMPARE_BY_STRENGTH);
		Hand winner = Hands.get(Hands.size()-1);
		winner.SortHand();
		//TODO remove print
		System.out.println("Hand with " + winner.GetCard(0).getCardRank() +"," + winner.GetCard(1).getCardRank() +","+ winner.GetCard(2).getCardRank()+","
				+ winner.GetCard(3).getCardRank()+"," + winner.GetCard(4).getCardRank() + " wins with a "+ winner.getHandStrength()+ "!");
		return winner;
	}
	
	//score the hand using methods for each hand type test
	public void ScoreHand(){
		//TODO remove print line
		System.out.println("Scoring Hand");
		
		//10. Royal Flush
		if (this.isRoyalFlush()){
			this.Hand_Strength = HandStrength.RoyalFlush.getValue();
		}
		//9. Straight Flush
		else if (this.isStraightFlush()){
			this.Hand_Strength = HandStrength.StraightFlush.getValue();
		}
		//8. Four of a Kind
		else if (this.isFour()){
			this.Hand_Strength = HandStrength.FourKind.getValue();
		}
		//7. Full House
		else if (this.isFullHouse()){
			this.Hand_Strength = HandStrength.FullHouse.getValue();
		}
		//6. Flush
		else if (this.isFlush()){
			this.Hand_Strength = HandStrength.Flush.getValue();
		}
		//5. Straight
		else if (this.isStraight()){
			this.Hand_Strength = HandStrength.Straight.getValue();
		}
		//4. Three of a Kind
		else if (this.isThree()){
			this.Hand_Strength = HandStrength.ThreeKind.getValue();
		}
		//3. Two Pair
		else if (this.is2Pairs()){
			this.Hand_Strength = HandStrength.TwoPair.getValue();
		}
		//2. One Pair
		else if (this.is1Pair()){
			this.Hand_Strength = HandStrength.OnePair.getValue();
		}
		else {
			this.Hand_Strength = HandStrength.NoPair.getValue();
			Collections.sort(myHand, Hand.COMPARE_BY_RANK);
			this.HiHand = myHand.get(4).getCardRank();
		}
		//TODO remove print line
		System.out.println("Hand Strength: "+  Hand_Strength);
		
	}
	
	//get variables
	public int getHandStrength(){
		this.ScoreHand();
		return this.Hand_Strength;
	}
	
	public int getHiHand(){
		this.ScoreHand();
		return this.HiHand;
	}
	
	public int getLoHand(){
		this.ScoreHand();
		return this.LoHand;
	}
	
	
	// Methods for each hand type

	//10. Royal flush
	public boolean isRoyalFlush(){
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		if (this.isFlush() 
				&& myHand.get(0).getCardRank() == CardRank.Ten.getValue()
				&& myHand.get(1).getCardRank() == CardRank.Jack.getValue()
				&& myHand.get(2).getCardRank() == CardRank.Queen.getValue()
				&& myHand.get(3).getCardRank() == CardRank.King.getValue()
				&& myHand.get(4).getCardRank() == CardRank.Ace.getValue()) {
			bool = true;
		}
		
		return bool;
	}

	//9. Straight Flush
	public boolean isStraightFlush(){
		boolean bool = false;
		if (this.isStraight() && this.isFlush()){
			bool = true;
			this.HiHand = myHand.get(4).getCardRank();
		}
		return bool;
	}
	
	//6. Flush - all cards have same suit
	public boolean isFlush() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_SUIT);
		if (myHand.get(0).getCardSuit() == myHand.get(4).getCardSuit()) {
			bool = true;
			this.HiHand = myHand.get(4).getCardRank();
		}
		return bool;

	}

	//8. Four cards with same rank
	public boolean isFour() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		if (myHand.get(0).getCardRank() == myHand.get(3).getCardRank()) {
			bool = true;
			Kickers.add(myHand.get(4));
			this.HiHand = myHand.get(0).getCardRank();
		} else if (myHand.get(1).getCardRank() == myHand.get(4).getCardRank()) {
			bool = true;
			Kickers.add(myHand.get(0));
			this.HiHand = myHand.get(1).getCardRank();
		}
		return bool;
	}

	//4. Three cards with the same rank
	public boolean isThree() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		for (int i = 0; i < 3; i++) {
			if (myHand.get(i).getCardRank() == myHand.get(i + 2).getCardRank()) {
				bool = true;
				// add kickers using switch statement
				switch (i) {
				case 0:
					Kickers.add(myHand.get(3));
					Kickers.add(myHand.get(4));
					this.HiHand = myHand.get(0).getCardRank();
					break;
				case 1:
					Kickers.add(myHand.get(0));
					Kickers.add(myHand.get(4));
					this.HiHand = myHand.get(1).getCardRank();
					break;
				case 2:
					Kickers.add(myHand.get(0));
					Kickers.add(myHand.get(1));
					this.HiHand = myHand.get(2).getCardRank();
					break;
				}
				}
		}
		return bool;
	}

	//7. Full house - Set of 3 and Set of 2
	public boolean isFullHouse() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		if ((myHand.get(0).getCardRank() == myHand.get(2).getCardRank())
				&& (myHand.get(3).getCardRank() == myHand.get(4).getCardRank())) {
			bool = true;
			this.HiHand = myHand.get(0).getCardRank(); // set of 3
			this.LoHand = myHand.get(4).getCardRank(); // set of 2
		} else if ((myHand.get(0).getCardRank() == myHand.get(1).getCardRank())
				&& (myHand.get(2).getCardRank() == myHand.get(4).getCardRank())) {
			bool = true;
			this.HiHand = myHand.get(4).getCardRank();
			this.LoHand = myHand.get(0).getCardRank();
		}
		return bool;
	}

	//5. Straight - 5consecutive cards
	public boolean isStraight() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		if ((myHand.get(0).getCardRank()+1 == (myHand.get(1).getCardRank()))
				&& (myHand.get(1).getCardRank()+1 == (myHand.get(2).getCardRank()))
				&& (myHand.get(2).getCardRank()+1 == (myHand.get(3).getCardRank()))
				&& (myHand.get(3).getCardRank()+1 == (myHand.get(4).getCardRank()))) {
			bool = true;
			this.HiHand = myHand.get(4).getCardRank();
		}
		return bool;
	}

	//2. 1 pair of cards
	public boolean is1Pair() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		for (int i = 0; i < 4; i++) {
			if (myHand.get(i).getCardRank() == myHand.get(i + 1).getCardRank()) {
				bool = true;
				// add kickers using switch statement
				switch (i) {
				case 0:
					Kickers.add(myHand.get(2));
					Kickers.add(myHand.get(3));
					Kickers.add(myHand.get(4));
					this.HiHand = myHand.get(0).getCardRank();
					break;
				case 1:
					Kickers.add(myHand.get(0));
					Kickers.add(myHand.get(3));
					Kickers.add(myHand.get(4));
					this.HiHand = myHand.get(1).getCardRank();
					break;
				case 2:
					Kickers.add(myHand.get(0));
					Kickers.add(myHand.get(1));
					Kickers.add(myHand.get(4));
					this.HiHand = myHand.get(2).getCardRank();
					break;
				case 3:
					Kickers.add(myHand.get(0));
					Kickers.add(myHand.get(1));
					Kickers.add(myHand.get(2));
					this.HiHand = myHand.get(3).getCardRank();
					break;
				}
			}
		}
		return bool;
	}
	
	//3. 2 pairs
	public boolean is2Pairs() {
		boolean bool = false;
		Collections.sort(myHand, Hand.COMPARE_BY_RANK);
		if ((myHand.get(0).getCardRank() == myHand.get(1).getCardRank())
				&& (myHand.get(2).getCardRank() == myHand.get(3).getCardRank())) {
			bool = true;
			Kickers.add(myHand.get(4));
			this.HiHand = myHand.get(2).getCardRank();
			this.LoHand = myHand.get(0).getCardRank();
		} else if ((myHand.get(0).getCardRank() == myHand.get(1).getCardRank())
				&& (myHand.get(3).getCardRank() == myHand.get(4).getCardRank())) {
			bool = true;
			Kickers.add(myHand.get(2));
			this.HiHand = myHand.get(4).getCardRank();
			this.LoHand = myHand.get(0).getCardRank();
		} else if ((myHand.get(1).getCardRank() == myHand.get(2).getCardRank())
				&& (myHand.get(3).getCardRank() == myHand.get(4).getCardRank())) {
			bool = true;
			Kickers.add(myHand.get(0));
			this.HiHand = myHand.get(4).getCardRank();
			this.LoHand = myHand.get(1).getCardRank();
		}
		return bool;
	}

	//Comparator for sorting array of hands
	public static Comparator<Hand> COMPARE_BY_STRENGTH = new Comparator<Hand>() {
	    public int compare(Hand hand1, Hand hand2) {
	    return Integer.valueOf(hand1.getHandStrength()).compareTo(hand2.getHandStrength()); //ascending sort
	    }
	};
	
	
	
	
}

