public class NoNullArrayList<T> extends ArrayList<T> {

	public boolean add(T element) {
		if (element == null)
			throw new IllegalArgumentException("Null values not allowed");
		else{
			this.add(element);
		}
	}

	public void add(int index, T element) {
		if (element == null)
			throw new IllegalArgumentException("Null values not allowed");
		else {
			this.add(index, element);
		}
	}

}
