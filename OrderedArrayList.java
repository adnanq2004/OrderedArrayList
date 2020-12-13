public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	public boolean add(T element) {
		int place = 0;
		for (int i = 0; i < this.size() && place == 0; i++) {
			if (this.get(i).compareTo(element) > 0) {
				place = i;
			}
		}
		super.add(place, element);
		return true;
	}

}
