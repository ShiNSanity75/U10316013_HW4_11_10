class MyStack extends java.util.ArrayList<Object> {

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public int getSize() {
		return size();
	}

	public Object peek() {
		return get(getSize() - 1);
	}

	public Object pop() {
		Object o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}

	public Object push(Object o) {
		add(o);
		return o;
	}

	@Override
	public String toString() {
		return "stack: " + toString();
	}
}
