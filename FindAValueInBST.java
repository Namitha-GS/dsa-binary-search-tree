package binary_search_tree;

public class FindAValueInBST {
	
	static class Node {
		Node left;
		int key;
		Node right;
		Node(int val){
			key = val;
			left = null;
			right = null;
		}
	 }
	 
	 Node root = null;
	 
	 private Node insert(Node root, int val) {
		 if(root == null)
			 return new Node(val);
		 else if(root.key < val) 
			 root.right = insert(root.right, val);
		 else if(root.key > val)
			 root.left = insert(root.left, val);
		 
		 return root;
	 }
	 
	 private boolean search(Node root, int val) {
		 if(root == null)
			 return false;
		 
		 if(root.key == val)
			 return true;
		 
		 if(root.key < val)
			 return search(root.right, val);
		 else
			 return search(root.left, val);
	 }

	public static void main(String[] args) {
		FindAValueInBST bst = new FindAValueInBST();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 60);
		bst.root = bst.insert(bst.root, 200);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 300);
		
		System.out.println("Searching 300: ");
		if(bst.search(bst.root, 300))
			System.out.println("300 found");
		else
			System.out.println("300 not found");
		
		
		System.out.println("Searching 500: ");
		if(bst.search(bst.root, 500))
			System.out.println("500 found");
		else
			System.out.println("500 not found");
	}

}
