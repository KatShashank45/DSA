package com.LinkedList;

public class ArrayToList {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 8, 1, 1, 0, 0 };

		Node head = convertArrToLL(arr);

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	private static Node convertArrToLL(int arr[]) {

		Node head = new Node(arr[0], null);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i], null);

			mover.next = temp;
			mover = temp;
		}

		return head;

	}
}