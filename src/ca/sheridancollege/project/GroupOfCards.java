package ca.sheridancollege.project;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards {

	private int size;

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * the size of the grouping
	 * @param givenSize
	 */
	public GroupOfCards(int givenSize) {
		// TODO - implement GroupOfCards.GroupOfCards
		throw new UnsupportedOperationException();
	}

	/**
	 * A method that will get the group of cards as an ArrayList
	 * @return the group of cards.
	 */
	public java.util.ArrayList<Card> showCards() {
		// TODO - implement GroupOfCards.showCards
		throw new UnsupportedOperationException();
	}

	public void shuffle() {
		// TODO - implement GroupOfCards.shuffle
		throw new UnsupportedOperationException();
	}

}