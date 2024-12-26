package org.implementations.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
		singlyLinkedList.addData(2);
		singlyLinkedList.addData(5);
		singlyLinkedList.addData(4);
		System.out.println(singlyLinkedList.print());

		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
		doublyLinkedList.addData(2);
		doublyLinkedList.addData(5);
		doublyLinkedList.addData(5);
		doublyLinkedList.addData(4);
		doublyLinkedList.addData(5);
		doublyLinkedList.addData(1);
		System.out.println(doublyLinkedList.getTailNodeItem());
		System.out.println(doublyLinkedList.print());

	}

}
