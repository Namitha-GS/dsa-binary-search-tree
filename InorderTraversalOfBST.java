package binary_search_tree;

public class InorderTraversalOfBST {
	
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
	 
	 private void inorder(Node root) {
		 if(root == null)
			 return;
		 
		 inorder(root.left);
		 System.out.print(root.key+" ");
		 inorder(root.right);
	 }
	 

	public static void main(String[] args) {
		InorderTraversalOfBST bst = new InorderTraversalOfBST();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 60);
		bst.root = bst.insert(bst.root, 200);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 300);
		
		System.out.println("Inorder traversal:");
		bst.inorder(bst.root);
	}

}
