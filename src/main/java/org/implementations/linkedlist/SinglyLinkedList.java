package org.implementations.linkedlist;

public class SinglyLinkedList<T> {
	Node<T> node;

	SinglyLinkedList() {

	}

	SinglyLinkedList(T data) {
		node = new Node<>(data);
	}

	public void addData(T data) {
		var dataNode = new Node<>(data);
		if (this.node == null) {
			this.node = dataNode;
		} else {
			Node<T> newNode = this.node;
			while (newNode.next != null) {
				newNode = newNode.next ;
			}
			newNode.next = dataNode;
		}
	}

	public String print() {
		StringBuilder stringBuilder = new StringBuilder();
		if (this.node != null) {
			Node<T> nodeData = this.node;
			stringBuilder.append(nodeData.item).append(" ");
			while (nodeData.next != null) {
				nodeData = nodeData.next;
				stringBuilder.append(nodeData.item).append(" ");
			}

		}
		return stringBuilder.toString();
	}

	private static class Node<T> {
		T item;
		Node<T> next;

		Node(T element) {
			this.item = element;
		}
	}
}
