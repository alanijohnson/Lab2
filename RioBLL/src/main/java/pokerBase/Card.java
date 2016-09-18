package pokerBase;

import java.util.Comparator;

public class Card {
 private int iCardNmbr;
 private int iCardSuit;
 private int iCardRank;
 
public Card(int iCardNmbr) {
	this.iCardNmbr = iCardNmbr;
	this.iCardSuit = iCardNmbr / 13;
	this.iCardRank = iCardNmbr % 13;
}

public int getCardNbr(){
	return iCardNmbr;
}

public int getCardSuit(){
	return iCardSuit;
}

public int getCardRank(){
	return iCardRank;
}

    
    
    
}