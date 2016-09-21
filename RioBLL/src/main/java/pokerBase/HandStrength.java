package pokerBase;

public enum HandStrength {
	RoyalFlush (100),
	StraightFlush (90),
	FourKind (80),
	FullHouse (70),
	Flush (60),
	Straight (50),
	ThreeKind (40),
	TwoPair (30),
	OnePair (20),
	NoPair (0);
	
	private final int strength;

	private HandStrength(int strength){
		this.strength = strength;
	}
	public int getValue(){
		return strength;
	}
}