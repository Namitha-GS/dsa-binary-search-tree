package binary_search_tree;

public class DeleteANodeInBST {
	
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
	 
	 private Node removeNode(Node root, int val) {
		 if(root == null)
			 return null;
		 
		 if(root.key < val)
			 root.right = removeNode(root.right, val);
		 else if(root.key > val)
			 root.left = removeNode(root.left, val);
		 else {
			 // If node to be deleted is Leaf node
			 if(root.left == null && root.right == null)
				 return null;
			 
			 // If node to be deleted has single right child
			 else if(root.left == null)
				 return root.right;
			 
			// If node to be deleted has single left child
			 else if(root.right == null)
				 return root.left;
			 
			 // If node to be deleted has both left & right child
			 else {
				int rightmin = getRightMin(root.right);
				root.key = rightmin;
				root.right = removeNode(root.right, rightmin);
			 }
			 
		 }
		 return root;
	 }
	 
	 private static int getRightMin(Node root) {
		 Node temp = root;
		 while(temp.left != null) {
			 temp = temp.left;
		 }
		 return temp.key;
	 }

	public static void main(String[] args) {
		DeleteANodeInBST bst = new DeleteANodeInBST();
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 60);
		bst.root = bst.insert(bst.root, 200);
		bst.root = bst.insert(bst.root, 150);
		bst.root = bst.insert(bst.root, 250);
		bst.root = bst.insert(bst.root, 300);
		
		System.out.println("Before deleting: ");
		bst.inorder(bst.root);
		
		System.out.println("After deleting: ");
		bst.removeNode(bst.root, 250);
		bst.inorder(bst.root);
	}

}
