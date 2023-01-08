package giua_ki.iterator;

public class MyArrayIterator implements Iterator {
	private String[] items;
	private int position;
 
	public MyArrayIterator(String[] items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		/* TODO */
		if (hasNext()) {
			position++;
			return items[this.position++];
		}
		return null;
	}
 
	public boolean hasNext() {
		/* TODO */
		return position<items.length;
	}
}
