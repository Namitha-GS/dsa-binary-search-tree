void printLevelOrder(Node root)
{
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    
    while(!q.isEmpty()){
        Node front = q.poll();
        System.out.print(front.data+" ");
        
        if(front.left != null){
            q.add(front.left);
        }
        
        if(front.right != null){
            q.add(front.right);
        }
    }
}
