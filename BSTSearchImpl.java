package binary_search_tree;

public class BSTSearchImpl {
	
	static class Node {
		int key;
		Node left;
		Node right;
		
		Node(int val) {
			key = val;
			left = null;
			right = null;
		}
	}
	
	private Node insert(Node root, int val) {
		if(root == null)
			return new Node(val);
		
		else if(root.key < val)
			root.right = insert(root.right, val);
		
		else if(root.key > val)
			root.left = insert(root.left, val);
		
		return root;
	}
	
	private boolean search(Node root, int key) {
		if(root == null)
			return false;
		
		if(root.key == key)
			return true;
		
		if(root.key < key)
			return search(root.right, key);
		else
			return search(root.left, key);
	}

	Node root = null;
	public static void main(String[] args) {
		BSTSearchImpl bst = new BSTSearchImpl();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 125);
		
		System.out.println("Searching 50: ");
		if(bst.search(bst.root, 50))
			System.out.println("50 found");
		else
			System.out.println("50 Not found");
		
		System.out.println("Searching 500: ");
		if(bst.search(bst.root, 500))
			System.out.println("500 found");
		else
			System.out.println("500 Not found");
	}

}
