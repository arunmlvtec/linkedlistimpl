package com.node;


import org.junit.Assert;
import org.junit.Test;

import com.node.Node;


public class NodeTest {
	
	public Node<Integer> generateNode(Integer value) {
		Node<Integer> node = new Node<Integer>();
		node.setValue(value);
		node.setNext(null);
		return node;
	}
	
	@Test
	public void testGetValue() {
		NodeTest nodeTest = new NodeTest();
		Integer value = 10;
		Integer valNE = 0;
		Assert.assertEquals(value, nodeTest.generateNode(value).getValue());
		Assert.assertNotEquals(valNE, nodeTest.generateNode(value).getValue());
	}
	
	@Test
	public void testGetNext() {
		//NodeTest nodeTest = new NodeTest();
		
		Integer value = 10;
		Node<Integer> node = this.generateNode(value);
		
		Integer valNE = 0;
		Node<Integer> nextNode = this.generateNode(valNE);
		
		node.setNext(nextNode);
		
		Assert.assertNotEquals(null, node.getNext());
		Assert.assertEquals(nextNode, node.getNext());
		Assert.assertEquals(null, nextNode.getNext());
	}
}
