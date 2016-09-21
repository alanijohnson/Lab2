package pokerBase;

public enum CardRank {
	Ace (12),
	King (11),
	Queen (10),
	Jack (9),
	Ten (8),
	Nine (7),
	Eight (6),
	Seven (5),
	Six (4),
	Five (3),
	Four (2),
	Three (1),
	Two (0);
	
	private final int rank;

	private CardRank(int rank){
		this.rank = rank;
	}
	
	public int getValue(){
		return rank;
	}
	
}