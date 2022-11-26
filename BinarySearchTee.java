package binary_search_tree;

public class BinarySearchTee {
	
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
	
	private void inorder(Node root) {
		if(root == null)
			return;
		
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}

	Node root = null;
	public static void main(String[] args) {
		BinarySearchTee bst = new BinarySearchTee();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 60);
		bst.root = bst.insert(bst.root, 200);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 300);
		
		System.out.print("Inorder Traversal : ");
		bst.inorder(bst.root);
	}

}
