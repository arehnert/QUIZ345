package pkgCore;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Card {

	private eRank eRank;
	private eSuit eSuit;

	public Card(pkgEnum.eRank eRank, pkgEnum.eSuit eSuit) { 
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}

	public eRank geteRank() {
		return eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	public int compareTo(Object o) {
		Card c = (Card) o;
		//return 0;
		return c.geteRank().compareTo(this.geteRank());		
	}	
}
