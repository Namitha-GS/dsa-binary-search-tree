public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        if(root == null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        ArrayList<Integer> l = new ArrayList<>();
        while(!q.isEmpty()){
            Node front = q.poll();
            l.add(front.data);
            
            if(front.right != null){
                q.add(front.right);
            }
            if(front.left != null){
                q.add(front.left);
            }
        }
        
        Collections.reverse(l);
        return l;
    }
