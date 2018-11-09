package com.linkedlist;

import java.util.Collection;

import com.customexception.IncorrectIndexException;
import com.node.Node;

public class MyLinkedList<E> {
	private Node<E> start;
	private Node<E> end;
	private Integer size;

	public Node<E> getStart() {
		return start;
	}

	public void setStart(Node<E> start) {
		this.start = start;
	}

	public Node<E> getEnd() {
		return end;
	}

	public void setEnd(Node<E> end) {
		this.end = end;
	}

	public Integer getSize() {
		return size;
	}

	public void add(E e) {
		Node<E> element = new Node<E>();
		element.setValue(e);
		element.setNext(null);
		end.setNext(element);
		end = element;
		if (start == null)
			start = element;
		size += 1;
	}

	public void add(int index, E e) {
		if (size < (index + 1)) {
			try {
				throw new IncorrectIndexException("Incorrect Index entered.");
			} catch (IncorrectIndexException e1) {
				System.out.println(e1.getMessage() + " Adding element at the end of the LinkedList!");
				add(e);
			}
		} else {
			Node<E> element = new Node<E>();
			element.setValue(e);
			Node<E> current = start;

			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}

			element.setNext(current.getNext());
			current.setNext(element);
			size += 1;
		}
	}

	public void addAll(Collection<E> c) {
		for (E e : c) {
			add(e);
		}
	}

	public void addAll(int index, Collection<E> c) {
		for (E e : c) {
			add(index, e);
			index += 1;
		}
	}

	public void addFirst(E e) {
		Node<E> element = new Node<E>();
		element.setValue(e);
		element.setNext(start);
		start = element;
		size += 1;
		if (end == null)
			end = element;
	}

	public void addLast(E e) {
		Node<E> element = new Node<E>();
		element.setValue(e);
		element.setNext(null);
		end.setNext(element);
		end = element;
		size += 1;
		if (start == null)
			start = element;
	}

	public void clear() {
		start = null;
		end = null;
		size = 0;
	}
	
	public E get(int index) {
		if (size < index) {
			try {
				throw new IncorrectIndexException("Incorrect Index passed!");
			} catch (IncorrectIndexException e) {
				System.out.println(e.getMessage() + "LinkedList size is: "+size);
			}
			return null;
		}
		else {
			Node<E> current = start;
			int i = 1;
			while (i < index) {
				current = current.getNext();
				i += 1;
			}
			return current.getValue();
		}
	}
	
	public int indexOf(E element) {
		Node<E> current = start;
		int index = 0;
		while (current.getNext()!= null) {
			if (current.getValue() == element)
				return index;
			index++;
		}
		return -1;
		
	}
}
