package com.stack;

public class StackUsingArray {

	private static final int MAX_SIZE = 10;
	private int arr[] = new int[MAX_SIZE]; // Stack array
	private int top = -1; // Stack top index

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		System.out.println(stack.size());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.topElement());
		System.out.println(stack.size());
		
	}

	// Push operation
	public void push(int x) {
		if (top >= MAX_SIZE - 1) { // Stack overflow check
			System.out.println("Stack Overflow!");
			return;
		}
		arr[++top] = x;
	}

	// Pop operation
	public int pop() {
		if (top == -1) { // Stack underflow check
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top--];
	}

	// Get the top element
	public int topElement() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top];
	}

	// Get stack size
	public int size() {
		return top + 1;
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
}
