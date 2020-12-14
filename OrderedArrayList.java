public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	public OrderedArrayList() {
		super();
	}

	public OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	public boolean add(T element) {
		int place = -1000;
		for (int i = 0; i < this.size() && place == -1000; i++) {
			if (this.get(i).compareTo(element) > 0) {
				place = i;
			}
		}
		if (place == -1000) {
			super.add(element);
		}
		else {
			super.add(place, element);
		}
		return true;
	}

	public T set(int index, T value) {
		T val = this.get(index);
		this.remove(index);
		this.add(value);
		return val;
	}

}
