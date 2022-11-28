package binary_search_tree;

public class BSTRemoveNode {
	
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
	
	private Node removeNode(Node root, int val) {
		if(root == null)
			return null;
		
		if(root.key < val)
			root.right = removeNode(root.right, val);
		else if(root.key > val)
			root.left = removeNode(root.left, val);
		else {
			if(root.left == null && root.right == null)
				return null;
			else if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else {
				int rightMin = getRightMin(root.right);
				root.key = rightMin;
				root.right = removeNode(root.right, rightMin);
			}
		}
		return root;
	}
	
	private int getRightMin(Node root) {
		Node temp = root;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp.key;
	}
	
    Node root = null;
	public static void main(String[] args) {
		BSTRemoveNode bst = new BSTRemoveNode();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 60);
		bst.root = bst.insert(bst.root, 200);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 250);
		bst.root = bst.insert(bst.root, 300);
		
//		System.out.println("Deleting 10");
//		bst.root = bst.removeNode(bst.root, 10);
//		bst.inorder(bst.root);	
		
//		System.out.println("Deleting 200");
//		bst.root = bst.removeNode(bst.root, 200);
//		bst.inorder(bst.root);
		
		System.out.println("Deleting 300");
		bst.root = bst.removeNode(bst.root, 300);
		bst.inorder(bst.root);
	}

}
