package pokerBase;
 

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

//Card Test
public class JUnit_testTest {
	
   Card card = new Card(3);
   
   @Test
   public void test_Card() {

	assertEquals(card.getCardNbr(),3);
	assertEquals(card.getCardSuit(), 0);
	assertEquals(card.getCardRank(), 3);
   }
   
// Deck Test
   
   Deck deck= new Deck();
   
   @Test
   public void test_Deck(){
	   assertEquals(deck.getDeckSize(),52);
	   deck.DrawCard();
	   assertEquals(deck.getDeckSize(),51 );
	   
   }  
//Hand Test
   
   
 //No Pair
   
   Hand hand= new Hand(new Card(0, 2), new Card(1,7 ), new Card(2,9), new Card(1, 0), new Card(4,3));

   @Test
   public void test_noPair(){
	   assertEquals(hand.getHandStrength(),0);
	   assertEquals(hand.getHiHand(),9 );
   }
 //1 pair
   
   Hand hand1= new Hand(new Card(0, 2), new Card(1,2 ), new Card(2,3), new Card(1, 4), new Card(4,9));

   @Test
   public void test_onepair(){
	   assertEquals(hand1.getHandStrength(),20);
	   assertEquals(hand1.getHiHand(), 2);
	     
   
   }
//2 pair
	   Hand hand2= new Hand(new Card(0, 2), new Card(1,2 ), new Card(2,3), new Card(1, 3), new Card(4,9));

	   @Test
	   public void test_twopair(){
		   assertEquals(hand2.getHandStrength(),30);
		   assertEquals(hand2.getHiHand(), 3 );
		   assertEquals(hand2.getLoHand(),2);
	   }
//3 of a kind
	   Hand hand3= new Hand(new Card(0, 2), new Card(1,2 ), new Card(2,2), new Card(1, 3), new Card(4,9));

	   @Test
	   public void test_three(){
		   assertEquals(hand3.getHandStrength(),40);
		   assertEquals(hand3.getHiHand(), 2 );
	   }
	   
//Straight
	   Hand hand4= new Hand(new Card(0, 1), new Card(1,2 ), new Card(2,3), new Card(1, 4), new Card(4,5));

	   @Test
	   public void test_Straight(){
		   assertEquals(hand4.getHandStrength(),50);
		   assertEquals(hand4.getHiHand(), 5 );
		  
	   }
//Flush
	   Hand hand5= new Hand(new Card(0, 2), new Card(0,1 ), new Card(0, 9), new Card(0, 5), new Card(0,8));

	   @Test
	   public void test_Flush(){
		   assertEquals(hand5.getHandStrength(),60);
		   assertEquals(hand5.getHiHand(),9 );

	   }
//Full House
	   Hand hand6= new Hand(new Card(0, 2), new Card(1,2 ), new Card(2,2), new Card(1, 3), new Card(4,3));

	   @Test
	   public void test_fullHouse(){
		   assertEquals(hand6.getHandStrength(),70);
		   assertEquals(hand6.getHiHand(), 2);
		   assertEquals(hand6.getLoHand(),3);
	   
	   
}

//Four Kind
	   Hand hand7= new Hand(new Card(0, 2), new Card(1,2 ), new Card(2,2), new Card(1, 2), new Card(4,9));

	   @Test
	   public void test_FourKind(){
		   assertEquals(hand7.getHandStrength(),80);
		   assertEquals(hand7.getHiHand(), 2 );


}


//Straight Flush
	   Hand hand8= new Hand(new Card(0, 1), new Card(0,2 ), new Card(0,3), new Card(0, 4), new Card(0,5));

	   @Test
	   public void test_StraightFlush(){
		   assertEquals(hand8.getHandStrength(),90);
		   assertEquals(hand8.getHiHand(), 5 );



}

//Royal Flush
	   Hand hand9= new Hand(new Card(0, 12), new Card(0,11 ), new Card(0,10), new Card(0, 9), new Card(0,8));

	   @Test
	   public void test_RoyalFlush(){ 
		   assertEquals(hand9.getHandStrength(),100);
		   assertEquals(hand9.getHiHand(), 12 );


}
		   
   }

