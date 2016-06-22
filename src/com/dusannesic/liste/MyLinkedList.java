package com.dusannesic.liste;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList {

	private Node<E> head, tail;
	
	public MyLinkedList() {}
	
	public MyLinkedList(E[] objects) {
		super(objects);
	}
	
	public E getFirst() {
		if (size == 0) {
			return null;
		}
		
		return head.element;
	}
	
	public E getLast() {
		if (size == 0) {
			return null;
		}
		
		return tail.element;
	}
	
	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e);
		newNode.next = head;
		head = newNode;
		size++;
		
		if (tail == null) {
			tail = head;
		}
	}
	
	public void addLast(E e) {
		Node<E> newNode = new Node<E>(e);
		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = tail.next;
		}
		
		size++;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void add(int index, Object e) {
		if (index == 0) {
			addFirst((E) e);
		} else if (index >= size) {
			addLast((E) e);
		} else {
			Node<E> current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;
			}
			Node<E> temp = current.next;
			current.next = new Node<E>((E) e);
			(current.next).next = temp;
			size++;
		}
	}
	
	public E removeFirst() {
		if (size == 0) {
			return null;
		} else {
			Node<E> temp = head;
			head = head.next;
			size--;
			if (head == null) {
				tail = null;
			}
			
			return temp.element;
		}
	}
	
	public E removeLast() {
		if (size == 0) {
			return null;
		} else if (size == 1) {
			Node<E> temp = head;
			head = tail = null;
			size = 0;
			return temp.element;
		} else {
			Node<E> current = head;
			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}
			Node<E> temp = tail;
			tail = current;
			size--;
			return temp.element;
		}
	}

	@Override
	public void clear() {
		size = 0;
		head = tail = null;
	}

	@Override
	public boolean contains(Object e) {
		if (e == null) {
			throw new RuntimeException("Incorect input!");
		} else {
			if (size == 0) {
				return false;
			} else {
				Node<E> current = head;
				for (int i = 0; i < size; i++) {
					if (current.element.equals(e)) {
						return true;
					} else {
						current = current.next;
					}
				}
			}
		}
		
		return false;
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index >= size) {
			return new IndexOutOfBoundsException("Index out of bounds");
		} else if (index == 0) {
			return head;
		} else {
			Node<E> current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current;
		}
	}

	@Override
	public int indexOf(Object e) {
		if (e == null) {
			throw new RuntimeException("Incorect input!");
		} else {
			if (size == 0) {
				return -1;
			} else {
				Node<E> current = head;
				for (int i = 0; i < size; i++) {
					if (current.element.equals(e)) {
						return i;
					} else {
						current = current.next;
					}
				}
			}
		}
		
		return -1;
	}

	@Override
	public int lastIndexOf(Object e) {
		if (e == null) {
			throw new RuntimeException("Incorect input!");
		} else {
			if (size == 0) {
				return -1;
			} else {
				Node<E> current = head;
				for (int i = size; i > 0; i--) {
					if (current.element.equals(e)) {
						return size-i;
					} else {
						current = current.next;
					}
				}
			}
		}
		
		return -1;
	}

	@Override
	public Object remove(int index) {
		if (index < 0 || index >= size) {
			return new IndexOutOfBoundsException("Index out of bounds");
		} else if (index == 0) {
			return removeFirst();
		} else if (index == size - 1) {
			return removeLast();
		} else {
			Node<E> previous = head;
			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}
			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != null) {
				result.append(", ");
			} else {
				result.append("]");
			}
		}
		
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(int index, Object e) {
		if (index < 0 || index >= size) {
			return new IndexOutOfBoundsException("Index out of bounds");
		} else if (index == 0) {
			head.element = (E) e;
			return head;
		} else {
			Node<E> current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			current.element = (E) e;
			return current;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<E> {
		private Node<E> current = head;
		
		@Override
		public boolean hasNext() {
			return (current != null);
		}
		
		@Override
		public E next() {
			E e = current.element;
			current = current.next;
			return e;
		}
		
		@Override
		public void remove() {
			MyLinkedList.this.remove(current);
		}
	}
	
	@SuppressWarnings("hiding")
	private class Node<E> {
		E element;
		Node<E> next;
		
		public Node(E element) {
			this.element =  element;
		}
	}
	
}
