int levelOrderSuccessor(Node root, int key)
{
    if(root == null){
        return -1;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    
    while(!q.isEmpty()){
        Node front = q.poll();
        
        if(front.left != null){
            q.add(front.left);
        }
        if(front.right != null){
            q.add(front.right);
        }
        if(front.data == key){
            break;
        }
    }
    Node successor = q.peek();
    return successor == null ? -1: successor.data;
    
}
