package org.implementations.linkedlist;

public class DoublyLinkedList<T> {
	private static class Node<T> {
		T item;
		Node<T> next;
		Node<T> previous;

		Node(T element) {
			this.item = element;
		}
	}

	Node<T> head;
	Node<T> tail;

	public void addData(T data) {
		var dataNode = new Node<>(data);
		if (this.head == null) {
			this.head = dataNode;
			this.tail = dataNode;
		} else {
			tail = dataNode;
			Node<T> newNode = this.head;
			while (newNode.next != null) {
				newNode = newNode.next;
			}
			var previousNode = newNode;
			newNode.next = dataNode;
			dataNode.previous = previousNode;
		}
	}

	public T getTailNodeItem() {

		return this.tail.item;
	}

	public String print() {
		StringBuilder stringBuilder = new StringBuilder();
		if (this.head != null) {
			Node<T> nodeData = this.head;
			stringBuilder.append(nodeData.item).append(" ");
			while (nodeData.next != null) {
				nodeData = nodeData.next;
				stringBuilder.append(nodeData.item).append(" ");
			}

		}
		return stringBuilder.toString();
	}

}
