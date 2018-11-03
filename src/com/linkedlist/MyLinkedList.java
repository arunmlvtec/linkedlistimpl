package com.linkedlist;

import com.node.Node;

public class MyLinkedList<T> {
	Node<T> start;
	Node<T> end;
	Integer size;
	
	public Node<T> getStart() {
		return start;
	}
	public void setStart(Node<T> start) {
		this.start = start;
	}
	public Node<T> getEnd() {
		return end;
	}
	public void setEnd(Node<T> end) {
		this.end = end;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
}