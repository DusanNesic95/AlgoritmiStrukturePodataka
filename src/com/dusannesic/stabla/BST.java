package com.dusannesic.stabla;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

	public Node root;
	
	public BST() {
		this.root = null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void inorder() {
		Stack stack = new Stack();
		Node current = root;
		while (current != null) {
			stack.push(current);
			current = current.getLeft();
		}
		while (stack.size() > 0) {
			current = (Node) stack.pop();
			System.out.println(current.getData());
			if (current.getRight() != null) {
				current = current.getRight();
				while (current != null) {
					stack.push(current);
					current = current.getRight();
				}
			}
		}
	}
	
	public int count() {
		int result = 0;
		Node current = root;
		while (current != null) {
			result += current.getData();
			current = current.getLeft();
		}
		current = root.getRight();
		while (current != null) {
			result += current.getData();
			current = current.getRight();
		}
		return result;
	}
	
	public int product() {
		Node current = root;
		int leftMin = current.getData();
		while (current != null) {
			int currentData = current.getData();
			if (currentData < leftMin) {
				leftMin = currentData;
			}
			current = current.getLeft();
		}
		current = root.getRight();
		int rightMax = current.getData();
		while (current != null) {
			int currentData = current.getData();
			if (currentData > rightMax) {
				rightMax = currentData;
			}
			current = current.getRight();
		}
		return leftMin * rightMax;
	}
	
	public void balanceRight() {
		Node oldRoot = root;
		if (root.getLeft() != null) {
			oldRoot.setLeft(root.getLeft());		  
		}
		if (root.getRight() != null) {
			root = root.getRight();	  
		}
		if (root.getLeft() != null) {
			oldRoot.setRight(root.getRight());	  
		}
	}
	
	public boolean find(int id) {
		Node current = root;
		while (current != null) {
			if (current.getData() == id) {
				return true;
			} else if (current.getData() < id) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}
		return false;
	}
	
	public boolean delete(int id) {
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while (current.getData() != id) {
			parent = current;
			if (current.getData() < id) {
				isLeftChild = true;
				current = current.getLeft();
			} else {
				isLeftChild = false;
				current = current.getRight();
			}
			if (current == null) {
				return false;
			}
		}
		if (current.getLeft() == null && current.getRight() == null) {
			if (current == root) {
				root = null;
			}
			if (isLeftChild) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
		} else if (current.getRight() == null) {
			if (current == root) {
				root = current.getLeft();
			} else if (isLeftChild) {
				parent.setLeft(current.getLeft());
			} else {
				parent.setRight(current.getLeft());
			}
		} else if (current.getLeft() == null) {
			if (current == root) {
				root = current.getRight();
			} else if (isLeftChild) {
				parent.setLeft(current.getRight());
			} else {
				parent.setRight(current.getRight());
			}
		} else if (current.getLeft() != null && current.getRight() != null) {
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.setLeft(successor);
			} else {
				parent.setRight(successor);
			}
			successor.setLeft(current.getLeft());
		}
		return true;
	}
	
	public Node getSuccessor(Node deleteNode) {
		Node successor = null;
		Node successorParent = null;
		Node current = deleteNode.getRight();
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.getLeft();
		}
		if (successor != deleteNode.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(deleteNode.getRight());
		}
		return successor;
	}
	
	public void insert(int id) {
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (id < current.getData()) {
				current = current.getLeft();
				if (current == null) {
					parent.setLeft(newNode);
					return;
				}
			} else {
				current = current.getRight();
				if (current == null) {
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	
	public void display(Node root) {
		if (root != null) {
			display(root.getLeft());
			System.out.println(" " + root.getData());
			display(root.getRight());
		}
	}
	
	public void bfs() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.getData());
			if (tempNode.getLeft() != null) {
				queue.add(tempNode.getLeft());
			}
			if (tempNode.getRight() != null) {
				queue.add(tempNode.getRight());
			}
		}
	}
}
