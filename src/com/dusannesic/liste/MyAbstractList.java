package com.dusannesic.liste;

@SuppressWarnings("rawtypes")
public abstract class MyAbstractList implements MyList {

	protected int size;
	
	protected MyAbstractList() {}
	
	protected MyAbstractList(Object[] objects) {
		for (int i = 0; i < objects.length; i++) {
			this.add(objects[i]);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void add(Object e) {
		add(size, e);
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(Object e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		}
		
		return false;
	}

	@Override
	public int size() {
		return size;
	}

}
